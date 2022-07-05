package book.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 거스름돈 {
    public static void main(String[] args) {
        int n1 = 7410;
        int n2 = 4810;
        int n3 = 1920;
        int n4 = 8170;

        System.out.println(거스름돈.solution1(n1)); //19
        System.out.println(거스름돈.solution1(n2)); //13
        System.out.println(거스름돈.solution1(n3)); //9
        System.out.println(거스름돈.solution1(n4)); //20

    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) { //내 풀이
        int answer = 0;
        //1. 동전배열 만들기(큰 값부터)
        int[] coins = {500, 100, 50, 10};

        //2. 큰 동전부터 반복문 돌리기
        for (int i = 0; i < 4; i++) {
            int coin = coins[i]; //동전이 순서대로 들어옴
            answer += n / coin; //answer에 금액을 동전으로 나눈 몫 계속 더해주기
            n %= coin; //금액은 특정 동전으로 나눈 나머지 값을 저장함
        }
        return answer;
    }

}