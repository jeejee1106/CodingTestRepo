package baekjoon.greedy.bronze;

import java.math.BigDecimal;
import java.util.Scanner;

public class ���ڷ����� {
    public static void main(String[] args) {
        int time1 = 100;
        int time2 = 5000;
        int time3 = 2134;

//        solution1(); //0 1 4
        System.out.println(���ڷ�����.solution2(time1)); //0 1 4
        System.out.println(���ڷ�����.solution2(time2)); //0 1 4
        System.out.println(���ڷ�����.solution2(time3)); //0 1 4

        System.out.println(���ڷ�����.solution3(time1)); //0 1 4
        System.out.println(���ڷ�����.solution3(time2)); //0 1 4
        System.out.println(���ڷ�����.solution3(time3)); //0 1 4
    }

    public static void solution1() { //���� ��� Ǯ��
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();

        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int A = 0, B = 0, C = 0; //A,B,C�� ����� �������� count�� ������ ����

        while (time >= 10) {
            if (time >= 300) {
                time -= 300;
                A++;
            } else if (time >= 60) {
                time -= 60;
                B++;
            } else if (time >= 10) {
                time -= 10;
                C++;
            }
        }
        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        System.out.println(time == 0 ? A + " " + B + " " + C : -1);
    }

    public static String solution2(int time) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int aCount = 0, bCount = 0, cCount = 0; //A,B,C�� ����� �������� count�� ������ ����

        while (time > 0) { //(����)�ð��� 0�̻��� ���� �ݺ��� ������
            if (time >= 300) { //(����)�ð��� 300�̻��̸�
                time -= 300; //(����)�ð����� 300�� ���ְ�
                aCount++; //aCount�� 1 �÷��ֱ�
            } else if (time >=60) { //�������� ��ģ����
                time -= 60;
                bCount++;
            } else {
                time -= 10;
                cCount++;
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return time == 0 ? aCount + " " + bCount + " " + cCount : "-1"; //�ð��� 0�� �Ǹ� (10���� ���������� ���� 0�� ��. 10���� �ȳ��������� ������ ����)
        // ���ڷ����� a,b,c��ư ���� ������� ���, �׷��� ������ -1 ���
    }

    public static String solution3(int time) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int[] count = {0, 0, 0}; //A,B,C�� ����� �������� count�� �迭
        int[] fixTime = {300, 60, 10};

        for (int i = 0; i < fixTime.length; i++) {
            if (time / fixTime[i] != 0) {
                count[i] += time / fixTime[i];
                time %= fixTime[i];
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return time == 0 ? count[0] + " " + count[1] + " " + count[2] : "-1";
    }
}