package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ƽ�Ű�ڵ� {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. String���� �Է��� �޴´�.
        String str = br.readLine();

        //2. charAt�޼��带 ����ϸ� charŸ���� ���ڰ� ���´�.
        //3. charŸ���� intŸ�Կ� �־��ָ� �ƽ�Ű �ڵ�� ����� �ȴ�.
        int ch = str.charAt(0);

        System.out.println(ch);

    }

}