package programmers.level0;

import java.util.Arrays;

public class ���ӵȼ����� {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 4;
        int num4 = 5;

        int total1 = 12;
        int total2 = 15;
        int total3 = 14;
        int total4 = 5;

        System.out.println(Arrays.toString(���ӵȼ�����.solution1(num1, total1))); //[3, 4, 5]
        System.out.println(Arrays.toString(���ӵȼ�����.solution1(num2, total2))); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(���ӵȼ�����.solution1(num3, total3))); //[2, 3, 4, 5]
        System.out.println(Arrays.toString(���ӵȼ�����.solution1(num4, total4))); //[-1, 0, 1, 2, 3]

        System.out.println();

        System.out.println(Arrays.toString(���ӵȼ�����.solution2(num1, total1))); //[3, 4, 5]
        System.out.println(Arrays.toString(���ӵȼ�����.solution2(num2, total2))); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(���ӵȼ�����.solution2(num3, total3))); //[2, 3, 4, 5]
        System.out.println(Arrays.toString(���ӵȼ�����.solution2(num4, total4))); //[-1, 0, 1, 2, 3]

    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(int num, int total) {
        int[] answer = new int[num];
        int sum = 0; //�� 0, index[0]==0�� �������� ���

        //�迭�� 0���� num-1 ���� ������� �־��ֱ� -> ���ӵ� ���ڸ� ����� ����
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i;
            sum += answer[i]; //0���� ���� ���ڸ� sum�� �־��ֱ�
        }

        //���� total�� ������ �� ���� �ݺ�
        while (sum != total) {
            if (sum < total) { //���� total���� ������ �迭�� ���ҿ� 1�� ���ؼ� total�� ������ �� ���� �ݺ�
                sum = 0; //�� �ʱ�ȭ�ؼ� �ٽ� ���ؼ� �ֱ�
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = answer[i] + 1;
                    sum += answer[i];
                }
            } else if (sum > total) { //���� total���� ũ�� �迭�� ���Ҹ� 1�� ���� total�� ������ �� ���� �ݺ�
                sum = 0; //�� �ʱ�ȭ�ؼ� �ٽ� ���ؼ� �ֱ�
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = answer[i] - 1;
                    sum += answer[i];
                }
            }
        }
        return answer;
    }

    public static int[] solution2(int num, int total) {
        int[] answer = new int[num];
        int sum = 0; //�� 0, index[0]==0�� �������� ���
        int startNum = 0;

        //���� �迭�� 0~num���� �־ ���ҵ��� ���� ����� �ʿ䰡 ����
        //why? �迭�� ���� �ʾƵ� 0~num���� �ݺ������� ������ �����ָ� �Ǵϱ�!
        for(int i = 0; i < num; i++){
            sum += i;
        }

        //���� total�� ������ �� ���� �ݺ�
        //���� total���� �۴ٸ� �� ������ ���� 1�� �������� �ٽ� ���� ���ϱ� ������ �ᱹ ������ ����(=num)��ŭ �����ָ� �ǰ�, �ݴ��� ���� num��ŭ ���ָ� �ȴ�!!! ���
        while (sum != total) {
            if (sum < total) {
                sum += num;
                startNum++; //�ݺ����� �� �� �� �� ���� index[0]�� ���� 1�� ����
            } else {
                sum -= num;
                startNum--; //�ݺ����� �� �� �� �� ���� index[0]�� ���� 1�� ����
            }
        }

        //�迭�� �� �־��ֱ�
        for(int i = 0; i < num; i++){
            answer[i] = i + startNum;
        }

        return answer;
    }

}
