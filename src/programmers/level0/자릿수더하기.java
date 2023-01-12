package programmers.level0;

public class 자릿수더하기 {
    public static void main(String[] args) {
        int n1 = 1234;
        int n2 = 930211;

        System.out.println(자릿수더하기.solution1(n1)); //10
        System.out.println(자릿수더하기.solution1(n2)); //16
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
