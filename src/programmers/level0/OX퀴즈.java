package programmers.level0;

import java.util.Arrays;

/**
 * 11�� 30�� ��ǥ : ��ü������ �ڵ�� �ٲ㺸�� -> �޼��� ���� ��� �Ϸ�. ��.. �̰� �³�?
 */
public class OX���� {
    public static void main(String[] args) {
        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] quiz3 = {"-19 - 6 = 13", "5 + -66 = 71", "-5 - -15 = 10", "3 - -1 = 4"};

        System.out.println(Arrays.toString(OX����.solution1(quiz1))); //["X", "O"]
        System.out.println(Arrays.toString(OX����.solution1(quiz2))); //["O", "O", "X", "O"]
        System.out.println(Arrays.toString(OX����.solution1(quiz3))); //["X", "X", "O", "O"]

        System.out.println();

        System.out.println(Arrays.toString(OX����.solution2(quiz1))); //["X", "O"]
        System.out.println(Arrays.toString(OX����.solution2(quiz2))); //["O", "O", "X", "O"]
        System.out.println(Arrays.toString(OX����.solution2(quiz3))); //["X", "X", "O", "O"]
    }

    /////////////////[solution ����]/////////////////
    public static String[] solution1(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            //1. ������ �������� ���ڿ� �ڸ��� ["3", "-", "4", "=", "-3"]
            String num[] = quiz[i].split(" ");

            int firstNum = Integer.parseInt(num[0]);
            String operator = num[1];
            int secondNum = Integer.parseInt(num[2]);
            int result = Integer.parseInt(num[4]);
            int plus = firstNum + secondNum;
            int minus = firstNum - secondNum;

            if ((operator.equals("+") && plus == result) || (operator.equals("-") && minus == result)) {
                answer[i] = "O"; //2-1. ������ ������ answer�� O�ֱ�
            } else {
                answer[i] = "X";//2-2. ������ Ʋ���� answer�� X�ֱ�
            }
        }
        return answer;
    }

    //��ü���������� �ڵ� ����� ��������!
    public static String[] solution2(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            //1. ������ �������� ���ڿ� �ڸ��� ["3", "-", "4", "=", "-3"]
            String num[] = quiz[i].split(" ");

            //2. ��� �޼��� ȣ��
            int calResult = calculate(Integer.parseInt(num[0]), Integer.parseInt(num[2]), num[1]);
            int result = Integer.parseInt(num[4]);

            //3. answer�� ��� ����
            answer[i] = calResult == result ? "O" : "X";
        }
        return answer;
    }

    //��� �޼���
    private static int calculate(int firstNum, int secondNum, String operator) {
        return operator.equals("+") ? firstNum + secondNum : firstNum - secondNum;
    }
}
