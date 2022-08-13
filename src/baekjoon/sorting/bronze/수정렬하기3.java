package baekjoon.sorting.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class �������ϱ�3 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    /**
     * �� �����ϱ�2�� ���� ���������� �� ������ �ߺ� ���ڰ� �ִ�.
     * �������� ���� ���� õ������ Ŀ���� ������ (�翬��?)Counting sort�� ����ؾ��Ѵ�.
     */

    public static void solution1() throws IOException {
        /**
         * ��� : Counting sort
         * ���� ��α� : https://st-lab.tistory.com/107
         * ���� : �̹��� ��� �ߺ��Ǵ� ���� ������ boolean �迭�� �ƴ� int �迭�� ����Ѵ�.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // ���� ���� (0 ~ 10000) ��ǻ� 0�� ����
        int[] count = new int[10001];

        for (int i = 0; i < n; i++) {
            // �ش� �ε����� ���� 1 ����
            count[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        // 0�� �Է¹������� �����Ƿ� 1���� ����
        for(int i = 1; i < 10001; i++){
            // i ���� ������ 0 �� �� �� ���� ��� (�󵵼��� �ǹ�)
            while(count[i] > 0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}