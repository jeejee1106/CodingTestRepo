package programmers.level0.day1;

public class ���ϱ� {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int num3 = 7;
        int num4 = 2;

        System.out.println(���ϱ�.solution1(num1, num2)); //2
        System.out.println(���ϱ�.solution1(num3, num4)); //3
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int num1, int num2) {
        return num1 / num2;
    }
}
