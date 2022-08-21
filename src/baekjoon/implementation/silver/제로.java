package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ���� {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //�� ���� ������ ���� ���ΰ�
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) { //���� ������ 0�� �ƴϸ�
                list.add(n); //����Ʈ�� �߰��ϰ�
            } else { //���� ������ 0�̶��
                list.remove(list.size() - 1); //���� ������ index�� �ش��ϴ� �� ����
            }
        }
        for (int i : list) {
            sum += i; //list�� ���� ���� ��
        }

        System.out.println(sum);
    }
}