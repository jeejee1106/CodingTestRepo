package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ����Ʈī�� {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine(); //ù �� �Է¹ޱ�. N M �� ���� �������� �Է��ϱ�
        StringTokenizer tokenizer = new StringTokenizer(firstLine); //���ڿ� �и�!

        int N = Integer.parseInt(tokenizer.nextToken()); //����Ʈ ī�忡 2N���� ĭ�� ������ ��Ÿ��.
        int M = Integer.parseInt(tokenizer.nextToken()); //JOI ���� M���� ����Ʈ ī�带 ������ ������ ��Ÿ��.
        List<Integer> badList = new ArrayList<>(); //��ǰ�� ��ȯ�� �� ���� �����鿡�� ��� ������ �ٲ���ϴ����� ��꿡�� �� ����Ʈ�� �߰��� ���̴�.
        int count = 0; //��ǰ�� ��ȯ�� �� �ִ� ������ ����
        int coin = 0; //������ �ٲٱ� ���� �ʿ��� ������ ����

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            StringTokenizer tk = new StringTokenizer(str);
            int ok = Integer.parseInt(tk.nextToken()); //������ ���� ��÷������ ����
            int bad = Integer.parseInt(tk.nextToken()); //������ ���� �� ������ ����

            if (ok >= bad) {
                count++;
            }else{
                badList.add((bad - ok)/2); //��ȯ�� �� ���� ���� �� ��� ���� ����� �ٲ�� ��ǰ ��ȯ�� �������� ��꿡�� list�� �ֱ�
            }
        }

        Collections.sort(badList); //������������ list ����. ������ �ٲ� Ƚ���� ���� ���� ���� ã�� ����

        int i = 0;
        while (count < M - 1) { //JOI ���� M-1�� �̻��� ��ǰ�� �������� �ϱ� ������!
            coin += badList.get(i);
            i++;
            count++;
        }

        System.out.println(coin);
    }
}
