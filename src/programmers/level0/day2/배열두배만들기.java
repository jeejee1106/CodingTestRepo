package programmers.level0.day2;

import java.util.Arrays;

public class �迭�ι踸��� {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};

        System.out.println(Arrays.toString(�迭�ι踸���.solution1(numbers1))); //[2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(�迭�ι踸���.solution1(numbers2))); //[2, 4, 200, -198, 2, 4, 6]
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
