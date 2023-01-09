package programmers.level0;

public class 나머지구하기 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 2;
        int num3 = 10, num4 = 5;

        System.out.println(나머지구하기.solution1(num1, num2)); //1
        System.out.println(나머지구하기.solution1(num3, num4)); //0
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int num1, int num2) {
        return num1 % num2;
    }
}
