package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어의개수 {
    public static void main(String[] args) throws IOException {
//        solution1();
        System.out.println(solution2("The Curious Case of Benjamin Button"));
        System.out.println(solution2("Infinite KSG JDW NWH LHW LSY KMS LSJ"));
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.print(st.countTokens());
    }

    public static int solution2(String str) {
        String[] strArr = str.split(" "); //split함수 : 문자열을 특정 문자를 기준으로 잘라서 배열에 넣어준다.
        return strArr.length;
    }

}