package programmers.level0;

public class �μ��ǳ����� {
    public static void main(String[] args) {
        int num1 = 3, num2 = 2;

        int num3 = 7, num4 = 3;

        int num5 = 1, num6 = 16;

        System.out.println(�μ��ǳ�����.solution1(num1, num2)); //1500
        System.out.println(�μ��ǳ�����.solution1(num3, num4)); //2333
        System.out.println(�μ��ǳ�����.solution1(num5, num6)); //62
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int num1, int num2) {
        return (int) ((double) num1 / num2 * 1000);
    }
}
