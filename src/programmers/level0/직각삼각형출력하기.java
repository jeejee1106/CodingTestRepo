package programmers.level0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class �����ﰢ������ϱ� {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }

    //���� �˱�� �Ʒ� ���۵帮���� ��Ʈ�������� ����ϴ� ���� �ӵ��鿡�� �ξ� �����ٰ� �˰� �ִ�.
    //�� ������ n�� ������ 10���Ͽ��� �� ����� �ӵ��� ���� ����ߴ�.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
