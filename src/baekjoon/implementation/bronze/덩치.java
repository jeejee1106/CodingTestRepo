package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 덩치 {
    public static void main(String[] args) throws IOException {
        int[][] arr = {
                {55, 185},
                {58, 183},
                {88, 186},
                {60, 175},
                {45, 155}
        };


//        solution1();
        solution2(arr);
    }

    public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2]; //키와 몸무게를 저장할 배열

        String[] sp;
        for(int i = 0; i < n; i++) {
            sp = br.readLine().split(" ");			// 문자열 분리
            arr[i][0] = Integer.parseInt(sp[0]);	// [i][0] : 몸무게
            arr[i][1] = Integer.parseInt(sp[1]);	// [i][1] : 키
        }

        for(int i = 0; i < n; i++) {
            int rank = 1;

            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }
    }

    public static void solution2(int[][] arr) {
        //i번째 사람과 j번째 사람을 하나하나 비교를 해볼것이다.
        for (int i = 0; i < arr.length; i++) {
            int rank = 1; //순위는 1부터시작. 다음for문에서 한사람 한사람 비교를 하는데, 나보다 덩치가 큰 사람이 없다면 1을 반환

            for(int j = 0; j < arr.length; j++) {
                if(i == j) continue; //같은 사람끼리는 비교 안하고 넘어간다.
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { //키와 몸무게가 i번째 사람보다 큰 사람이 있다면
                        rank++; //rank를 1씩 높여준다.
                }
            }
            System.out.print(rank + " "); //i번째 사람의 순위 출력
        }
    }

}