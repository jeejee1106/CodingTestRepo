package baekjoon.greedy.bronze;

import java.math.BigDecimal;
import java.util.Scanner;

public class ������������ {
    //5�� 6�� ����
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() { //���� ���(Scanner�� �Է¹ޱ�) Ǯ��
        Scanner in = new Scanner(System.in);
        String firstNum = in.next();
        String secondNum = in.next();

        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int minFirstNum = Integer.parseInt(firstNum.replace("6", "5")); //ù ��°�� ���� ���� �� 6�� 5�� ����
        int minSecondNum = Integer.parseInt(secondNum.replace("6", "5")); //�� ��°�� ���� ���� �� 6�� 5�� ����
        int minNum = minFirstNum + minSecondNum; //6�� 5�� ������ �� �� ���� ���ϸ� �ּڰ�

        int maxFirstNum = Integer.parseInt(firstNum.replace("5", "6")); //ù ��°�� ���� ���� �� 5�� 6���� ����
        int maxSecondNum = Integer.parseInt(secondNum.replace("5", "6")); //ù ��°�� ���� ���� �� 5�� 6���� ����
        int maxNum = maxFirstNum + maxSecondNum; //5�� 6���� ������ �� �� ���� ���ϸ� �ִ�

        System.out.println(minNum + " " + maxNum);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
    }
}