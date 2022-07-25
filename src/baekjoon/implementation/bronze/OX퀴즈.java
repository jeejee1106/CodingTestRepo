package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        solution1();
        System.out.println(solution2("OOXXOXXOOO")); //10
        System.out.println(solution2("OOXXOOXXOO")); //9
        System.out.println(solution2("OXOXOXOXOXOXOX")); //7
        System.out.println(solution2("OOOOOOOOOO")); //55
        System.out.println(solution2("OOOOXOOOOXOOOOX")); //30
    }

    /**
     * 백준 방식은.... 문제를 푸는 것 보다 입력받고 출력하는 게 더 어렵다ㅜㅜ
     */
    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int answer = 0;
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    answer += count;
                } else {
                    count = 0;
                }
            }
            sb.append(answer + "\n");
        }
        System.out.println(sb);
    }

    public static int solution2(String str) {
        int answer = 0; //답을 넣을 변수
        int count = 0; //연속된 답의 갯수

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'O') { //만약 답이 맞았으면
                count++; //연속된 답의 갯수(점수)를 1씩 늘려주고
                answer += count; //1씩 늘어난 값을 계속 answer에 더해준다.
            } else { //답이 틀렸다면
                count = 0; //연속된 답의 갯수를 다시 0으로 초기화
            }
        }
        return answer;
    }

}