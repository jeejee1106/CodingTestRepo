package baekjoon.greedy.bronze;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class ��Ȧ�� {
    public static void main(String[] args) throws IOException {
        solution1();
        solution2();
    }

    public static void solution1() { //���� ���(Scanner�� �Է¹ޱ�) Ǯ��
        Scanner in = new Scanner(System.in);
        int sitCount = in.nextInt(); //3
        String sitKind = in.next(); //SSS

        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int cupHolderCount = 1; //���� ���ʿ� �ִ� �� ī��Ʈ ���ְ� ����

        for (int i = 0; i < sitKind.length(); i++) {
            if (sitKind.charAt(i) == 'S') {
                cupHolderCount++;
            } else {
                cupHolderCount++;
                i++; //Ŀ�ü��̸� i�� 1�� �����ְ� �� ĭ �ǳʶٱ�
            }
        }
        //��Ȧ���� �� > ����� -> ��� �� ���
        //��Ȧ���� �� < ����� -> ��Ȧ�� �� ���
        System.out.println("�� : " + (cupHolderCount > sitCount ? sitCount : cupHolderCount));


        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
    }

    /**
     * ScannerŬ�������� BufferedReaderŬ������ �ξ� �� �����ٴ� ��⸦ ��� �� �� BufferedReader�� ����غ��Ҵ�.
     * �����ڵ� �Խ���?�� �ڷῡ�� BufferedReaderŬ������ Scanner���� �� 7�� ���� �����ٰ� �����־���.
     * �׸��� ������ BufferedReader�� �׽�Ʈ�� �������� ��~~~��� ���� �ӵ��� ��µǴ� ���� �� �� �ִ�.
     * ���� �������� Scanner�Ⱦ��� BufferedReader�����!!
     */
    public static void solution2() throws IOException { //���� ���(Scanner�� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sitCount = Integer.parseInt(br.readLine()); //3
        String sitKind = br.readLine(); //SSS

        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int cupHolderCount = 1; //���� ���ʿ� �ִ� �� ī��Ʈ ���ְ� ����

        for (int i = 0; i < sitKind.length(); i++) {
            if (sitKind.charAt(i) == 'S') {
                cupHolderCount++;
            } else {
                cupHolderCount++;
                i++; //Ŀ�ü��̸� i�� 1�� �����ְ� �� ĭ �ǳʶٱ�
            }
        }
        //��Ȧ���� �� > ����� -> ��� �� ���
        //��Ȧ���� �� < ����� -> ��Ȧ�� �� ���
        System.out.println("�� : " + (cupHolderCount > sitCount ? sitCount : cupHolderCount));


        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
    }
}