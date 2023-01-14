package programmers.level0;

public class 개미군단 {
    public static void main(String[] args) {
        int hp1 = 23;
        int hp2 = 24;
        int hp3 = 999;

        System.out.println(개미군단.solution1(hp1)); //5
        System.out.println(개미군단.solution1(hp2)); //6
        System.out.println(개미군단.solution1(hp3)); //201
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int hp) {
        int answer = 0;

        answer += hp/5;
        hp %= 5;
        answer += hp/3;
        hp %= 3;
        answer += hp;

        return answer;
    }
}
