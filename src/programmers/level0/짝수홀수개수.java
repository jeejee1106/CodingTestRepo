package programmers.level0;

import java.util.Arrays;

public class Â¦¼öÈ¦¼ö°³¼ö {
    public static void main(String[] args) {
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 3, 5, 7};

        System.out.println(Arrays.toString(Â¦¼öÈ¦¼ö°³¼ö.solution1(num_list1))); //[2, 3]
        System.out.println(Arrays.toString(Â¦¼öÈ¦¼ö°³¼ö.solution1(num_list2))); //[0, 4]
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    public static int[] solution1(int[] num_list) {
        int[] answer = new int[2];

        for (int i : num_list) {
            if (i % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}
