package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ݺ� {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ް� StringTokenizer�� �ɰ���) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        //�ƽ�Ű�ڵ�� ��ȯ �� �� ���ڰ� ���� ���ں��� ũ�� ���Է� ���ص���. �� �ٴ������ڸ� �˻��ϸ� ��

        int answer  = 1; //ù ���ڴ� ������ �Է��� �޾ƾ� �ϱ� ������ 1�� �ʱ�ȭ

        for (int i = 0; i < str.length() - 1; i++) {
            int now = str.charAt(i);
            int next = str.charAt(i + 1);

            if (next > now) {
                continue;
            } else {
                answer++;
            }
        }
        System.out.println(answer);
    }
}