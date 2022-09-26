package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {

    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int crossCount = 1;
        int prevCountSum = 0;

        while (true) {
            if (X <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) {
                    System.out.print((crossCount - (X - prevCountSum - 1)) + "/" + (X - prevCountSum));
                    break;
                } else {
                    System.out.print((X - prevCountSum) + "/" + (crossCount - (X - prevCountSum - 1)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }

    }
}