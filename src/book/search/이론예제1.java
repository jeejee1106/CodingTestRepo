package book.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class �̷п���1 {

    /**
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     * ����, ť, ����Լ��� ���� ������ �̷а� ����!!!
     * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
     */

    public static void main(String[] args) {
        stack();

        queue();

//        infiniteRecursiveFunction(); //������ ȣ��Ǵ� ����Լ�!!!!!! StackOverflowError�߻� : ����� �ִ� ���̸� �ʰ��ߴ�. ȣ��Ƚ�� ������ �ִµ�, �� �Ѱ踦 ���

        System.out.println(">>>>> ����Լ� ���� <<<<<");
        recursiveFunction(1);
        System.out.println();

        factorialIterative(5);

        System.out.println(">>>>> ����Լ��� ����� ���丮�� ���� <<<<<");
        System.out.println(factorialRecursive(5));
        System.out.println();

    }

    //Stack ����
    static void stack() {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop(); //���� �������� ��(���� ���� �ִ�) 4�� ������
        stack.push(1);
        stack.push(4);
        stack.pop(); //���� �������� ��(���� ���� �ִ�) 4�� ������

        System.out.println(">>>>> stack ���� <<<<<");
        //������ �ֻ�� ���Һ��� ���
        while (!stack.empty()) {
            System.out.println(stack.peek()); //���� ���� ���� ����ϱ�
            stack.pop(); //��� �� ����! �׷��� �� ���� ���Ұ� ������!
        }
        System.out.println();
    }

    //Queue ����
    static void queue() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(7);
        queue.poll(); //���� ���� �� 5�� ������
        queue.offer(1);
        queue.offer(4);
        queue.poll(); //�� ��°�� �� 2�� ������

        System.out.println(">>>>> queue ���� <<<<<");
        //���� ���� ���Һ��� �����
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); //���� ���� ���� ���Ҹ� �����ϸ鼭 Ȯ���غ���
        }
        System.out.println();
    }

    //������ ȣ��Ǵ� ����Լ� ����
    static void infiniteRecursiveFunction() {
        System.out.println("����Լ��� ȣ���մϴ�.");
        infiniteRecursiveFunction(); //�ڱ� �ڽ��� ȣ��
    }

    //����Լ��� ���� ���� ����
    static void recursiveFunction(int i) {
        //100��° ȣ���� ���� �� ����ǵ��� ���� ���� ���
        if (i == 100) {
            return;
        }
        System.out.println(i + "��° ����Լ����� " + (i + 1) + "��° ����Լ��� ȣ���մϴ�.");
        recursiveFunction(i + 1);
        System.out.println(i + "��° ����Լ��� �����մϴ�.");
        /**
         * ��Ǫ�� ���ο��� ����Լ��� ������ ���� �ڷᱸ���� �̿�
         * �Լ��� ��� ȣ�� ���� �� ���� �������� ȣ���� �Լ��� ���� ������ ������ �� ���� �Լ� ȣ���� ����Ǳ� ����.
         * ��, ����Լ��� ���������� ���� �ڷᱸ���� �����ϴ�.
         */
    }

    // �ݺ������� ������ n! (���丮��)
    static void factorialIterative(int n) {
        System.out.println(">>>>> �ݺ����� ����� ���丮�� ���� <<<<<");
        int result = 1;
        // 1���� n������ ���� ���ʴ�� ���ϱ�
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        System.out.println();
    }

    // ��������� ������ n!
    static int factorialRecursive(int n) {
        // n�� 1 ������ ��� 1�� ��ȯ
        if (n <= 1) return 1;
        // n! = n * (n - 1)!�� �״�� �ڵ�� �ۼ��ϱ�
        return n * factorialRecursive(n - 1); //�̱��ϴ�......
    }
}