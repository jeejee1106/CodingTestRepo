package programmers.level0;

import java.util.*;

public class 중복된문자제거 {
    public static void main(String[] args) {
        String my_string1 = "people";
        String my_string2 = "We are the world";

        System.out.println(중복된문자제거.solution1(my_string1)); //peol
        System.out.println(중복된문자제거.solution1(my_string2)); //We arthwold

        System.out.println(중복된문자제거.solution2(my_string1)); //peol
        System.out.println(중복된문자제거.solution2(my_string2)); //We arthwold
    }

    /////////////////[solution 시작]/////////////////
    //평균 15.00ms 흠.. 이건 못쓰겠구먼..charAt은 되도록...안쓰는걸로..
    public static String solution1(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    //평균 0.8ms
    public static String solution2(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
