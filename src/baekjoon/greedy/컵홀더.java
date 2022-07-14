package baekjoon.greedy;

import java.math.BigDecimal;
import java.util.Scanner;

public class 컵홀더 {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() { //백준 방식(Scanner로 입력받기) 풀이
        Scanner in = new Scanner(System.in);
        int sitCount = in.nextInt(); //3
        String sitKind = in.next(); //SSS

        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int cupHolderCount = 1; //제일 왼쪽에 있는 거 카운트 해주고 시작

        for (int i = 0; i < sitKind.length(); i++) {
            if (sitKind.charAt(i) == 'S') {
                cupHolderCount++;
            } else {
                cupHolderCount++;
                i++; //커플석이면 i에 1을 더해주고 한 칸 건너뛰기
            }
        }
        //컵홀더의 수 > 사람수 -> 사람 수 출력
        //컵홀더의 수 < 사람수 -> 컵홀더 수 출력
        System.out.println("답 : " + (cupHolderCount > sitCount ? sitCount : cupHolderCount));


        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
    }
}