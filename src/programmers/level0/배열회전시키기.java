package programmers.level0;

import java.util.Arrays;

public class 배열회전시키기 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        String direction1 = "right";

        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";

        System.out.println(Arrays.toString(배열회전시키기.solution1(numbers1, direction1))); //[5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(배열회전시키기.solution1(numbers2, direction2))); //[2, 1, 1, 1, 1, 1]
    }

    /////////////////[solution 시작]/////////////////
    //평균 속도 0.02ms
    public static int[] solution1(int[] numbers, String direction) {
        int arrLength = numbers.length;
        int[] answer = new int[arrLength];

        for (int i = 1; i < arrLength; i++) {
            if (direction.equals("right")) {
                answer[0] = numbers[arrLength - 1];
                answer[i] = numbers[i - 1];
            } else {
                answer[i - 1] = numbers[i];
                answer[arrLength - 1] = numbers[0];
            }
        }

        return answer;
    }
}
