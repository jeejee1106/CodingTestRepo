package baekjoon.sorting.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기 {
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
         * solution1과 코드는 같다.
         * 다만 출력하는 부분에서 System.out.println();을 반복적으로 돌리는 것이 아니라
         * StringBuilder를 사용해서 StringBuilder에 값을 넣는 것을 반복문으로 돌리고,
         * 출력은 StringBuilder를 출력한다.
         * 이 방법이 solution1보다 더 효율이 좋은(더 빠른) 방법이라고 한다.
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