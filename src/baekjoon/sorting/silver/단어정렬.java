package baekjoon.sorting.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 단어정렬 {
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
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        sb.append(arr[0]).append('\n');

        for (int i = 1; i < n; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void solution2() throws IOException { //내풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        //문제 : 단어를 길이 순으로 정렬, 길이가 같다면 사전 순서(오름차순)
        /**
         * 그동안 Arrays.sort() 메서드는 int 배열을 오름차순 할 때만 사용하는건줄 알고 있었다.
         * 이 문제를 통해 sort매서드가 오버로딩이 다양하게 되어 있다는 것을 깨닫게 되었다.
         * 하지만 아래 방법은 solution1보다 1.7배 정도 느리다ㅜㅜ
         */
        Arrays.sort(arr); //정렬할 배열, 정렬할 방법(?) : arr배열을 길이 순으로 정렬하겠다.
        Arrays.sort(arr, Comparator.comparing(String::length)); //정렬할 배열, 정렬할 방법(?) : arr배열을 길이 순으로 정렬하겠다.

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