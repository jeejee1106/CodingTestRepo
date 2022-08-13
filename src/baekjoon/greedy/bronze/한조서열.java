package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class �������� {
    public static void main(String[] args) throws IOException {
//        solution1();
        solution2();
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] height = new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine()); //6 4 10 2 5 7 11
        }

        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int count = 0;
        int maxNum = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if (height[i] > height[j]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > maxNum) {
                maxNum = count;
            }
            count = 0;
        }

        System.out.println(maxNum);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
    }

    public static void solution2() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ް� StringTokenizer�� �ɰ���) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] height = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(st.nextToken()); //6 4 10 2 5 7 11
        }

        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int count = 0, maxNum = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if (height[i] > height[j]) { //�ڽź��� ���� ���츮�϶��� ����(����ġ��)
                    count++;
                } else {
                    break; //�ڱ� ���� ���� ���츮 ������ ����
                }
            }
            maxNum = Math.max(maxNum, count); //����ģ Ƚ�� ���ؼ� �ִ� �ֱ�
            count = 0;
        }

        System.out.println(maxNum);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
    }
}