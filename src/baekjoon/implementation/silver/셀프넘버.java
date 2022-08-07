package baekjoon.implementation.silver;

import java.util.HashMap;

public class 셀프넘버 {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() { //내 풀이
        //10,000 이하의 양의 정수 중 셀프넘버를 출력하시오
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10000; i++) {
            map.put(i, 0);
        }

        for (int i = 1; i <= 10000; i++) {
            int n = 0;
            if (i < 10) {
                n = i + i;
            } else if (i < 100) {
                n = i + (i / 10) + (i % 10);
            } else if (i < 1000) {
                n = i + (i / 100) + ((i % 100) / 10) + ((i % 100) % 10);
            } else if (i < 10000) {
                n = i + (i / 1000) + ((i % 1000) / 100) + (((i % 1000) % 100) / 10) + (((i % 1000) % 100) % 10);
            }
            map.put(n, 1);
        }
        for (int key : map.keySet()) {
            int value = map.get(key);

            if (value == 0) {
                System.out.println(key);
            }
        }
    }

    public static void solution2() { //다른 사람 풀이 참고
        //10,000 이하의 양의 정수 중 셀프넘버를 출력하시오
        
        
    }
}