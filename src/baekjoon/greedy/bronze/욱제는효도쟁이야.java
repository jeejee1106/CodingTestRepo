package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ������ȿ�����̾� {
    public static void main(String[] args) throws IOException {
//        solution1();

        int n1 = 5;
        int[] expense1 = {1, 6, 5, 2, 4};
        int n2 = 8;
        int[] expense2 = {15, 8, 1, 20, 9, 10, 21, 2};
        System.out.println(solution2(n1, expense1)); //12
        System.out.println(solution2(n2, expense2)); //65
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ް� StringTokenizer�� �ɰ���) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] expense = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < expense.length; i++) {
            expense[i] = Integer.parseInt(st.nextToken());
        }

        int minExpense = 0;
        Arrays.sort(expense);
        for (int i = 0; i < expense.length - 1; i++) {
            minExpense += expense[i];
        }
        System.out.println(minExpense);
    }

    public static int solution2(int n, int[] expense){
        int minExpense = 0; //�ּ����� ��� ���� ���� ����

        Arrays.sort(expense); //��� �������� ����
        for (int i = 0; i < expense.length - 1; i++) { //��� �� ��� ������ ���� ����
            minExpense += expense[i]; //��� �� �����ֱ�
        }
        return minExpense;
    }
}