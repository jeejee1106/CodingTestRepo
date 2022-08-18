package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class �Ǻ���ġ��5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution1(n); //�ӵ� : 124ms, �޸� : 14112KB
        System.out.println(fibonacciSolution(n)); //�ӵ� : 124ms, �޸� : 14216KB
    }

    public static void solution1(int n) throws IOException {
        /**
         * �Ǻ���ġ������ ����Լ��� ���� ���� ���δ�.
         * �� ������ ����Լ��� Ǯ �� ������ solution1�� ArrayList�� for���� ����Ͽ� Ǯ��Ҵ�.
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
         * ����Լ��� ����� �Ǻ���ġ ���� ����
         */
        if(n<=1) {
            return n;
        }
        return fibonacciSolution(n-2) + fibonacciSolution(n-1);
    }

}