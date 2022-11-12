package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 포인트카드 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine(); //첫 줄 입력받기. N M 과 같은 형식으로 입력하기
        StringTokenizer tokenizer = new StringTokenizer(firstLine); //문자열 분리!

        int N = Integer.parseInt(tokenizer.nextToken()); //포인트 카드에 2N개의 칸이 있음을 나타냄.
        int M = Integer.parseInt(tokenizer.nextToken()); //JOI 군이 M장의 포인트 카드를 가지고 있음을 나타냄.
        List<Integer> badList = new ArrayList<>(); //상품과 교환할 수 없는 쿠폰들에서 몇개의 도장을 바꿔야하는지를 계산에서 이 리스트에 추가할 것이다.
        int count = 0; //상품과 교환할 수 있는 쿠폰의 갯수
        int coin = 0; //도장을 바꾸기 위해 필요한 동전의 갯수

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            StringTokenizer tk = new StringTokenizer(str);
            int ok = Integer.parseInt(tk.nextToken()); //쿠폰에 찍힌 당첨도장의 갯수
            int bad = Integer.parseInt(tk.nextToken()); //쿠폰에 찍힌 꽝 도장의 갯수

            if (ok >= bad) {
                count++;
            }else{
                badList.add((bad - ok)/2); //교환할 수 없는 쿠폰 중 몇개의 꽝을 통과로 바꿔야 상품 교환이 가능한지 계산에서 list에 넣기
            }
        }

        Collections.sort(badList); //오름차순으로 list 정렬. 도장을 바꿀 횟수가 제일 적은 것을 찾기 위함

        int i = 0;
        while (count < M - 1) { //JOI 군은 M-1개 이상의 경품을 가지려고 하기 때문에!
            coin += badList.get(i);
            i++;
            count++;
        }

        System.out.println(coin);
    }
}
