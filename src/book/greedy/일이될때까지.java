package book.greedy;

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
        System.out.println(일이될때까지.solution1(n3, k3)); //
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n, int k) { //내 풀이 - 6분 걸림
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
        return answer; //6. 제일 위의 if문에서 n이 1이 되었음을 확인했다면 while문을 빠져나와 계산 횟수를 return!
    }

    /**
     * 책에 나와 있는 것과 조금 다르긴 하지만 (사실 내 코드가 더 간단해보이고 책의 코드는 왜 저렇게 하는지 잘 이해가 가지 않음ㅜㅜ)
     * 아이디어와 원리는 비슷한 것 같다!
     * 위 if문을 조금 더 다듬을 순 없을까? 고민해봐야겠다.
     */
}