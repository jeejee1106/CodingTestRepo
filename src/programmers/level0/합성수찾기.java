package programmers.level0;

public class �ռ���ã�� {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        System.out.println(�ռ���ã��.solution1(num1)); //5
        System.out.println(�ռ���ã��.solution1(num2)); //8
    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 0.05ms
    public static int solution1(int n) {
        int answer = 0;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }

        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= i / 2; j++) { //������ ����� ���Ϸ��� ���� ����(?) �̻��� �Ѿ �� �����Ƿ� i/2��ŭ�� ������.
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }

        return answer;
    }
}
