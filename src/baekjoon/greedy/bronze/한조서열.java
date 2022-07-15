package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class 한조서열 {
    public static void main(String[] args) throws IOException {
//        solution1();
        solution2();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] height = new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine()); //6 4 10 2 5 7 11
        }

        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int count = 0;
        int maxNum = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if (height[i] > height[j]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > maxNum) {
                maxNum = count;
            }
            count = 0;
        }

        System.out.println(maxNum);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
    }

    public static void solution2() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받고 StringTokenizer로 쪼개기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //7
        int[] height = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(st.nextToken()); //6 4 10 2 5 7 11
        }

        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int count = 0, maxNum = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if (height[i] > height[j]) { //자신보다 낮은 봉우리일때만 공격(물리치기)
                    count++;
                } else {
                    break; //자기 보다 높은 봉우리 만나면 포기
                }
            }
            maxNum = Math.max(maxNum, count); //물리친 횟수 비교해서 최댓값 넣기
            count = 0;
        }

        System.out.println(maxNum);

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
    }
}