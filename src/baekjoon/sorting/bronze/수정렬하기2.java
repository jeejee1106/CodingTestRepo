package baekjoon.sorting.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//사실 실버단계이지만 형제(?)들과 함께 있으라고 브론즈에 넣었다ㅎㅎ

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    /**
     * 수 정렬하기와 같은 문제이지만 이 문제의 테스트케이스는 전보다 훨씬 커졌다.
     * 데이터도 이전 문제에 비해 1000배 많아졌고, 수의 범위도 1000배 넓다.
     * 실제로 이 문제를 수 정렬하기의 solution1으로 돌리면 시간초과가 나온다.
     * 그러나 solution2로 돌리면 간신히 시간초과를 면할 수 있다.
     * 즉, 전 문제에서 언급했다시피 StringBuilder를 사용하여 출력하는 것이 훨씬 더 빠르다는 것을 이 문제를 통해 알 수 있었다.
     *
     * 그리고 이 문제에서는 1의 solution2보다 훨씬 더 빠른 다른 방법으로 문제를 풀고자한다.
     * 나도 처음 보는 방법이라 이번 문제는 내 힘으로 문제를 풀었다기 보다는 공부식으로 풀었다라고 보는 것이 맞을 것 같다.
     */

    public static void solution1() throws IOException {
        /**
         * 방법1 : BufferedReader + Collections.sort
         * 참고 블로그 : https://st-lab.tistory.com/106
         * 수 정렬하기1의 solution2보다는 조금 빠르지만, 이 문제의 solution2에 비해 많이 느리다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int answer : list) {
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }

    public static void solution2() throws IOException {
        /**
         * 방법2 : Counting Sort(계수 정렬) 알고리즘을 응용한 방법
         * 제일 빠른 알고리즘 solution1에 비해 약 두배 정도 빠르다.
         *
         * 참고 블로그 : https://st-lab.tistory.com/104
         *
         * 작동원리 : 를 적으려고 했지만 너무 어렵다.. 블로그 보면서 계속 공부하자..
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        /*
		  -1000000 ~ 1000000
		  기준점 0 = index[100000] 으로 생각
		*/
        boolean[] arr = new boolean[2000001];

        for(int i = 0; i < count; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append((i - 1000000)).append('\n');
            }
        }
        System.out.println(sb);
    }
}