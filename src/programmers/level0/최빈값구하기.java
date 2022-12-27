package programmers.level0;

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

        return answer;
    }
}
