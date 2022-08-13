package book.greedy;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class ���̵ɶ����� {
    // 1�� �� �� ����
    public static void main(String[] args) {
        int n1 = 17;
        int k1 = 4;

        int n2 = 25;
        int k2 = 5;

        int n3 = 43;
        int k3 = 4;

        System.out.println(���̵ɶ�����.solution1(n1, k1)); // 3
        System.out.println(���̵ɶ�����.solution1(n2, k2)); // 2
        System.out.println(���̵ɶ�����.solution1(n3, k3)); // 8

        System.out.println(���̵ɶ�����.solution2(n1, k1)); // 3
        System.out.println(���̵ɶ�����.solution2(n2, k2)); // 2
        System.out.println(���̵ɶ�����.solution2(n3, k3)); // 8
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int n, int k) { //�� Ǯ�� - 6�� �ɸ�
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int answer = 0;

        //1. n�� 1�� �� �� ���� while���� ������.
        while (n > 1) {
            if(n == 1){ //2. �Ʒ��� if���� ���� �ǰ� n�� 1�� �Ǹ� for���� ���������� ���� ���� �����ش�.
                break;
            }
            if (n % k == 0) { //3. n�� k�� �� ������ �������ٸ� �� ���� n�� �ִ´�.
                n = n / k;
                answer++; //4. ��� Ƚ���� �÷��ش�.(count)
            } else { //5. n�� k�� ������ �������� �ʴ´ٸ� n���� 1�� ���ְ� ���������� ��� Ƚ���� �÷��ش�.
                n -= 1;
                answer++;
            }
        }

        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;
        System.out.println("elapsedTime(ns) : " + elapsedTime);
        return answer; //6. ���� ���� if������ n�� 1�� �Ǿ����� Ȯ���ߴٸ� while���� �������� ��� Ƚ���� return!
    }

    /**
     * å�� ���� �ִ� �Ͱ� ���� �ٸ��� ������ (��� �� �ڵ尡 �� �����غ��̰� å�� �ڵ�� �� ������ �ϴ��� �� ���ذ� ���� �����̤�)
     * ���̵��� ������ ����� �� ����!
     * �� if���� ���� �� �ٵ��� �� ������? ����غ��߰ڴ�.
     */

    //å�� �ڵ带 ����Ҵ�.
    ////////////////���� ����� �ȳ��´�. ���̽� �ڵ带 �ؼ��ؼ� �ڹٷ� �Ű�µ� ���� �߸��� ����̴�........////////////
    public static int solution2(int n, int k) {
        int result = 0;

        while (true) {
            // (n==k�� ������ �������� ��)�� �� ������ 1�� ����
            int target = (n % k) * k;
            result += (n - target);
            n = target;

            // n�� k���� ���� �� (�� �̻� ���� �� ���� ��) �ݺ��� Ż��
            if (n < k) {
                break;
            }
            //k�� ������
            result += 1;
            n %= k;
        }

        // ���������� ���� ���� ���Ͽ� 1�� ����
        result += n - 1;
        return result;
    }
}