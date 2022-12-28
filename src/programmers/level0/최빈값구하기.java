package programmers.level0;

import java.util.HashMap;

public class �ֺ󰪱��ϱ� {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1};
        System.out.println(�ֺ󰪱��ϱ�.solution1(array1)); //3
        System.out.println(�ֺ󰪱��ϱ�.solution1(array2)); //-1
        System.out.println(�ֺ󰪱��ϱ�.solution1(array3)); //1

        System.out.println(�ֺ󰪱��ϱ�.solution2(array1)); //3
        System.out.println(�ֺ󰪱��ϱ�.solution2(array2)); //-1
        System.out.println(�ֺ󰪱��ϱ�.solution2(array3)); //1
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] array) {
        int answer = 0;

        //array���� �ִ� ���ϱ�
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }

        //������ ���� �ִ�+1 ������ �迭 �����
        int[] countArr = new int[maxNum + 1];
        //countArr �迭�� �� �ε����� �ش��ϴ� ���ڰ� �� �� ���Դ��� ī��Ʈ�ϱ�
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++;
        }

        //�ֺ��� ������ ���ϱ�
        int maxCount = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > maxCount) {
                maxCount = countArr[i];
                answer = i;
            }
        }

        //�ֺ󰪿� �ߺ��� �ִ��� Ȯ��
        int duplicateNum = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == maxCount) {
                duplicateNum++;
            }
        }

        if (duplicateNum != 1) {
            return -1;
        }

        return answer;
    }

    public static int solution2(int[] array) {
        int answer = 0;
        int maxCount = 0; //�ֺ��� ���� ����
        HashMap<Integer, Integer> map = new HashMap<>(); //array�� ���Ҹ� key��, ���� Ƚ���� value�� ���� ��

        for (int number : array) {
            //1. number�� �� �� ������ ������ �ش� key�� ���� value�� +1 ���ش�.
            int count = map.getOrDefault(number, 0) + 1;

            if (count > maxCount) {
                maxCount = count; //2-1. number�� ������ Ƚ��(count)�� ���� �ֺ��� ���� number�� �󵵼��� �� ũ�� �ֺ� ��ü.
                answer = number; //2-2. number�� ������ Ƚ��(count)�� ���� �ֺ��� ���� number�� �󵵼��� �� ũ�ٴ� ����? number�� �ֺ��̶�� ��.
            } else if (count == maxCount) { //3. number�� ����Ƚ���� ���� �ֺ��� ���ٴ� ���� ���� ����Ƚ���� ���ٴ� ���̹Ƿ� -1 ��ȯ
                answer = -1;
            }
            map.put(number, count); //4. ���������� map�� key, value�� �־���. �׷��� for���� ���鼭 ���� number�� ������ �� value+1�� ���ִϱ�.
        }

        return answer;
    }
}
