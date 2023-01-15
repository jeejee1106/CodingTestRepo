package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열정렬하기1 {
    public static void main(String[] args) {
        String my_string1 = "hi12392";
        String my_string2 = "p2o4i8gj2";
        String my_string3 = "abcde0";

        System.out.println(Arrays.toString(문자열정렬하기1.solution1(my_string1))); //[1, 2, 2, 3, 9]
        System.out.println(Arrays.toString(문자열정렬하기1.solution1(my_string2))); //[2, 2, 4, 8]
        System.out.println(Arrays.toString(문자열정렬하기1.solution1(my_string3))); //[0]
    }

    /////////////////[solution 시작]/////////////////
    //평균속도 7.0ms..
    public static int[] solution1(String my_string) {
        String[] arr = my_string.split("");
        List<Integer> list = new ArrayList<>();

        for (String s : arr) {
            for (int i = 0; i <= 9; i++) {
                if (s.equals("" + i)) {
                    list.add(Integer.parseInt(s));
                    break;
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    //평균속도 0.5ms..
    public static int[] solution2(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        int[] answer = new int[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);
        return answer;
    }
}
