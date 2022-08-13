package book.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class �Ž����� {
    public static void main(String[] args) {
        int n1 = 7410;
        int n2 = 4810;
        int n3 = 1920;
        int n4 = 8170;

        System.out.println(�Ž�����.solution1(n1)); //19
        System.out.println(�Ž�����.solution1(n2)); //13
        System.out.println(�Ž�����.solution1(n3)); //9
        System.out.println(�Ž�����.solution1(n4)); //20

    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int n) { //�� Ǯ��
        int answer = 0;
        //1. �����迭 �����(ū ������)
        int[] coins = {500, 100, 50, 10};

        //2. ū �������� �ݺ��� ������
        for (int i = 0; i < 4; i++) {
            int coin = coins[i]; //������ ������� ����
            answer += n / coin; //answer�� �ݾ��� �������� ���� �� ��� �����ֱ�
            n %= coin; //�ݾ��� Ư�� �������� ���� ������ ���� ������
        }
        return answer;
    }

}