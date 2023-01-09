package programmers.level0;

import java.util.Arrays;

public class 배열뒤집기 {
    public static void main(String[] args) {
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};

        System.out.println(Arrays.toString(배열뒤집기.solution1(num_list1))); //[5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(배열뒤집기.solution1(num_list2))); //[2, 1, 1, 1, 1, 1]
        System.out.println(Arrays.toString(배열뒤집기.solution1(num_list3))); //[5, 3, 1, 1, 1, 0, 1]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int[] num_list) {
        int arrLength = num_list.length;
        int[] answer = new int[arrLength];
        int index = 0;

        for (int i = arrLength - 1; i >= 0; i--) {
            answer[index] =num_list[i];
            index++;
        }

        return answer;
    }
}
