package programmers.level0;

public class �ֻ����ǰ��� {
    public static void main(String[] args) {
        int[] box1 = {1, 1, 1};
        int n1 = 1;

        int[] box2 = {10, 8, 6};
        int n2 = 3;

        System.out.println(�ֻ����ǰ���.solution1(box1, n1)); //1
        System.out.println(�ֻ����ǰ���.solution1(box2, n2)); //12
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] box, int n) {
        int answer = 1;

        for (int i : box) {
            answer *= i / n;
        }

        return answer;
    }
}
