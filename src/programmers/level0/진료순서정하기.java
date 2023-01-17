package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 진료순서정하기 {
    public static void main(String[] args) {
        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};

        System.out.println(Arrays.toString(진료순서정하기.solution1(emergency1))); //[3, 1, 2]
        System.out.println(Arrays.toString(진료순서정하기.solution1(emergency2))); //[7, 6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(진료순서정하기.solution1(emergency3))); //[2, 4, 3, 5, 1]

        System.out.println(Arrays.toString(진료순서정하기.solution2(emergency1))); //[3, 1, 2]
        System.out.println(Arrays.toString(진료순서정하기.solution2(emergency2))); //[7, 6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(진료순서정하기.solution2(emergency3))); //[2, 4, 3, 5, 1]
    }

    /////////////////[solution 시작]/////////////////
    //평균속도 0.4ms
    public static int[] solution1(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] cloneArr = emergency.clone();

        Arrays.sort(emergency);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], emergency.length - i);
        }

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(cloneArr[i]);
        }

        return answer;
    }


    //평균속도 0.01~0.02ms
    public static int[] solution2(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }

        return answer;
    }
}
