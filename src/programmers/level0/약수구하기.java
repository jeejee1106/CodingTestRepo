package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 약수구하기 {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 29;

        System.out.println(Arrays.toString(약수구하기.solution1(n1))); //[1, 2, 3, 4, 6, 8, 12, 24]
        System.out.println(Arrays.toString(약수구하기.solution1(n2))); //[1, 29]
    }

    /////////////////[solution 시작]/////////////////
    //평균 0.06ms
    public static int[] solution1(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        list.add(n);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
