package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 숫자 세개 입력 받아서 곱한 결과 저장
        int number = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        
        //2. 세 숫자의 곱을 String으로 타입 변환
        String strNum = String.valueOf(number);
        
        //3. 0~9의 갯수를 저장할 배열 선언
        int[] numArr = new int[10];

        //4. 배열의 인덱스에 해당하는 숫자가 있으면 count해주기
        for (int i = 0; i < strNum.length(); i++) {
            numArr[(strNum.charAt(i) - 48)]++;
        }

        //5. 출력
        for (int count : numArr) {
            System.out.println(count);
        }
    }

}