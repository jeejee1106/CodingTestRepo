package programmers.level0;

import java.util.Arrays;

public class 특이한정렬 {

    public static void main(String[] args) {
        int n1 = 4;
        int[] numList1 = {1, 2, 3, 4, 5, 6};

        int n2 = 30;
        int[] numList2 = {10000, 20, 36, 47, 40, 6, 10, 7000};

        System.out.println(Arrays.toString(특이한정렬.solution1(numList1, n1))); //[4, 5, 3, 6, 2, 1]
        System.out.println(Arrays.toString(특이한정렬.solution1(numList2, n2))); //[36, 40, 20, 47, 10, 6, 7000, 10000]
    }

    public static int[] solution1(int[] numList, int n) {
        int[] answer = new int[numList.length];
        double[] order = new double[numList.length];

        for(int i = 0; i < numList.length; i++) {
            if(numList[i] - n < 0)
                // n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함
                order[i] = ((int)Math.abs(numList[i] - n)) + 0.5;
            else
                order[i] = numList[i] - n;
        }

        Arrays.sort(order); // 오름차순 정렬

        for(int i = 0; i < numList.length; i++) {
            if(order[i] % 1 != 0) answer[i] = n - (int)order[i];
            else answer[i] = (int)order[i] + n;
        }

        return answer;
    }
}
