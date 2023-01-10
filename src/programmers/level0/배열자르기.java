package programmers.level0;

import java.util.Arrays;

public class 배열자르기 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        int[] numbers2 = {1, 3, 5};
        int num11 = 1;
        int num22 = 2;

        int[] numbers3 = {1, 3, 5, 1000, 999, 32, 1, 45, 232, 552};
        int num111 = 0;
        int num222 = 7;

        int[] numbers4 = {1, 3, 5, 1000, 999, 32, 1, 45, 232, 552};
        int num1111 = 0;
        int num2222 = 9;

        int[] numbers5 = {1, 3, 5, 1000, 999, 32, 1, 45, 232, 552};
        int num11111 = 0;
        int num22222 = 1;

        int[] numbers6 = {1, 3, 5, 1000, 999, 32, 1, 45, 232, 552};
        int num111111 = 8;
        int num222222 = 9;

        System.out.println(Arrays.toString(배열자르기.solution1(numbers1, num1, num2))); //[2, 3, 3, 6]
        System.out.println(Arrays.toString(배열자르기.solution1(numbers2, num11, num22))); //[1, 4, 12]
        System.out.println(Arrays.toString(배열자르기.solution1(numbers3, num111, num222))); //[1, 3, 5, 1000, 999, 32, 1, 45]
        System.out.println(Arrays.toString(배열자르기.solution1(numbers4, num1111, num2222))); //[1, 3, 5, 1000, 999, 32, 1, 45, 232, 552]
        System.out.println(Arrays.toString(배열자르기.solution1(numbers5, num11111, num22222))); //[1, 3]
        System.out.println(Arrays.toString(배열자르기.solution1(numbers6, num111111, num222222))); //[232, 552]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;

        for (int i = num1; i <= num2; i++) {
//            answer[index] = numbers[i]; //내 코드
            answer[i - num1] = numbers[i]; //오홍 이런 생각을 난 왜 잘 못할까ㅜㅜ
//            index++; //내 코드
        }

        return answer;
    }

}
