package baekjoon.greedy.bronze;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class 컵홀더 {
    public static void main(String[] args) throws IOException {
        solution1();
        solution2();
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

    /**
     * Scanner클래스보다 BufferedReader클래스가 훨씬 더 빠르다는 얘기를 듣고 한 번 BufferedReader를 사용해보았다.
     * 백준코딩 게시판?의 자료에도 BufferedReader클래스가 Scanner보다 약 7배 정도 빠르다고 나와있었다.
     * 그리고 실제로 BufferedReader로 테스트를 돌려보니 훠~~~얼씬 빠른 속도가 출력되는 것을 알 수 있다.
     * 다음 문제부턴 Scanner안쓰고 BufferedReader써야지!!
     */
    public static void solution2() throws IOException { //백준 방식(Scanner로 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sitCount = Integer.parseInt(br.readLine()); //3
        String sitKind = br.readLine(); //SSS

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