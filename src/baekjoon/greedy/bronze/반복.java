package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 반복 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받고 StringTokenizer로 쪼개기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        //아스키코드로 변환 후 뒷 문자가 현재 문자보다 크면 재입력 안해도됨. 그 다다음문자를 검사하면 됨

        int answer  = 1; //첫 문자는 무조건 입력을 받아야 하기 때문에 1로 초기화

        for (int i = 0; i < str.length() - 1; i++) {
            int now = str.charAt(i);
            int next = str.charAt(i + 1);

            if (next > now) {
                continue;
            } else {
                answer++;
            }
        }
        System.out.println(answer);
    }
}