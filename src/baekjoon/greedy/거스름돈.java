package baekjoon.greedy;

import java.math.BigDecimal;
import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        int money1 = 380;
        int money2 = 1;
        int money3 = 541;

//        solution1();
        System.out.println(거스름돈.solution2(money1)); //4
        System.out.println(거스름돈.solution2(money2)); //15
        System.out.println(거스름돈.solution2(money3)); //10
    }

    public static void solution1() { //백준 방식 풀이
        Scanner in = new Scanner(System.in);
        int money = 1000 - in.nextInt();

        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int answer = 0;

        while (money > 0) {
            if (money / 500 != 0) {
                money -= 500;
                answer++;
            } else if (money / 100 != 0) {
                money -= 100;
                answer++;
            } else if (money / 50 != 0) {
                money -= 50;
                answer++;
            } else if (money / 10 != 0) {
                money -= 10;
                answer++;
            } else if (money / 5 != 0) {
                money -= 5;
                answer++;
            } else {
                money--;
                answer++;
            }
        }
        System.out.println("답 : " + answer);
        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
    }

    public static int solution2(int money) { // 그리디로 풀이
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int change = 1000 - money;
        int answer = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < coins.length; i++) {
            if (change / coins[i] != 0) {
                answer += change / coins[i];
                change %= coins[i];
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");

        return answer;
    }
}