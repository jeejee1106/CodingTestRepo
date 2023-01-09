package programmers.level0;

import java.util.Arrays;

public class 礎熱�汝鰤頃� {
    public static void main(String[] args) {
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 3, 5, 7};

        System.out.println(Arrays.toString(礎熱�汝鰤頃�.solution1(num_list1))); //[2, 3]
        System.out.println(Arrays.toString(礎熱�汝鰤頃�.solution1(num_list2))); //[0, 4]
    }

    /////////////////[solution 衛濛]/////////////////
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
