package programmers.level0;

import java.util.*;

public class 소인수분해 {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 17;
        int n3 = 420;

        System.out.println(Arrays.toString(소인수분해.solution1(n1))); //[2, 3]
        System.out.println(Arrays.toString(소인수분해.solution1(n2))); //[17]
        System.out.println(Arrays.toString(소인수분해.solution1(n3))); //[2, 3, 5, 7]

        System.out.println(Arrays.toString(소인수분해.solution2(n1))); //[2, 3]
        System.out.println(Arrays.toString(소인수분해.solution2(n2))); //[17]
        System.out.println(Arrays.toString(소인수분해.solution2(n3))); //[2, 3, 5, 7]

    }

    /////////////////[solution 시작]/////////////////
    //평균속도 0.7ms
    public static int[] solution1(int n) {
        Set<Integer> set = new HashSet<>();
        int num = 2;

        while (n >= 2) {
            if (n % num == 0) {
                set.add(num);
                n /= num;
            } else {
                num++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Integer integer : set) {
            list.add(integer);
        }

        int[] answer = new int[set.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    //평균속도 0.05ms -> Set을 안쓰니 속도 차이가 어마어마 하네
    public static int[] solution2(int n) {
        List<Integer> list = new ArrayList<>();

        int num = 2;

        while(n > 1){
            if(n % num == 0){
                if(!list.contains(num)) //중복제거
                    list.add(num);
                n /= num;
                continue;
            }
            num++;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
