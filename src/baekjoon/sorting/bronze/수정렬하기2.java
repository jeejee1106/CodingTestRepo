package baekjoon.sorting.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//사실 실버단계이지만 형제(?)들과 함께 있으라고 브론즈에 넣었다ㅎㅎ

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
//        solution1();
        countingSort();
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
         * 제일 빠른(?) 알고리즘 solution1에 비해 약 두배 정도 빠르다.
         *
         * 참고 블로그 : https://st-lab.tistory.com/104
         *
         * 작동원리 : 를 적으려고 했지만 너무 어렵다.. 블로그 보면서 계속 공부하자..
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        /*
		  -1,000,000 ~ 1,000,000 //문제에서의 수의 범위
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

    public static void countingSort() {
        /**
         * 계수 정렬 직접 구현해보기(220805)
         *
         * O(n)의 시간복잡도를 가지기 때문에 속도는 분명히 빠르지만 단점도 존재한다.
         * 아래 코드를 한 번 읽어본다면 단점을 찾을 수 있다.
         *
         * 바로 counting 배열이라는 새로운 배열을 선언해주어야 한다는 점이다.
         * 생각보다 이 단점이 꽤 클 수 있는데, array 안에 있는 max값의 범위에 따라 counting 배열의 길이가 달라지게 된다.
         * 예로들어 10개의 원소를 정렬하고자 하는데, 수의 범위가 0~1억이라면 메모리가 매우 낭비 된다.
         * (array배열의 길이는 10인데, 각 원소의 값이 매우 크다면 counting배열의 길이는 array배열중 제일 큰 원소의 값이 길이가 된다.
         *  즉, array = {1,2,3,4,5,6,7,8,9,1억}이라면 counting배열의 길이는 1억이 된다!)
         */

        //1. 정렬을 해야하는 배열
        int[] array = {7, 2, 3, 5, 7, 1, 4, 6, 7, 5, 0, 1};

        //2. array배열 안에 들어있는 원소의 개수를 카운팅 해주는 배열
        int[] counting = new int[15]; //배열의 크기는 임의로 지정(간단하게 15로 지정했다. 이 배열 크기를 지정해주는 과정에서 메모리의 낭비가 많이 발생한다.)

        //3. array를 한 번 순회하면서 각 값이 나올 때마다 해당 값을 index 로 하는 새로운 배열(counting)의 값을 1 증가시킨다.
        for(int i = 0; i <array.length; i++) {
            counting[array[i]]++;
        }
        //위 for문을 거치게 되면 counting[i]의 값은 array배열의 i의 개수를 나타내게 된다.

        //4. counting배열의 각 값을 누적합으로 다시 넣어준다. 아래 예시처럼.
        // counting[1] = counting[0] + counting[1]
        // counting[2] = counting[1] + counting[2]
        // counting[3] = counting[2] + counting[3]
        // 식으로 나타내면 counting[i] = counting[i-1] + counting[i]
        for(int i = 1; i<counting.length; i++) { //주의할 점은 i의 시작은 1!! index[0]은 생각하지 않는다.
            counting[i] += counting[i-1];
        }
        //위 for문을 거치면 counting배열의 각 원소 값은 array배열이 정렬되어 들어갈 result배열(최종배열)의 인덱스가 된다.
        //즉!! array배열의 각 원소값 = counting배열의 인덱스, counting배열의 원소값 - 1 = result배열의 인덱스, result배열의 원소값 = array배열의 원소값
        //즉!! arr[i]의 값이 counting의 index값이고, counting의 값을 -1 시킨 값을 result의 index로 사용해 해당 index 값에 arr[i] 값을 넣어주게된다.
        //이런식으로 하면 result 배열은 array 배열의 정렬된 형태로 있게 된다. 아래에서 계속 구현해보자

        //5. array가 정렬된 상태로 담길 배열
        int[] result = new int[15]; //배열의 크기 임의 지정(간단하게 15로ㅎㅎ)
        for (int i = array.length - 1; i >= 0; i--) { //안정적으로 정렬하기 위해서는 array의 마지막 index 부터 순회하는 것이 좋다고 한다. -> 정확한 이유 알아보자
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        //6. 이제 result배열엔 array배열이 정렬되어있을 것이다. 확인해보자
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }
}