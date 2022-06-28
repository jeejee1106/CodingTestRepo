package book.greedy;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class 일이될때까지 {
    // 1이 될 때 까지
    public static void main(String[] args) {
        int n1 = 17;
        int k1 = 4;

        int n2 = 25;
        int k2 = 5;

        int n3 = 43;
        int k3 = 4;

        System.out.println(일이될때까지.solution1(n1, k1)); // 3
        System.out.println(일이될때까지.solution1(n2, k2)); // 2
        System.out.println(일이될때까지.solution1(n3, k3)); // 8

        System.out.println(일이될때까지.solution2(n1, k1)); // 3
        System.out.println(일이될때까지.solution2(n2, k2)); // 2
        System.out.println(일이될때까지.solution2(n3, k3)); // 8
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n, int k) { //내 풀이 - 6분 걸림
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int answer = 0;

        //1. n이 1이 될 때 까지 while문을 돌린다.
        while (n > 1) {
            if(n == 1){ //2. 아래의 if문이 실행 되고 n이 1이 되면 for문을 빠져나가게 제일 위에 적어준다.
                break;
            }
            if (n % k == 0) { //3. n이 k로 딱 나누어 떨어진다면 그 몫을 n에 넣는다.
                n = n / k;
                answer++; //4. 계산 횟수를 올려준다.(count)
            } else { //5. n이 k로 나누어 떨어지지 않는다면 n에서 1을 빼주고 마찬가지로 계산 횟수를 올려준다.
                n -= 1;
                answer++;
            }
        }

        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;
        System.out.println("elapsedTime(ns) : " + elapsedTime);
        return answer; //6. 제일 위의 if문에서 n이 1이 되었음을 확인했다면 while문을 빠져나와 계산 횟수를 return!
    }

    /**
     * 책에 나와 있는 것과 조금 다르긴 하지만 (사실 내 코드가 더 간단해보이고 책의 코드는 왜 저렇게 하는지 잘 이해가 가지 않음ㅜㅜ)
     * 아이디어와 원리는 비슷한 것 같다!
     * 위 if문을 조금 더 다듬을 순 없을까? 고민해봐야겠다.
     */

    //책의 코드를 적어보았다.
    ////////////////답이 제대로 안나온다. 파이썬 코드를 해석해서 자바로 옮겼는데 뭔가 잘못된 모양이다........////////////
    public static int solution2(int n, int k) {
        int result = 0;

        while (true) {
            // (n==k로 나누어 떨어지는 수)가 될 때까지 1씩 빼기
            int target = (n % k) * k;
            result += (n - target);
            n = target;

            // n이 k보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) {
                break;
            }
            //k로 나누기
            result += 1;
            n %= k;
        }
        
        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += n - 1;
        return result;
    }
}