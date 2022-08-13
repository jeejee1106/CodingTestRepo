package book.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ����ī����� {
    public static void main(String[] args) {
        int[][] num1 = {{3, 1, 2},
                {4, 1, 4},
                {2, 2, 2}};
        int[][] num2 = {{7, 3, 1, 8},
                {3, 3, 3, 4}};
        int[][] num3 = {{73,16,94,20},
                {67,23,56,13},
                {94,34,18,47},
                {56,14,10,44}};

        System.out.println(����ī�����.solution1(num1)); //2
        System.out.println(����ī�����.solution1(num2)); //3
        System.out.println(����ī�����.solution1(num3)); //2

        System.out.println(����ī�����.solution2(num1)); //2
        System.out.println(����ī�����.solution2(num2)); //3
        System.out.println(����ī�����.solution2(num3)); //2

        System.out.println(����ī�����.solution3(num1)); //2
        System.out.println(����ī�����.solution3(num2)); //3
        System.out.println(����ī�����.solution3(num3)); //2
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[][] num) { //�� Ǯ��
        //1. List�� �� �࿡�� ���� ���� ���� ���
        List<Integer> minNumList = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            int minNum = num[0][0];
            for (int j = 1; j < num[0].length; j++) {
                if (num[i][j] < minNum) {
                    minNum = num[i][j];
                }
            }
            minNumList.add(minNum);
        }

        //2. List�� ��� ���� �� ���� ū���� return�ϱ�
        return Collections.max(minNumList);
    }

    public static int solution2(int[][] num) { //�� Ǯ�� - 2���� �迭�� ���� for������!! (��� ó���غ���..! ���� �ɱ�?) �ߵȴ�!
        List<Integer> minNumList = new ArrayList<>();
        for (int[] columns : num) {
            int minNum = num[0][0];
            for (int numArr : columns) {
                if (numArr < minNum) {
                    minNum = numArr;
                }
            }
            minNumList.add(minNum);
        }
        return Collections.max(minNumList);
    }

    public static int solution3(int[][] num) { //�� Ǯ��
        List<Integer> minNumList = new ArrayList<>();
        for (int[] columns : num) { //���� for������ 2���� �迭�� 1�������� ���� ��
            Arrays.sort(columns); //������ ����
            minNumList.add(columns[0]); //���� ���� ���� List�� �־��ֱ�!
        }
        return Collections.max(minNumList);
    }

    /**
     * å�� �ؼ��� �Ȱ��� ���̵��� ������ Ǯ�.
     * solution1������ ������ �ڵ带 �᳻������,
     * solution2������ 2���� �迭�� ���� for������ �� ���� ������? ��� �ǹ��� ���� ���۸��� ���� ���� for������ ���� �ذ�
     * solution3������ 2�� for���� ������ �ʰ� ������ �ذ��غô�.
     * ���ѽð����� �� ���ư����� �ʹ� �ñ��ϴ� 3�� �ڵ尡 ���� ª�� ������ �� ���� ����� �ִ���, �ð����⵵���� ���̳ʽ��� �Ǵ� �� �ƴ��� �ñ��ϴ�.
     */

}