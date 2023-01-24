package programmers.level0;

import java.util.Arrays;

public class 잘라서배열로저장하기 {
    public static void main(String[] args) {
        String my_str1 = "abc1Addfggg4556b";
        int n1 = 6;
        String my_str2 = "abcdef123";
        int n2 = 3;

        System.out.println(Arrays.toString(잘라서배열로저장하기.solution1(my_str1, n1))); //["abc1Ad", "dfggg4", "556b"]
        System.out.println(Arrays.toString(잘라서배열로저장하기.solution1(my_str2, n2))); //["abc", "def", "123"]

        System.out.println(Arrays.toString(잘라서배열로저장하기.solution2(my_str1, n1))); //["abc1Ad", "dfggg4", "556b"]
        System.out.println(Arrays.toString(잘라서배열로저장하기.solution2(my_str2, n2))); //["abc", "def", "123"]
    }

    /////////////////[solution 시작]/////////////////
    public static String[] solution1(String my_str, int n) {
        return my_str.split("(?<=\\G.{" + n + "})");
    }

    public static String[] solution2(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }

}
