package programmers.level0;

public class ���ں��ϱ� {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3;

        int num3 = 11, num4 = 11;

        int num5 = 7, num6 = 99;

        System.out.println(���ں��ϱ�.solution1(num1, num2)); //-1
        System.out.println(���ں��ϱ�.solution1(num3, num4)); //1
        System.out.println(���ں��ϱ�.solution1(num5, num6)); //-1
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
