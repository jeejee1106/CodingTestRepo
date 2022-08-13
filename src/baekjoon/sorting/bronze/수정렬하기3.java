package baekjoon.sorting.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    /**
     * 수 정렬하기2와 같은 문제이지만 이 문제는 중복 숫자가 있다.
     * 데이터의 범위 또한 천만으로 커졌지 때문에 (당연히?)Counting sort를 사용해야한다.
     */

    public static void solution1() throws IOException {
        /**
         * 방법 : Counting sort
         * 참고 블로그 : https://st-lab.tistory.com/107
         * 참고 : 이번의 경우 중복되는 수가 있으니 boolean 배열이 아닌 int 배열을 사용한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 수의 범위 (0 ~ 10000) 사실상 0은 제외
        int[] count = new int[10001];

        for (int i = 0; i < n; i++) {
            // 해당 인덱스의 값을 1 증가
            count[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(count[i] > 0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}