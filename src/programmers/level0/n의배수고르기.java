package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n의배수고르기 {
    public static void main(String[] args) {
        int n1 = 3;
        int[] numlist1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int n2 = 5;
        int[] numlist2 = {1, 9, 3, 10, 13, 5};

        int n3 = 12;
        int[] numlist3 = {2, 100, 120, 600, 12, 12};

        System.out.println(Arrays.toString(n의배수고르기.solution1(n1, numlist1))); //[6, 9, 12]
        System.out.println(Arrays.toString(n의배수고르기.solution1(n2, numlist2))); //[10, 5]
        System.out.println(Arrays.toString(n의배수고르기.solution1(n3, numlist3))); //[120, 600, 12, 12]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }

    public static int[] solution2(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}
