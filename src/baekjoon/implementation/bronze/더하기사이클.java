package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클 {
    public static void main(String[] args) throws IOException {
//        solution1();

        System.out.println(solution2(26)); //4
        System.out.println(solution2(55)); //3
        System.out.println(solution2(1)); //60
        System.out.println(solution2(0)); //1
        System.out.println(solution2(71)); //12
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = N;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (copy != N);

        System.out.println(cnt);
    }

    public static int solution2(int n) {
        int answer = 0;
        int number = n;

        while (true) {
            int left = number / 10;
            int right = number % 10;
            number = (right * 10 + (left + right) % 10);
            answer++;
            if (number == n) {
                break;
            }
        }

        return answer;
    }

}