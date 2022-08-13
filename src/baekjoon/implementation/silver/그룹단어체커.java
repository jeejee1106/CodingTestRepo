package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class �׷�ܾ�üĿ {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //���� ���(Scanner�� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strCount = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < strCount; i++) {
            String str = br.readLine();

            //���� ���ڿ��� ���̰� 1�̳� 2�� ������ �׷�ܾ��̱� ������ ���� �˻��� �ʿ� ���� answer + 1�� ���ش�.
            if (str.length() < 3) {
                answer++;
            } else {
                //���� ���ڿ��� ���̰� 3�̻��̶��??
                HashMap<Character, Integer> map = new HashMap<>();
                map.put(str.charAt(0), 1); //HashMap�� ù ���ڿ� ī��Ʈ�� �ִ´�.
                //���ڿ��� ���̸�ŭ for���� �����µ�, ������ ù ���ڴ� �ذ��� ������ j = 1����!
                for (int j = 1; j < str.length(); j++) {
                    char now = str.charAt(j); //���� ����
                    char prev = str.charAt(j - 1); //���� �ε����� ����

                    //���� ���ڸ� map�� �ִ´�. ���� �̹� �ʿ� ���ڰ� �����Ѵٸ� ī��Ʈ +1 ���ش�.
                    map.put(now, map.getOrDefault(now, 0) + 1);

                    //map�� ���� ���ڿ� ���� value���� 2�̻��ε�(�� ó�� ������ ���ڰ� �ƴ϶� �� ���̻� ������ ���ڶ�� ��),
                    //���� ���ڰ� ���� ���ڿ� ��ġ���� �ʴٸ�?
                    //�������� ���� ���ڰ� �� �� ���Դٴ� ���̴� �׷� �ܾ �� �� ����.
                    if (map.get(now) > 1 && now != prev) {
                        break; //�׷�ܾ �ƴϸ� for�� ����������
                    }
                    if (j == str.length() - 1) { //���ڿ��� ������ �� ���Ҵ�?? �׷�ܾ��� ���ǿ� �����Ѵٴ� ��
                        answer++; //�׷��Ƿ� ī��Ʈ + 1
                    }
                }
            }
        }
        System.out.println(answer);
    }
}