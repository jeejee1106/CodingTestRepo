package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX���� {
    public static void main(String[] args) throws IOException {
        solution1();
        System.out.println(solution2("OOXXOXXOOO")); //10
        System.out.println(solution2("OOXXOOXXOO")); //9
        System.out.println(solution2("OXOXOXOXOXOXOX")); //7
        System.out.println(solution2("OOOOOOOOOO")); //55
        System.out.println(solution2("OOOOXOOOOXOOOOX")); //30
    }

    /**
     * ���� �����.... ������ Ǫ�� �� ���� �Է¹ް� ����ϴ� �� �� ��ƴ٤̤�
     */
    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int answer = 0;
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    answer += count;
                } else {
                    count = 0;
                }
            }
            sb.append(answer + "\n");
        }
        System.out.println(sb);
    }

    public static int solution2(String str) {
        int answer = 0; //���� ���� ����
        int count = 0; //���ӵ� ���� ����

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'O') { //���� ���� �¾�����
                count++; //���ӵ� ���� ����(����)�� 1�� �÷��ְ�
                answer += count; //1�� �þ ���� ��� answer�� �����ش�.
            } else { //���� Ʋ�ȴٸ�
                count = 0; //���ӵ� ���� ������ �ٽ� 0���� �ʱ�ȭ
            }
        }
        return answer;
    }

}