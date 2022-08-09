package baekjoon.implementation.silver;

import java.util.HashMap;

public class 셀프넘버 {
    public static void main(String[] args) {
//        solution1();
        solution2();
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

    public static void solution2() { //다른 사람 풀이 - 속도가 훨씬 빠르다....거의 1.7배정도....
        boolean[] check = new boolean[10001]; //주어진 수의 범위는 1부터 10000이므로

        for (int i = 1; i < 10001; i++){
            int n = d(i);

            if(n < 10001){ // 10000 이 넘는 수는 필요가 없음
                check[n] = true; //n은 생성자가 있는 수이기 때문에 true입력
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) { // false 인 인덱스만 출력
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number){
        int sum = number;

        while(number != 0){
            sum = sum + (number % 10); // 1의 자리수
            number = number/10;	// 10을 나누어 1의자리를 없앤다
        }

        return sum;
    }
}