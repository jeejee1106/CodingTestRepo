package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class 우유축제 {
    public static void main(String[] args) throws IOException {
//        solution1();
        solution2();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받고 StringTokenizer로 쪼개기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] milkShop = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < milkShop.length; i++) {
            milkShop[i] = Integer.parseInt(st.nextToken()); //0 1 2 0 1 2 0
        }
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int count = 0, nextMilk = 0;
        //딸기 - 초코 - 바나나 - 딸기
        //딸기 : 0, 초코 : 1, 바나나 : 2
        //0,1,2 순으로 있을 때만 우유를 먹는다.
        for (int i = 0; i < milkShop.length; i++) {
            if (milkShop[i] == nextMilk && nextMilk == 0) {
                count++;
                nextMilk = 1;
                continue;
            }
            if (milkShop[i] == nextMilk && nextMilk == 1) {
                count++;
                nextMilk = 2;
                continue;
            }
            if (milkShop[i] == nextMilk && nextMilk == 2) {
                count++;
                nextMilk = 0;
            }
        }
        System.out.println(count);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
    }

    public static void solution2() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받고 StringTokenizer로 쪼개기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] milkShop = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < milkShop.length; i++) {
            milkShop[i] = Integer.parseInt(st.nextToken()); //0 1 2 0 1 2 0
        }
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int count = 0, nextMilk = 0;
        //딸기 - 초코 - 바나나 - 딸기
        //딸기 : 0, 초코 : 1, 바나나 : 2
        //0,1,2 순으로 있을 때만 우유를 먹는다.
        for (int i = 0; i < milkShop.length; i++) {
            if (milkShop[i] == nextMilk) {
                count++;
                nextMilk++;
            }
            if (nextMilk == 3) {
                nextMilk = 0;
            }
        }

        System.out.println(count);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
    }
}