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

        System.out.println(Arrays.toString(특이한정렬.solution2(numList1, n1))); //[4, 5, 3, 6, 2, 1]
        System.out.println(Arrays.toString(특이한정렬.solution2(numList2, n2))); //[36, 40, 20, 47, 10, 6, 7000, 10000]
    }

    public static int[] solution1(int[] numList, int n) {
        int[] answer = new int[numList.length];
        double[] order = new double[numList.length];

        for(int i = 0; i < numList.length; i++) {
            if(numList[i] - n < 0) {
                // n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함
                order[i] = ((int) Math.abs(numList[i] - n)) + 0.5;
            } else {
                order[i] = numList[i] - n;
            }
        }

        Arrays.sort(order); // 오름차순 정렬

        for (int i = 0; i < numList.length; i++) {
            if(order[i] % 1 != 0) {
                answer[i] = n - (int)order[i];
            } else {
                answer[i] = (int)order[i] + n;
            }
        }

        return answer;
    }

    public static int[] solution2(int[] numList, int n) {
        int[] answer = new int[numList.length];
        double[] tmpArr = new double[numList.length];

        for (int i = 0; i < numList.length; i++) {
            int distance = n - numList[i];

            //n을 기준으로 한 거리가 양수면, 0.5를 더한다. why? 정렬울 했울 때 같은 거리에 있는 더 큰 수보다 뒤로 밀리게 하기 위해.
            tmpArr[i] = distance <= 0 ? Math.abs(distance) : distance + 0.5;
        }

        //깊은 복사를 할 때 이렇게 for문을 돌려 하나하나 넣어줄수도 있지만
//        double[] copyTmpArr = new double[numList.length];
//        for (int i = 0; i < numList.length; i++) {
//            copyTmpArr[i] = tmpArr[i];
//        }

        //clone() 메서드를 사용하는 방법도 있다.(제일 보편적인 방법)
        double[] copyTmpArr = tmpArr.clone();
        Arrays.sort(copyTmpArr);

        //배열의 인덱스를 이용해 해당 인덱스의 값을 다른 배열에 넣는(?) 코드..
        for (int i = 0; i < numList.length; i++) {
            for (int j = 0; j < numList.length; j++) {
                if (copyTmpArr[i] == tmpArr[j]) {
                    answer[i] = numList[j];
                }
            }
        }

        return answer;
    }
}
