package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �Ƿε� {
    public static void main(String[] args) throws IOException {
//        solution1();

        int A1 = 5, B1 = 3, C1 = 2, M1 = 10;
        int A2 = 10, B2 = 5, C2 = 1, M2 = 10;
        int A3 = 11, B3 = 5, C3 = 1, M3 = 10;
        System.out.println(solution2(A1, B1, C1, M1)); // 24
        System.out.println(solution2(A2, B2, C2, M2)); // 15
        System.out.println(solution2(A3, B3, C3, M3)); // 0

        System.out.println(solution3(A1, B1, C1, M1)); // 24
        System.out.println(solution3(A2, B2, C2, M2)); // 15
        System.out.println(solution3(A3, B3, C3, M3)); // 0
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ް� StringTokenizer�� �ɰ���) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int fatigue = 0; //�Ƿε�
        int work = 0; //���� ��
        int time = 0;

        while(time < 24) {
            if (arr[0] > arr[3]) {
                break;
            }
            if (fatigue + arr[0] > arr[3]) {
                fatigue -= arr[2];
                fatigue = fatigue < 0 ? 0 : fatigue;
                time++;
                continue;
            }
            fatigue += arr[0];
            work += arr[1];
            time++;
        }
        System.out.println(work);
    }

    public static int solution2(int A, int B, int C, int M) {
        int fatigue = 0; //�Ƿε�
        int work = 0; //���� ��
        int time = 0;

        while(time < 24) {
            if (A > M) { //ó������ �Ƿε��� �ְ�ġ(M)�� �Ѿ�� �� �׸�.
                break;
            }
            if (fatigue + A > M) { //���� �Ƿε� + 1�ð� �� �ϸ� ���� �Ƿε��� �ִ�ġ(M)���� ũ�� �����ֱ�
                fatigue -= C; //���鼭 �Ƿε� ���̱�
                fatigue = fatigue < 0 ? 0 : fatigue; //�Ƿε��� ������ 0���� �ٲ��ֱ�
                time++; //���½ð� �����ֱ�
                continue;
            }
            fatigue += A; //���� �� �ִ� ���¶�� ���� �Ƿε��� 1�ð� �� �ϸ� ���� �Ƿε� �����ֱ�
            work += B; //���� �� �����ֱ�
            time++; //���� �ð� �����ֱ�
        }
        return  work;
    }

    public static int solution3(int A, int B, int C, int M) {
        int fatigue = 0; //�Ƿε�
        int work = 0; //���� ��
        int time = 0;

        while(time < 24) {
            if (A > M) { //ó������ �Ƿε��� �ְ�ġ(M)�� �Ѿ�� �� �׸�.
                break;
            }
            if (fatigue + A > M) { //���� �Ƿε� + 1�ð� �� �ϸ� ���� �Ƿε��� �ִ�ġ(M)���� ũ�� �����ֱ�
                fatigue = fatigue - C < 0 ? 0 : fatigue - C; //���鼭 �Ƿε� ���̰� �Ƿε��� ������ 0���� �ٲ��ֱ�
            } else {
                fatigue += A; //���� �� �ִ� ���¶�� ���� �Ƿε��� 1�ð� �� �ϸ� ���� �Ƿε� �����ֱ�
                work += B; //���� �� �����ֱ�
            }
            time++; //���½ð� or ���ѽð� �����ֱ�
        }
        return  work;
    }
}