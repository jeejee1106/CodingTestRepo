package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기4 {
    /**
     * 1년만에 별찍기를 한 것 같다... 너무 어렵다...
     * 미쳤다... 제발 분발하자 제발....하...
     */
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}