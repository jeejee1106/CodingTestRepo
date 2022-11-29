package programmers.level0;

import java.util.Arrays;

/**
 * 11월 30일 목표 : 객체지향적 코드로 바꿔보기 -> 메서드 만들어서 계산 완료. 음.. 이게 맞나?
 */
public class OX퀴즈 {
    public static void main(String[] args) {
        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] quiz3 = {"-19 - 6 = 13", "5 + -66 = 71", "-5 - -15 = 10", "3 - -1 = 4"};

        System.out.println(Arrays.toString(OX퀴즈.solution1(quiz1))); //["X", "O"]
        System.out.println(Arrays.toString(OX퀴즈.solution1(quiz2))); //["O", "O", "X", "O"]
        System.out.println(Arrays.toString(OX퀴즈.solution1(quiz3))); //["X", "X", "O", "O"]

        System.out.println();

        System.out.println(Arrays.toString(OX퀴즈.solution2(quiz1))); //["X", "O"]
        System.out.println(Arrays.toString(OX퀴즈.solution2(quiz2))); //["O", "O", "X", "O"]
        System.out.println(Arrays.toString(OX퀴즈.solution2(quiz3))); //["X", "X", "O", "O"]
    }

    /////////////////[solution 시작]/////////////////
    public static String[] solution1(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            //1. 공백을 기준으로 문자열 자르기 ["3", "-", "4", "=", "-3"]
            String num[] = quiz[i].split(" ");

            int firstNum = Integer.parseInt(num[0]);
            String operator = num[1];
            int secondNum = Integer.parseInt(num[2]);
            int result = Integer.parseInt(num[4]);
            int plus = firstNum + secondNum;
            int minus = firstNum - secondNum;

            if ((operator.equals("+") && plus == result) || (operator.equals("-") && minus == result)) {
                answer[i] = "O"; //2-1. 수식이 맞으면 answer에 O넣기
            } else {
                answer[i] = "X";//2-2. 수식이 틀리면 answer에 X넣기
            }
        }
        return answer;
    }

    //객체지향적으로 코드 만드는 연습하자!
    public static String[] solution2(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            //1. 공백을 기준으로 문자열 자르기 ["3", "-", "4", "=", "-3"]
            String num[] = quiz[i].split(" ");

            //2. 계산 메서드 호출
            int calResult = calculate(Integer.parseInt(num[0]), Integer.parseInt(num[2]), num[1]);
            int result = Integer.parseInt(num[4]);

            //3. answer에 결과 저장
            answer[i] = calResult == result ? "O" : "X";
        }
        return answer;
    }

    //계산 메서드
    private static int calculate(int firstNum, int secondNum, String operator) {
        return operator.equals("+") ? firstNum + secondNum : firstNum - secondNum;
    }
}
