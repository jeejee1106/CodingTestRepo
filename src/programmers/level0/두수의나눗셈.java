package programmers.level0;

public class µÎ¼öÀÇ³ª´°¼À {
    public static void main(String[] args) {
        int num1 = 3, num2 = 2;

        int num3 = 7, num4 = 3;

        int num5 = 1, num6 = 16;

        System.out.println(µÎ¼öÀÇ³ª´°¼À.solution1(num1, num2)); //1500
        System.out.println(µÎ¼öÀÇ³ª´°¼À.solution1(num3, num4)); //2333
        System.out.println(µÎ¼öÀÇ³ª´°¼À.solution1(num5, num6)); //62
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    public static int solution1(int num1, int num2) {
        return (int) ((double) num1 / num2 * 1000);
    }
}
