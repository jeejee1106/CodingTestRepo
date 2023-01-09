package programmers.level0;

public class 두수의차 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        int num3 = 100;
        int num4 = 2;

        System.out.println(두수의차.solution1(num1, num2)); //-1
        System.out.println(두수의차.solution1(num3, num4)); //98
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int num1, int num2) {
        return num1 - num2;
    }
}
