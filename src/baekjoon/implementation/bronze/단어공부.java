package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String upperStr = str.toUpperCase(); //입력받은 문자열을 전부 대문자로 바꾸기
        char answer = ' ';
        int max = 0;
        int[] count = new int[26];

        //문자열을 하나하나 검사
        for (int i = 0; i < upperStr.length(); i++) {
            int n = upperStr.charAt(i) -65; //각 자리의 문자를 아스키 코드로 변경
            count[n]++; //알파벳이 몇개씩 들어가는지 카운트
        }

        //count배열을 돌려서 제일 값이 큰 인덱스 찾기
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = (char) (i + 65); //값이 가장 큰 인덱스에 65를 더하면 최고 많이 등장한 문자를 알 수 있다.
            } else if (count[i] == max) { //max값이 여러개면 물음표 반환
                answer = '?';
            }
        }
        System.out.println(answer);
    }

}