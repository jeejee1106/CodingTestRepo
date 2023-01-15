package programmers.level0;

import java.util.Arrays;

public class 최댓값만들기2 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, -3, 4, -5};
        int[] numbers2 = {0, -31, 24, 10, 1, 9};
        int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};
        int[] numbers4 = {-10000, 10000};
        int[] numbers5 = {-2, 2};
        int[] numbers6 = {5, 2};

        System.out.println(최댓값만들기2.solution1(numbers1)); //15
        System.out.println(최댓값만들기2.solution1(numbers2)); //240
        System.out.println(최댓값만들기2.solution1(numbers3)); //600
        System.out.println(최댓값만들기2.solution1(numbers4)); //600
        System.out.println(최댓값만들기2.solution1(numbers5)); //600
        System.out.println(최댓값만들기2.solution1(numbers6)); //600
    }

    /////////////////[solution 시작]/////////////////
    //평균속도 0.02ms
    public static int solution1(int[] numbers) {
        int answer = 0;

        if (numbers.length == 2) {
            answer = numbers[0] * numbers[1];
        } else {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (answer <  numbers[i] * numbers[j]) {
                        answer = numbers[i] * numbers[j];
                    }
                }
            }
        }
        return answer;
    }

    //평균속도 0.50ms
    public static int solution2(int[] numbers) {
        int length = numbers.length;
        Arrays.sort(numbers); //얘 시간 복잡도가 높다고(?) 알고있다.
        return Math.max(numbers[0] * numbers[1], numbers[length - 2] * numbers[length - 1]);
    }
}
