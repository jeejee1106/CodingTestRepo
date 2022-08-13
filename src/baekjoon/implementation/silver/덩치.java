package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��ġ {
    public static void main(String[] args) throws IOException {
        int[][] arr = {
                {55, 185},
                {58, 183},
                {88, 186},
                {60, 175},
                {45, 155}
        };


//        solution1();
        solution2(arr);
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2]; //Ű�� �����Ը� ������ �迭

        String[] sp;
        for(int i = 0; i < n; i++) {
            sp = br.readLine().split(" ");			// ���ڿ� �и�
            arr[i][0] = Integer.parseInt(sp[0]);	// [i][0] : ������
            arr[i][1] = Integer.parseInt(sp[1]);	// [i][1] : Ű
        }

        for(int i = 0; i < n; i++) {
            int rank = 1;

            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }
    }

    public static void solution2(int[][] arr) {
        //i��° ����� j��° ����� �ϳ��ϳ� �񱳸� �غ����̴�.
        for (int i = 0; i < arr.length; i++) {
            int rank = 1; //������ 1���ͽ���. ����for������ �ѻ�� �ѻ�� �񱳸� �ϴµ�, ������ ��ġ�� ū ����� ���ٸ� 1�� ��ȯ

            for(int j = 0; j < arr.length; j++) {
                if(i == j) continue; //���� ��������� �� ���ϰ� �Ѿ��.
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { //Ű�� �����԰� i��° ������� ū ����� �ִٸ�
                    rank++; //rank�� 1�� �����ش�.
                }
            }
            System.out.print(rank + " "); //i��° ����� ���� ���
        }
    }

}