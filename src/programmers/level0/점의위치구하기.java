package programmers.level0;

public class ������ġ���ϱ� {
    public static void main(String[] args) {
        int[] dot1 = {2, 4};
        int[] dot2 = {-7, 9};

        System.out.println(������ġ���ϱ�.solution1(dot1)); //1
        System.out.println(������ġ���ϱ�.solution1(dot2)); //2
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
