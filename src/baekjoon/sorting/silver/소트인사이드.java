package baekjoon.sorting.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ��Ʈ�λ��̵� {
    /**
     * �� ��� ��� �˰��� ū ���̰� ��� �׷��� �޸�, �ð������ε� ���� ���̰� ����!
     */
    public static void main(String[] args) throws IOException{
//        solution1(); // String�迭 + Arrays.sort(����, Collections.reverseOrder()) ���
//        solution2(); // String�迭 + Arrays.sort(�迭) ���
        solution3(); // char�迭 + Arrays.sort(�迭) ���
    }

    public static void solution1() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        String[] numArr = number.split("");
        Arrays.sort(numArr, Collections.reverseOrder());

        String numStr = "";
        for (int i = 0; i < numArr.length; i++) {
            numStr += numArr[i];
        }

        System.out.println(Integer.parseInt(numStr));

    }

    public static void solution2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        String[] numArr = number.split("");
        Arrays.sort(numArr);

        String numStr = "";
        for (int i = numArr.length - 1; i >= 0; i--) {
            numStr += numArr[i];
        }

        System.out.println(Integer.parseInt(numStr));

    }

    public static void solution3() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] numArr = br.readLine().toCharArray();
        Arrays.sort(numArr);

        for (int i = numArr.length - 1; i >= 0; i--) {
            System.out.print(numArr[i]);
        }
    }
}
