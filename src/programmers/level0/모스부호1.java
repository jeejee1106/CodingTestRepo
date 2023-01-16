package programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class 모스부호1 {
    public static void main(String[] args) {
        String letter1 = ".... . .-.. .-.. ---";
        String letter2 = ".--. -.-- - .... --- -.";

        System.out.println(모스부호1.solution1(letter1)); //hello
        System.out.println(모스부호1.solution1(letter2)); //python
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String letter) {
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f'," +
                "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l'," +
                "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r'," +
                "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x'," +
                "'-.--':'y','--..':'z'";

        String[] morseArr = morse.replace("'", "").split(",");
        Map<String, String> map = new HashMap<>();

        for (String s : morseArr) {
            String[] sArr = s.split(":");
            map.put(sArr[0], sArr[1]);
        }

        String[] letterArr = letter.split(" ");
        String answer = "";

        for (String s : letterArr) {
            answer += map.get(s);
        }

        return answer;
    }
}
