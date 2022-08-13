package programmers.level1;

public class ���¼��ڴ��ϱ� {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0}; //14
        int[] numbers2 = {5,8,4,0,6,7,9}; //6

        System.out.println(���¼��ڴ��ϱ�.solution1(numbers)); //14
        System.out.println(���¼��ڴ��ϱ�.solution1(numbers2)); //6
        System.out.println(���¼��ڴ��ϱ�.solution2(numbers)); //14
        System.out.println(���¼��ڴ��ϱ�.solution2(numbers2)); //6
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] numbers) {
        int answer = 45; //0~9���� ��� ���� ��

        //1. 0~9�� ��� ���� 45���� �ִ� ���ڸ� ��� ���ָ� ���� ���ڸ� ���� ���� �ȴ�.
        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }

    public static int solution2(int[] numbers) {
        int answer = 45; //0~9���� ��� ���� ��

        //���� for���� �� Ǯ��
        for(int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}