package programmers.level1;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(K번째수.solution1(array, commands)));
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //commands의 length만큼 배열 크기 할당

        for (int i = 0; i < commands.length; i++){
            //1. array 배열을 자른다. commands배열의 x,0 y,1 만큼 자른다.
            int[] array2 = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            //2. 자른 배열을 정렬한다.
            Arrays.sort(array2);

            //3. 정렬된 배열에서 k번째 수를 찾는다.
            answer[i] = array2[commands[i][2]-1];
        }
        return answer;
    }
}