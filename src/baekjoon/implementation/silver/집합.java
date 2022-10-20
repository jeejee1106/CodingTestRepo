package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 집합 {
    public static void main(String[] args) throws IOException {
        solution1(); //시간초과 떳다............
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //몇 개의 정수를 받을 것인가

        List<Integer> checkList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");

            if (split[0].equals("add")) {
                checkList.add(Integer.parseInt(split[1]));
            }

            if (split[0].equals("remove")) {
                checkList.remove(Integer.valueOf(split[1]));
            }

            if (split[0].equals("check")) {
                if (checkList.contains(Integer.valueOf(split[1]))) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            if (split[0].equals("toggle")) {
                if (checkList.contains(Integer.valueOf(split[1]))) {
                    checkList.remove(Integer.valueOf(split[1]));
                } else {
                    checkList.add(Integer.parseInt(split[1]));
                }
            }

            if (split[0].equals("all")) {
                checkList.clear();
                for (int j = 1; j <= 20; j++) {
                    checkList.add(j);
                }
            }

            if (split[0].equals("empty")) {
                checkList.clear();
            }
        }
    }
}