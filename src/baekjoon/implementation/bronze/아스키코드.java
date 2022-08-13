package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아스키코드 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. String으로 입력을 받는다.
        String str = br.readLine();

        //2. charAt메서드를 사용하면 char타입의 문자가 나온다.
        //3. char타입을 int타입에 넣어주면 아스키 코드로 출력이 된다.
        int ch = str.charAt(0);

        System.out.println(ch);

    }

}