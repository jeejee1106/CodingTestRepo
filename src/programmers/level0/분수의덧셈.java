package programmers.level0;

import java.util.Arrays;

public class ºĞ¼öÀÇµ¡¼À {
    public static void main(String[] args) {
        int denum1 = 1, num1 = 2, denum2 = 3, num2 = 4;
        int denum3 = 9, num3 = 2, denum4 = 1, num4 = 3;
        int denum5 = 81, num5 = 12, denum6 = 9, num6 = 34;

        System.out.println(Arrays.toString(ºĞ¼öÀÇµ¡¼À.solution1(denum1, num1, denum2, num2))); //[5, 4]
        System.out.println(Arrays.toString(ºĞ¼öÀÇµ¡¼À.solution1(denum3, num3, denum4, num4))); //[29, 6]
        System.out.println(Arrays.toString(ºĞ¼öÀÇµ¡¼À.solution1(denum5, num5, denum6, num6))); //[477, 68]
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    public static int[] solution1(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int denum = denum1 * num2 + denum2 * num1; //ºĞÀÚ
        int num = num1 * num2; //ºĞ¸ğ

        int min = Math.min(denum, num);
        int GCD = 1;

        for (int i = 1; i <= min; i++) {
            if (denum % i == 0 && num % i == 0) {
                GCD = i;
            }
        }

        answer[0] = denum / GCD;
        answer[1] = num / GCD;

        return answer;
    }
}
