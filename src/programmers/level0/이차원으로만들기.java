package programmers.level0;

import java.util.Arrays;

public class 이차원으로만들기 {
    public static void main(String[] args) {
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;

        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;
        System.out.println(Arrays.deepToString(이차원으로만들기.solution1(num_list1, n1))); //[[1, 2], [3, 4], [5, 6], [7, 8]]
        System.out.println(Arrays.deepToString(이차원으로만들기.solution1(num_list2, n2))); //[[100, 95, 2], [4, 5, 6], [18, 33, 948]]
    }

    /////////////////[solution 시작]/////////////////
    public static int[][] solution1(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }

        return answer;
    }
}
