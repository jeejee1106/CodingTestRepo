package programmers.level0;

import java.util.Arrays;

public class ���̽��Ƹ޸�ī�� {
    public static void main(String[] args) {
        int money1 = 5500;
        int money2 = 15000;

        System.out.println(Arrays.toString(���̽��Ƹ޸�ī��.solution1(money1))); //[1, 0]
        System.out.println(Arrays.toString(���̽��Ƹ޸�ī��.solution1(money2))); //[2, 4000]

        System.out.println(Arrays.toString(���̽��Ƹ޸�ī��.solution2(money1))); //[1, 0]
        System.out.println(Arrays.toString(���̽��Ƹ޸�ī��.solution2(money2))); //[2, 4000]
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }

    public static int[] solution2(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
}
