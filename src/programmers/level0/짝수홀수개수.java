package programmers.level0;

import java.util.Arrays;

public class ¦��Ȧ������ {
    public static void main(String[] args) {
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 3, 5, 7};

        System.out.println(Arrays.toString(¦��Ȧ������.solution1(num_list1))); //[2, 3]
        System.out.println(Arrays.toString(¦��Ȧ������.solution1(num_list2))); //[0, 4]
    }

    /////////////////[solution ����]/////////////////
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
