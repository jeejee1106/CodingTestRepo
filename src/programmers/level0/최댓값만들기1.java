package programmers.level0;

import java.util.Arrays;

public class ÃÖ´ñ°ª¸¸µé±â1 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {0, 31, 24, 10, 1, 9};

        System.out.println(ÃÖ´ñ°ª¸¸µé±â1.solution1(numbers1)); //20
        System.out.println(ÃÖ´ñ°ª¸¸µé±â1.solution1(numbers2)); //744

        System.out.println(ÃÖ´ñ°ª¸¸µé±â1.solution2(numbers1)); //20
        System.out.println(ÃÖ´ñ°ª¸¸µé±â1.solution2(numbers2)); //744
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    //Æò±Õ 0.4~0.5ms
    public static int solution1(int[] numbers) {
        Arrays.sort(numbers);
        int arrLength = numbers.length;
        return numbers[arrLength - 1] * numbers[arrLength - 2];
    }

    //Æò±Õ 0.01~0.02ms
    public static int solution2(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        return answer;
    }

}
