package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class ���� {
    /**
     * ��...! ���ù�������...!
     * but, ���� ArrayList�� ������ ��İ�, Stack���� ������ ����� ����, ��� ��� ������!
     */
    public static void main(String[] args) throws IOException {
//        solution1(); //�ӵ� : 224ms, �޸� : 24024KB
        solution2(); //�ӵ� : 248ms, �޸� : 23536KB
    }

    public static void solution1() throws IOException { //�� Ǯ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //�� ���� ������ ���� ���ΰ�
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) { //���� ������ 0�� �ƴϸ�
                list.add(n); //����Ʈ�� �߰��ϰ�
            } else { //���� ������ 0�̶��
                list.remove(list.size() - 1); //���� ������ index�� �ش��ϴ� �� ����
            }
        }
        for (int i : list) {
            sum += i; //list�� ���� ���� ��
        }

        System.out.println(sum);
    }

    public static void solution2() throws IOException { //�ٸ� ��� Ǯ�� ����(���� ���)
        /**
         * �������� �� ������ �����غôµ�, ���� ArrayList�� Ǭ Ǯ�̿� ũ�� �ٸ� ���� ������.
         * ���� �Ȱ��ٰ� �� �� �ְ�, �޸𸮳� �ð����� �鵵 ���� ���̰� ����.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //�� ���� ������ ���� ���ΰ�
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) { //���� ������ 0�� �ƴϸ�
                stack.add(n); //���ÿ� �߰��ϰ�
//                stack.push(n); //add�޼���� push�޼���� ������ ����! (��ܿ� ���Ҹ� �߰�)
            } else { //���� ������ 0�̶��
                stack.pop(); //������ �ֻ�ܿ� �ִ� ���Ҹ� ����
            }
        }
        for (int i : stack) {
            sum += i; //stack�� ���� ���� ��
        }

        System.out.println(sum);
    }
}