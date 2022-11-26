package programmers.level0;

import java.util.Arrays;

public class 세균증식 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 7;

        int t1 = 10;
        int t2 = 15;

        System.out.println(세균증식.solution1(n1, t1));
        System.out.println(세균증식.solution1(n2, t2));
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n, int t) {
        int answer = (int) (n * Math.pow(2, t));
        return answer;
    }

}
