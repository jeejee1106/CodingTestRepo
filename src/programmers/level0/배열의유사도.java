package programmers.level0;

import java.util.Arrays;

public class �迭�����絵 {
    public static void main(String[] args) {

        String[] arrA1 = {"a", "b", "c"};
        String[] arrB1 = {"com", "b", "d", "p", "c"};

        String[] arrA2 = {"n", "omg"};
        String[] arrB2 = {"m", "dot"};

        System.out.println(�迭�����絵.solution1(arrA1, arrB1)); //2
        System.out.println(�迭�����絵.solution1(arrA2, arrB2)); //0
    }

    /////////////////[solution ����]/////////////////
    //��� 0.02 ~ 0.03ms
    public static int solution1(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
