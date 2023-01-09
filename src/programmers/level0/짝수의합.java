package programmers.level0;

public class 짝수의합 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;
        int n3 = 28;

        System.out.println(짝수의합.solution1(n1)); //30
        System.out.println(짝수의합.solution1(n2)); //6
        System.out.println(짝수의합.solution1(n3)); //210
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i += 2){
            answer += i;
        }

        return answer;
    }
}
