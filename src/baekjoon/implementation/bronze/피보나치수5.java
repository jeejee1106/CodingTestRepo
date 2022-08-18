package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 피보나치수5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution1(n); //속도 : 124ms, 메모리 : 14112KB
        System.out.println(fibonacciSolution(n)); //속도 : 124ms, 메모리 : 14216KB
    }

    public static void solution1(int n) throws IOException {
        /**
         * 피보나치수열은 재귀함수의 예로 많이 쓰인다.
         * 이 문제도 재귀함수로 풀 수 있으나 solution1은 ArrayList와 for문을 사용하여 풀어보았다.
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 0; i <= n-2; i++) {
            list.add(list.get(i) + list.get(i + 1));
        }

        System.out.println(list.get(n));

    }

    public static int fibonacciSolution(int n) throws IOException {
        /**
         * 재귀함수를 사용한 피보나치 수열 구현
         */
        if(n<=1) {
            return n;
        }
        return fibonacciSolution(n-2) + fibonacciSolution(n-1);
    }

}