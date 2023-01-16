package programmers.level0;

import java.util.Arrays;

public class 가까운수 {
    public static void main(String[] args) {
        int[] array1 = {3, 10, 28};
        int n1 = 20;

        int[] array2 = {10, 11, 12};
        int n2 = 13;

        int[] array3 = {2, 3, 2};
        int n3 = 1;

        System.out.println(가까운수.solution1(array1, n1)); //28
        System.out.println(가까운수.solution1(array2, n2)); //12
        System.out.println(가까운수.solution1(array3, n3)); //2

        System.out.println(가까운수.solution1(array1, n1)); //28
        System.out.println(가까운수.solution1(array2, n2)); //12
        System.out.println(가까운수.solution1(array3, n3)); //2
    }

    /////////////////[solution 시작]/////////////////
    //두 풀이 모두 속도 비슷함. 0.5ms정도
    public static int solution1(int[] array, int n) {
        Arrays.sort(array);

        int nearNum = 100;
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) < nearNum) {
                nearNum = Math.abs(array[i] - n);
                num = array[i];
            }
        }

        return num;
    }

    public static int solution2(int[] array, int n) {
        Arrays.sort(array);

        int answer = 0;

        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }

        answer = array[0];
        return answer;
    }
}
