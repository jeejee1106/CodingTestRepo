package programmers.level0;

import java.util.Arrays;

public class 중앙값구하기 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 7, 10, 11};
        int[] array2 = {9, -1, 0};

        System.out.println(중앙값구하기.solution1(array1)); //7
        System.out.println(중앙값구하기.solution1(array2)); //0
    }

    /////////////////[solution 시작]/////////////////
    //평균속도 0.5ms
    public static int solution1(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
