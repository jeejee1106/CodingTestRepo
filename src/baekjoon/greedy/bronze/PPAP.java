package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PPAP {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //문자열 길이 받기
        String s = br.readLine();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (n - i < 4) {
                break;
            }
            if (s.substring(i, i + 4).equals("pPAp")) {
                answer++;
                i += 3;
            }
        }
        System.out.println(answer);
    }
}