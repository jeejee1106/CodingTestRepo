package baekjoon.sorting.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class �������ϱ� {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] numArr = new int[count];
        for (int i = 0; i < count; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        for(int answer : numArr) {
            System.out.println(answer);
        }
    }

    public static void solution2() throws IOException {
        /**
         * solution1�� �ڵ�� ����.
         * �ٸ� ����ϴ� �κп��� System.out.println();�� �ݺ������� ������ ���� �ƴ϶�
         * StringBuilder�� ����ؼ� StringBuilder�� ���� �ִ� ���� �ݺ������� ������,
         * ����� StringBuilder�� ����Ѵ�.
         * �� ����� solution1���� �� ȿ���� ����(�� ����) ����̶�� �Ѵ�.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        int[] numArr = new int[count];
        for (int i = 0; i < count; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        for(int answer : numArr) {
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
}