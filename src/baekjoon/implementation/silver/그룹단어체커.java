package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

public class 그룹단어체커 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(Scanner로 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strCouont = Integer.parseInt(br.readLine()); //3
        int answer = 0;
        for (int i = 0; i < strCouont; i++) {
            String str = br.readLine();

            HashMap<Character, Integer> map = new HashMap<>();
            map.put(str.charAt(0), 1);
            for(int j = 1; j < str.length(); j++){
                char now = str.charAt(j); //현재 문자
                char prev = str.charAt(j - 1); //이전 인덱스의 문자
                //happy
                map.put(now, map.getOrDefault(now, 0) + 1);
                if (map.get(now) > 1) {
                    if (now != prev) {
                        break;
                    }
                }
            }
        }
        System.out.println(answer);


    }
}