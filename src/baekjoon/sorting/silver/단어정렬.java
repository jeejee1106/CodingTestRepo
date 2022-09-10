package baekjoon.sorting.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class �ܾ����� {
    public static void main(String[] args) throws IOException {
//        solution1();
        solution2();
    }

    public static void solution1() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // �ܾ� ���̰� ���� ���
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // �� ���� ���
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        sb.append(arr[0]).append('\n');

        for (int i = 1; i < n; i++) {
            // �ߺ����� �ʴ� �ܾ ���
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void solution2() throws IOException { //��Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        //���� : �ܾ ���� ������ ����, ���̰� ���ٸ� ���� ����(��������)
        /**
         * �׵��� Arrays.sort() �޼���� int �迭�� �������� �� ���� ����ϴ°��� �˰� �־���.
         * �� ������ ���� sort�ż��尡 �����ε��� �پ��ϰ� �Ǿ� �ִٴ� ���� ���ݰ� �Ǿ���.
         * ������ �Ʒ� ����� solution1���� 1.7�� ���� �����٤̤�
         */
        Arrays.sort(arr); //������ �迭, ������ ���(?) : arr�迭�� ���� ������ �����ϰڴ�.
        Arrays.sort(arr, Comparator.comparing(String::length)); //������ �迭, ������ ���(?) : arr�迭�� ���� ������ �����ϰڴ�.

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            if (arr[i].equals(arr[i+1])) {
                continue;
            }else {
                System.out.println(arr[i]);
            }
        }
    }
}