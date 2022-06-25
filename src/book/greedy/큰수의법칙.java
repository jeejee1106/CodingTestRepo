package book.greedy;

import java.util.Arrays;
import java.util.Collections;

public class 큰수의법칙 {
    public static void main(String[] args) {
        int[] num1 = {2, 4, 5, 4, 6};
        int m1 = 8;
        int k1 = 3;

        int[] num2 = {3, 4, 3, 4, 3};
        int m2 = 7;
        int k2 = 2;

        int[] num3 = {1, 45, 12, 14, 4};
        int m3 = 5;
        int k3 = 4;

        System.out.println(큰수의법칙.solution1(num1, m1, k1)); //46
        System.out.println(큰수의법칙.solution1(num2, m2, k2)); //28
        System.out.println(큰수의법칙.solution1(num3, m3, k3)); //194

        System.out.println(큰수의법칙.solution2(num1, m1, k1)); //46
        System.out.println(큰수의법칙.solution2(num2, m2, k2)); //28
        System.out.println(큰수의법칙.solution2(num3, m3, k3)); //194
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] num, int m, int k) { //내 풀이
        int answer = 0;

        //1. 입력받은 배열 정렬하기
        Arrays.sort(num); //내림차순 정렬은 Wrapper클래스로 정의된 타입만 가능하기 때문에 일단 오름차순 정렬.

        //2. 첫 번째로 큰 수와 두 번째로 큰 수 찾기
        int firstLargestNum = num[num.length-1]; //오름차순 정렬이기 때문에 제일 뒤의 숫자가 제일 큰 숫자,
        int secondLargestNum = num[num.length-2]; //그 앞의 숫자가 두 번째로 큰 숫자가 된다.

        //3. m번 더하기 (연속 더하기는 k번만 가능)
        while (m > 0) { //m이 0보다 클 때만 밑의 로직들을 반복
            for (int i = 1; i <= k; i++) {
                if (m <= 0) { //3-1. 먼저 m이 0인지 아닌지를 확인한 후 더하기를 진행.
                    break; //만약 0이라면 반복문 빠져나가기.
                }
                answer += firstLargestNum; //3-2. 첫 번째로 큰 숫자를 k번 반복해서 더해주기
                m--; //3-3. 더해야할 횟수(m)를 -1 해준다.
            }
            if (m <= 0) { //3-4. k번 반복이 끝나면 다시 m이 0인지 아닌지 검사한 후
                break;
            }
            answer += secondLargestNum; //3-5. 두 번째로 큰 숫자를 한 번만 더해주기
            m--;
        }
        return answer;
    }

    public static int solution2(int[] num, int m, int k) { //교재에 나온 풀이
        /**
         * 책에서는 더하기가 반복될 때, 반복되는 규칙을 수열로 정의했다.
         * 내 풀이도 틀린 풀이는 아니지만, m의 크기가 100억 이상으로 커진다면 시간초과 판정을 받을 수 있다.
         * 그렇기 때문에 더 빠른 해답을 제공한다.
         */

        int answer = 0;

        //1. 입력받은 배열 정렬하기
        Arrays.sort(num); //내림차순 정렬은 Wrapper클래스로 정의된 타입만 가능하기 때문에 일단 오름차순 정렬.

        //2. 첫 번째로 큰 수와 두 번째로 큰 수 찾기
        int firstLargestNum = num[num.length-1]; //오름차순 정렬이기 때문에 제일 뒤의 숫자가 제일 큰 숫자,
        int secondLargestNum = num[num.length-2]; //그 앞의 숫자가 두 번째로 큰 숫자가 된다.

        //3. 가장 큰 수가 등장하는 횟수 구하기
        /**
         * m / (k + 1) * k  :  m을 수열 길이로 나눠준 후 k를 곱해주면 가장 큰 수가 등장하는 횟수가 나온다. (딱 나누어 떨어졌을 시 해당)
         * m % (k + 1)      :  m이 (k + 1)로 나누어 떨어지지 않았을 경우 그 나머지를 더해주면 가장 큰 수가 등장하는 횟수가 나온다.
         */
        int firstLargestNumCount = (m / (k + 1) * k + (m % (k + 1))); //이런 수학적 공식을 혼자서도 도출해 낼 수 있도록 연습하자!!!

        //4. 가장 큰수 * 등장 횟수
        answer += firstLargestNum * firstLargestNumCount;

        //5. 두 번째로 큰수 * 등장 횟수
        answer += secondLargestNum * (m - firstLargestNumCount); //m에서 가장 큰 수가 등장하는 횟수를 빼주면 두 번째로 큰 수가 등장하는 횟수가 도출된다.

        return answer;
    }
}