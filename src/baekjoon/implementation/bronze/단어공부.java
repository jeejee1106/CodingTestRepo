package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ܾ���� {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String upperStr = str.toUpperCase(); //�Է¹��� ���ڿ��� ���� �빮�ڷ� �ٲٱ�
        char answer = ' ';
        int max = 0;
        int[] count = new int[26];

        //���ڿ��� �ϳ��ϳ� �˻�
        for (int i = 0; i < upperStr.length(); i++) {
            int n = upperStr.charAt(i) -65; //�� �ڸ��� ���ڸ� �ƽ�Ű �ڵ�� ����
            count[n]++; //���ĺ��� ��� ������ ī��Ʈ
        }

        //count�迭�� ������ ���� ���� ū �ε��� ã��
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = (char) (i + 65); //���� ���� ū �ε����� 65�� ���ϸ� �ְ� ���� ������ ���ڸ� �� �� �ִ�.
            } else if (count[i] == max) { //max���� �������� ����ǥ ��ȯ
                answer = '?';
            }
        }
        System.out.println(answer);
    }

}