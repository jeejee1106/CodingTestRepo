package programmers.level0;

import java.util.Arrays;

public class 문자열정렬하기 {
    public static void main(String[] args) {
        String my_string1 = "Bcad";
        String my_string2 = "heLLo";
        String my_string3 = "Python";

        System.out.println(문자열정렬하기.solution1(my_string1)); //abcd
        System.out.println(문자열정렬하기.solution1(my_string2)); //ehllo
        System.out.println(문자열정렬하기.solution1(my_string3)); //hnopty
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String my_string) {
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);

        return String.join("", arr);
    }
}
