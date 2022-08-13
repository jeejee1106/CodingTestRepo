package book.greedy;

import java.util.Arrays;
import java.util.Collections;

public class ū���ǹ�Ģ {
    public static void main(String[] args) {
        int[] num1 = {2, 4, 5, 4, 6}; //num�̶�� �迭�� �ִ�.
        int m1 = 8; //�迭 ���� ���ڵ鳢�� m�� ��ŭ�� ���ϱ⸦ ���� ���̴�.
        int k1 = 3; //��, �� ���ڿ� ���� �������� ���ϱ�� k���� ����!!
        // ������ �� ���� ū ����� return�ض�. ��, �迭 �ȿ� ���� ���ڰ� �־ �ε����� �ٸ��� ������ �ٸ� ���ڷ� ����.

        int[] num2 = {3, 4, 3, 4, 3};
        int m2 = 7;
        int k2 = 2;

        int[] num3 = {1, 45, 12, 14, 4};
        int m3 = 5;
        int k3 = 4;

        System.out.println(ū���ǹ�Ģ.solution1(num1, m1, k1)); //46
        System.out.println(ū���ǹ�Ģ.solution1(num2, m2, k2)); //28
        System.out.println(ū���ǹ�Ģ.solution1(num3, m3, k3)); //194

        System.out.println(ū���ǹ�Ģ.solution2(num1, m1, k1)); //46
        System.out.println(ū���ǹ�Ģ.solution2(num2, m2, k2)); //28
        System.out.println(ū���ǹ�Ģ.solution2(num3, m3, k3)); //194
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] num, int m, int k) { //�� Ǯ��
        int answer = 0;

        //1. �Է¹��� �迭 �����ϱ�
        Arrays.sort(num); //�������� ������ WrapperŬ������ ���ǵ� Ÿ�Ը� �����ϱ� ������ �ϴ� �������� ����.

        //2. ù ��°�� ū ���� �� ��°�� ū �� ã��
        int firstLargestNum = num[num.length-1]; //�������� �����̱� ������ ���� ���� ���ڰ� ���� ū ����,
        int secondLargestNum = num[num.length-2]; //�� ���� ���ڰ� �� ��°�� ū ���ڰ� �ȴ�.

        //3. m�� ���ϱ� (���� ���ϱ�� k���� ����)
        while (m > 0) { //m�� 0���� Ŭ ���� ���� �������� �ݺ�
            for (int i = 1; i <= k; i++) {
                if (m <= 0) { //3-1. ���� m�� 0���� �ƴ����� Ȯ���� �� ���ϱ⸦ ����.
                    break; //���� 0�̶�� �ݺ��� ����������.
                }
                answer += firstLargestNum; //3-2. ù ��°�� ū ���ڸ� k�� �ݺ��ؼ� �����ֱ�
                m--; //3-3. ���ؾ��� Ƚ��(m)�� -1 ���ش�.
            }
            if (m <= 0) { //3-4. k�� �ݺ��� ������ �ٽ� m�� 0���� �ƴ��� �˻��� ��
                break;
            }
            answer += secondLargestNum; //3-5. �� ��°�� ū ���ڸ� �� ���� �����ֱ�
            m--;
        }
        return answer;
    }

    public static int solution2(int[] num, int m, int k) { //���翡 ���� Ǯ��
        /**
         * å������ ���ϱⰡ �ݺ��� ��, �ݺ��Ǵ� ��Ģ�� ������ �����ߴ�.
         * �� Ǯ�̵� Ʋ�� Ǯ�̴� �ƴ�����, m�� ũ�Ⱑ 100�� �̻����� Ŀ���ٸ� �ð��ʰ� ������ ���� �� �ִ�.
         * �׷��� ������ �� ���� �ش��� �����Ѵ�.
         */

        int answer = 0;

        //1. �Է¹��� �迭 �����ϱ�
        Arrays.sort(num); //�������� ������ WrapperŬ������ ���ǵ� Ÿ�Ը� �����ϱ� ������ �ϴ� �������� ����.

        //2. ù ��°�� ū ���� �� ��°�� ū �� ã��
        int firstLargestNum = num[num.length-1]; //�������� �����̱� ������ ���� ���� ���ڰ� ���� ū ����,
        int secondLargestNum = num[num.length-2]; //�� ���� ���ڰ� �� ��°�� ū ���ڰ� �ȴ�.

        //3. ���� ū ���� �����ϴ� Ƚ�� ���ϱ�
        /**
         * m / (k + 1) * k  :  m�� ���� ���̷� ������ �� k�� �����ָ� ���� ū ���� �����ϴ� Ƚ���� ���´�. (�� ������ �������� �� �ش�)
         * m % (k + 1)      :  m�� (k + 1)�� ������ �������� �ʾ��� ��� �� �������� �����ָ� ���� ū ���� �����ϴ� Ƚ���� ���´�.
         */
        int firstLargestNumCount = (m / (k + 1) * k + (m % (k + 1))); //�̷� ������ ������ ȥ�ڼ��� ������ �� �� �ֵ��� ��������!!!

        //4. ���� ū�� * ���� Ƚ��
        answer += firstLargestNum * firstLargestNumCount;

        //5. �� ��°�� ū�� * ���� Ƚ��
        answer += secondLargestNum * (m - firstLargestNumCount); //m���� ���� ū ���� �����ϴ� Ƚ���� ���ָ� �� ��°�� ū ���� �����ϴ� Ƚ���� ����ȴ�.

        return answer;
    }
}