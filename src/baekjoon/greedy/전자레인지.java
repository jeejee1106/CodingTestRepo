package baekjoon.greedy;

import book.greedy.거스름돈;

import java.math.BigDecimal;
import java.util.Scanner;

public class 전자레인지 {
    public static void main(String[] args) {
        int time1 = 100;
        int time2 = 5000;
        int time3 = 2134;

//        solution1(); //0 1 4
        System.out.println(전자레인지.solution2(time1)); //0 1 4
        System.out.println(전자레인지.solution2(time2)); //0 1 4
        System.out.println(전자레인지.solution2(time3)); //0 1 4

        System.out.println(전자레인지.solution3(time1)); //0 1 4
        System.out.println(전자레인지.solution3(time2)); //0 1 4
        System.out.println(전자레인지.solution3(time3)); //0 1 4
    }

    public static void solution1() { //백준 방식 풀이
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();

        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int A = 0, B = 0, C = 0; //A,B,C를 몇번씩 누를건지 count할 각각의 변수

        while (time >= 10) {
            if (time >= 300) {
                time -= 300;
                A++;
            } else if (time >= 60) {
                time -= 60;
                B++;
            } else if (time >= 10) {
                time -= 10;
                C++;
            }
        }
        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
        System.out.println(time == 0 ? A + " " + B + " " + C : -1);
    }

    public static String solution2(int time) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int aCount = 0, bCount = 0, cCount = 0; //A,B,C를 몇번씩 누를건지 count할 각각의 변수

        while (time > 0) { //(남은)시간이 0이상일 때만 반복문 돌리기
            if (time >= 300) { //(남은)시간이 300이상이면
                time -= 300; //(남은)시간에서 300을 빼주고
                aCount++; //aCount를 1 올려주기
            } else if (time >=60) { //나머지도 마친가지
                time -= 60;
                bCount++;
            } else {
                time -= 10;
                cCount++;
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
        return time == 0 ? aCount + " " + bCount + " " + cCount : "-1"; //시간이 0이 되면 (10으로 나누어졌을 때만 0이 됨. 10으로 안나누어지면 음수가 나옴)
                                                                        // 전자레인지 a,b,c버튼 누른 순서대로 출력, 그렇지 않으면 -1 출력
    }

    public static String solution3(int time) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int[] count = {0, 0, 0}; //A,B,C를 몇번씩 누를건지 count할 배열
        int[] fixTime = {300, 60, 10};

        for (int i = 0; i < fixTime.length; i++) {
            if (time / fixTime[i] != 0) {
                count[i] += time / fixTime[i];
                time %= fixTime[i];
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
        return time == 0 ? count[0] + " " + count[1] + " " + count[2] : "-1";
    }
}