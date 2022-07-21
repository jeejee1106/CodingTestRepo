package baekjoon.greedy.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(val);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;
        }

        for (int v : arr) {
            System.out.println(v);
        }
    }

}