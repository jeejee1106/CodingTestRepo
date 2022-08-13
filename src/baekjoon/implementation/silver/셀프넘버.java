package baekjoon.implementation.silver;

import java.util.HashMap;

public class �����ѹ� {
    public static void main(String[] args) {
//        solution1();
        solution2();
    }

    public static void solution1() { //�� Ǯ��
        //10,000 ������ ���� ���� �� �����ѹ��� ����Ͻÿ�
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

    public static void solution2() { //�ٸ� ��� Ǯ�� - �ӵ��� �ξ� ������....���� 1.7������....
        boolean[] check = new boolean[10001]; //�־��� ���� ������ 1���� 10000�̹Ƿ�

        for (int i = 1; i < 10001; i++){
            int n = d(i);

            if(n < 10001){ // 10000 �� �Ѵ� ���� �ʿ䰡 ����
                check[n] = true; //n�� �����ڰ� �ִ� ���̱� ������ true�Է�
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) { // false �� �ε����� ���
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number){
        int sum = number;

        while(number != 0){
            sum = sum + (number % 10); // 1�� �ڸ���
            number = number/10;	// 10�� ������ 1���ڸ��� ���ش�
        }

        return sum;
    }
}