package programmers.level0.day1;

public class 두수의합 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        int num3 = 100;
        int num4 = 2;

        System.out.println(두수의합.solution1(num1, num2)); //5
        System.out.println(두수의합.solution1(num3, num4)); //102
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int num1, int num2) {
        return num1 + num2;
    }
}
