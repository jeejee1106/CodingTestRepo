package programmers.level0;

public class �ﰢ���ǿϼ�����2 {
    public static void main(String[] args) {
        int[] sides1 = {1, 2};
        int[] sides2 = {3, 6};
        int[] sides3 = {11, 7};

        System.out.println(�ﰢ���ǿϼ�����2.solution1(sides1)); //1
        System.out.println(�ﰢ���ǿϼ�����2.solution1(sides2)); //5
        System.out.println(�ﰢ���ǿϼ�����2.solution1(sides3)); //13
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] sides) {
        int bigNum = Math.max(sides[0], sides[1]);
        int smallNum = Math.min(sides[0], sides[1]);

        //� 2���� �־����� �� �ﰢ���� �� �� �ִ� ����
        //�׻� ū ������ ���� ���� �� ������ 1�� ���� ������, ū ���� ���� ���� ���� ������ 1�� �� ��������
        int lowLimit = bigNum - smallNum + 1;
        int highLimit = bigNum + smallNum - 1;

        return highLimit - lowLimit + 1;
    }

}
