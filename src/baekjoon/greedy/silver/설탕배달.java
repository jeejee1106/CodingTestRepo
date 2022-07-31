package baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받고 StringTokenizer로 쪼개기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(br.readLine());

        if (kg == 4 || kg == 7) {
            System.out.println(-1);
        } else if (kg % 5 == 0) {
            System.out.println(kg / 5);
        } else if (kg % 5 == 1 || kg % 5 == 3) {
            System.out.println((kg / 5) + 1);
        } else if (kg % 5 == 2 || kg % 5 == 4) {
            System.out.println((kg / 5) + 2);
        }
    }
}