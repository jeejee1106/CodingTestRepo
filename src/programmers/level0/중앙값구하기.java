package programmers.level0;

import java.util.Arrays;

public class �߾Ӱ����ϱ� {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 7, 10, 11};
        int[] array2 = {9, -1, 0};

        System.out.println(�߾Ӱ����ϱ�.solution1(array1)); //7
        System.out.println(�߾Ӱ����ϱ�.solution1(array2)); //0
    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 0.5ms
    public static int solution1(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
