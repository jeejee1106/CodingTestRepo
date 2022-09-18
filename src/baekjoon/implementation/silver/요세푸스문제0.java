package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 요세푸스문제0 {

    public static void main(String[] args) throws IOException {
          solution1();

    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        LinkedList<Integer> list = new LinkedList<Integer>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        int index = 0;

        while(N > 1) {
            index = (index + (K - 1)) % N;
            sb.append(list.remove(index)).append(", ");
            N--;
        }

        sb.append(list.remove()).append('>');
        System.out.println(sb);

    }
}