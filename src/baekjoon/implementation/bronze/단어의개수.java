package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �ܾ��ǰ��� {
    public static void main(String[] args) throws IOException {
//        solution1();
        System.out.println(solution2("The Curious Case of Benjamin Button"));
        System.out.println(solution2("Infinite KSG JDW NWH LHW LSY KMS LSJ"));
    }

    public static void solution1() throws IOException { //���� ���(BufferedReader�� �� �� �Է¹ޱ�) Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.print(st.countTokens());
    }

    public static int solution2(String str) {
        String[] strArr = str.split(" "); //split�Լ� : ���ڿ��� Ư�� ���ڸ� �������� �߶� �迭�� �־��ش�.
        return strArr.length;
    }

}