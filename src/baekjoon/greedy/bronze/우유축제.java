package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class �������� {
    public static void main(String[] args) throws IOException {
//        solution1();
//        solution2();
        int[] milkShop1 = {0, 1, 2, 0, 1, 2, 0};
        int[] milkShop2 = {2, 0, 1, 2, 0, 2, 1, 0, 0, 1};
        System.out.println(solution3(milkShop1)); //7
        System.out.println(solution3(milkShop2)); //5
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ް� StringTokenizer�� �ɰ���) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] milkShop = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < milkShop.length; i++) {
            milkShop[i] = Integer.parseInt(st.nextToken()); //0 1 2 0 1 2 0
        }
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int count = 0, nextMilk = 0;
        //���� - ���� - �ٳ��� - ����
        //���� : 0, ���� : 1, �ٳ��� : 2
        //0,1,2 ������ ���� ���� ������ �Դ´�.
        for (int i = 0; i < milkShop.length; i++) {
            if (milkShop[i] == nextMilk && nextMilk == 0) {
                count++;
                nextMilk = 1;
                continue;
            }
            if (milkShop[i] == nextMilk && nextMilk == 1) {
                count++;
                nextMilk = 2;
                continue;
            }
            if (milkShop[i] == nextMilk && nextMilk == 2) {
                count++;
                nextMilk = 0;
            }
        }
        System.out.println(count);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
    }

    public static void solution2() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ް� StringTokenizer�� �ɰ���) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] milkShop = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < milkShop.length; i++) {
            milkShop[i] = Integer.parseInt(st.nextToken()); //0 1 2 0 1 2 0
        }
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int count = 0, nextMilk = 0;
        //���� - ���� - �ٳ��� - ����
        //���� : 0, ���� : 1, �ٳ��� : 2
        //0,1,2 ������ ���� ���� ������ �Դ´�.
        for (int i = 0; i < milkShop.length; i++) {
            if (milkShop[i] == nextMilk) {
                count++;
                nextMilk++;
            }
            if (nextMilk == 3) {
                nextMilk = 0;
            }
        }

        System.out.println(count);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
    }

    public static int solution3(int[] milkShop) throws IOException {
        int count = 0, nextMilk = 0;
        for (int i = 0; i < milkShop.length; i++) {
            if (milkShop[i] == nextMilk) {
                count++;
                nextMilk++;
            }
            if (nextMilk == 3) {
                nextMilk = 0;
            }
        }
        return count;
    }
}