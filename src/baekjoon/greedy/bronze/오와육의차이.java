package baekjoon.greedy.bronze;

import java.math.BigDecimal;
import java.util.Scanner;

public class 오와육의차이 {
    //5와 6의 차이
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() { //백준 방식(Scanner로 입력받기) 풀이
        Scanner in = new Scanner(System.in);
        String firstNum = in.next();
        String secondNum = in.next();

        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int minFirstNum = Integer.parseInt(firstNum.replace("6", "5")); //첫 번째로 받은 숫자 중 6을 5로 변경
        int minSecondNum = Integer.parseInt(secondNum.replace("6", "5")); //두 번째로 받은 숫자 중 6을 5로 변경
        int minNum = minFirstNum + minSecondNum; //6을 5로 변경한 후 두 수를 더하면 최솟값

        int maxFirstNum = Integer.parseInt(firstNum.replace("5", "6")); //첫 번째로 받은 숫자 중 5를 6으로 변경
        int maxSecondNum = Integer.parseInt(secondNum.replace("5", "6")); //첫 번째로 받은 숫자 중 5를 6으로 변경
        int maxNum = maxFirstNum + maxSecondNum; //5를 6으로 변경한 후 두 수를 더하면 최댓값

        System.out.println(minNum + " " + maxNum);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
    }
}