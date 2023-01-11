package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Â¦¼ö´Â½È¾î¿ä {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;

        System.out.println(Arrays.toString(Â¦¼ö´Â½È¾î¿ä.solution1(n1))); //[1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(Â¦¼ö´Â½È¾î¿ä.solution1(n2))); //[1, 3, 5, 7, 9, 11, 13, 15]

        System.out.println(Arrays.toString(Â¦¼ö´Â½È¾î¿ä.solution2(n1))); //[1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(Â¦¼ö´Â½È¾î¿ä.solution2(n2))); //[1, 3, 5, 7, 9, 11, 13, 15]
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    //Æò±Õ¼Óµµ 0.01 ~ 0.02ms
    public static int[] solution1(int n) {
        int index = 0;
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[length];

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }

    //Æò±Õ ¼Óµµ 0.05ms ¿ÀÈ£ »ý°¢º¸´Ù ºü¸£´Ù??
    public static int[] solution2(int n) {
        List<Integer> list = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    //Æò±Õ¼Óµµ 3.0ms Èì..³ªµµ ½ºÆ®¸² °øºÎÁ» ÇØ¾ß°Ú´Ù¤Ì¤Ì
    public static int[] solution3(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

}
