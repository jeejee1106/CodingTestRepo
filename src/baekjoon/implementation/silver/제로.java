package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 제로 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //몇 개의 정수를 받을 것인가
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) { //들어온 정수가 0이 아니면
                list.add(n); //리스트에 추가하고
            } else { //들어온 정수가 0이라면
                list.remove(list.size() - 1); //제일 마지막 index에 해당하는 값 삭제
            }
        }
        for (int i : list) {
            sum += i; //list에 들어온 수의 합
        }

        System.out.println(sum);
    }
}