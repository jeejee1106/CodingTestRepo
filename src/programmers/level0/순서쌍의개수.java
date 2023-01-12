package programmers.level0;

import java.util.stream.IntStream;

public class 순서쌍의개수 {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 100;

        System.out.println(순서쌍의개수.solution1(n1)); //6
        System.out.println(순서쌍의개수.solution1(n2)); //9
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer = n % i == 0 ? answer + 1 : answer;
            //흠 n까지 다 안돌아도 아래처럼 조건 주면 더 빨라질 것 같은데.. 아닌가?
//            if (i * i == n) {
//                answer = answer * 2 - 1;
//                break;
//            }
        }

        return answer;
    }

    //스트림은 시간이 왜이리 오래걸릴까 공부해야지..!
    public static int solution2(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
