package programmers.level0;

import java.util.Arrays;

public class �迭����հ� {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(�迭����հ�.solution1(numbers1)); //5.5
        System.out.println(�迭����հ�.solution1(numbers2)); //94.0
    }

    /////////////////[solution ����]/////////////////
    public static double solution1(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }

        return answer / numbers.length;
    }

    //�ٸ������ Ǭ Ǯ�� �� �̷� Ǯ�̵� �ִµ�, �� Ǯ�̺��� �ӵ��� 100�� �̻� ������.
    //�ƹ��� �ڵ尡 �����ص� ������ ������ ���� �޼��带 ������� �ʴ� ���� ���� �� ����.
    public static double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
