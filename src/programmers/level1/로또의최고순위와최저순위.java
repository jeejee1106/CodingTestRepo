package programmers.level1;

import java.util.Arrays;

public class �ζ����ְ�������������� {
    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(�ζ����ְ��������������.solution1(lottos1, win_nums1))); //[3, 5]
        System.out.println(Arrays.toString(�ζ����ְ��������������.solution1(lottos2, win_nums2))); //[1, 6]
        System.out.println(Arrays.toString(�ζ����ְ��������������.solution1(lottos3, win_nums3))); //[1, 1]
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(int[] lottos, int[] win_nums) {
        int winCount = 0; //�� ��ȣ�� win_nums��ȣ �� ��ġ�ϴ� ��ȣ�� ����
        int zeroCount = 0; //�� ��ȣ �� 0�� ����

        for(int lotto : lottos){
            if(lotto == 0){
                zeroCount++;
                continue;
            }
            for(int win_num : win_nums){
                if(lotto == win_num){
                    winCount++;
                    break;
                }
            }
        }

        int maxTotal = zeroCount + winCount; //�ִ� ��������

        if(maxTotal == 0){ //���������� 0���� 1�� �ְڴ�.
            maxTotal = 1;
        }
        if(winCount == 0){ //���������� 0���� 1�� �ְڴ�.
            winCount = 1;
        }

        int[] answer = {7-maxTotal, 7-winCount};
        //7���� 0�� ������ ��ġ�ϴ� ������ ���� ���� ���ָ� ����� ���´�.(�ִ�)
        //7���� ��ġ�ϴ� ��ȣ�� ����(winCount)�� ���ָ� ����� ���´�.(�ּڰ�)

        return answer;
    }
}