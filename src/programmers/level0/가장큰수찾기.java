package programmers.level0;

import java.util.Arrays;

public class ����ū��ã�� {
    public static void main(String[] args) {
        int[] array1 = {1, 8, 3};
        int[] array2 = {9, 10, 11, 8};

        System.out.println(Arrays.toString(����ū��ã��.solution1(array1))); //[8, 10]
        System.out.println(Arrays.toString(����ū��ã��.solution1(array2))); //[11, 2]
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
