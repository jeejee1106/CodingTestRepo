package programmers.level0;

import java.util.Arrays;

public class �ﰢ���ǿϼ�����1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 6, 2};
        int[] array3 = {199, 72, 222};

        System.out.println(�ﰢ���ǿϼ�����1.solution1(array1)); //2
        System.out.println(�ﰢ���ǿϼ�����1.solution1(array2)); //2
        System.out.println(�ﰢ���ǿϼ�����1.solution1(array3)); //1

        System.out.println(�ﰢ���ǿϼ�����1.solution2(array1)); //2
        System.out.println(�ﰢ���ǿϼ�����1.solution2(array2)); //2
        System.out.println(�ﰢ���ǿϼ�����1.solution2(array3)); //1
    }

    /////////////////[solution ����]/////////////////
    //��� 0.02ms
    public static int solution1(int[] sides) {
        int longLine = 0;
        int index = 0;
        int otherLine = 0;

        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > longLine) {
                longLine = sides[i];
                index = i;
            }
        }
        for (int i = 0; i < sides.length; i++) {
            if (i == index) {
                continue;
            } else {
                otherLine += sides[i];
            }
        }

        return longLine < otherLine ? 1 : 2;
    }

    //��� 0.45ms �ƹ��� �����ص� �ӵ����� ��¿ �� ����....��
    public static int solution2(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }

}
