package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �����ǰ��� {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. ���� ���� �Է� �޾Ƽ� ���� ��� ����
        int number = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        //2. �� ������ ���� String���� Ÿ�� ��ȯ
        String strNum = String.valueOf(number);

        //3. 0~9�� ������ ������ �迭 ����
        int[] numArr = new int[10];

        //4. �迭�� �ε����� �ش��ϴ� ���ڰ� ������ count���ֱ�
        for (int i = 0; i < strNum.length(); i++) {
            numArr[(strNum.charAt(i) - 48)]++;
        }

        //5. ���
        for (int count : numArr) {
            System.out.println(count);
        }
    }

}