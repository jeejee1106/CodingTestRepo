package programmers.level0.day1;

public class �μ��ǰ� {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        int num3 = 27;
        int num4 = 19;

        System.out.println(�μ��ǰ�.solution1(num1, num2)); //12
        System.out.println(�μ��ǰ�.solution1(num3, num4)); //513
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int num1, int num2) {
        return num1 * num2;
    }
}
