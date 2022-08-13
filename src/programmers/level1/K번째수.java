package programmers.level1;

import java.util.Arrays;

public class K��°�� {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(K��°��.solution1(array, commands)));
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //commands�� length��ŭ �迭 ũ�� �Ҵ�

        for (int i = 0; i < commands.length; i++){
            //1. array �迭�� �ڸ���. commands�迭�� x,0 y,1 ��ŭ �ڸ���.
            int[] array2 = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            //2. �ڸ� �迭�� �����Ѵ�.
            Arrays.sort(array2);

            //3. ���ĵ� �迭���� k��° ���� ã�´�.
            answer[i] = array2[commands[i][2]-1];
        }
        return answer;
    }
}