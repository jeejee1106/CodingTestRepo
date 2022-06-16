package programmers.level1;

import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        System.out.println(Arrays.toString(모의고사.solution1(answers1))); // [1]
        System.out.println(Arrays.toString(모의고사.solution1(answers2))); // [1,2,3]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int[] answers) {
        int[] answer = {};
        return answer;
    }
}