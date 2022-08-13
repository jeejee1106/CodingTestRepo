package book.implementation;

import java.math.BigDecimal;

public class �����¿� {

    public static void main(String[] args) {
        int n1 = 5;
        char[] position1 = {'R', 'R', 'R', 'U', 'D', 'D'};

        int n2 = 13;
        char[] position2 = {'L', 'L', 'D', 'D', 'D', 'D', 'R', 'R', 'R', 'R', 'R', 'D', 'R', 'R', 'D', 'D', 'R', 'U', 'R', 'U', 'L'};

        int n3 = 4;
        char[] position3 = {'R', 'R', 'D', 'D', 'R', 'U', 'R', 'U', 'L'};

        System.out.println("solution1 = " + �����¿�.solution1(n1, position1)); // (3, 4)
        System.out.println("solution1 = " + �����¿�.solution1(n2, position2)); // (6, 9)
        System.out.println("solution1 = " + �����¿�.solution1(n3, position3)); // (1, 3)

        System.out.println("solution2 = " + �����¿�.solution2(n1, position1)); // (3, 4)
        System.out.println("solution2 = " + �����¿�.solution2(n2, position2)); // (6, 9)
        System.out.println("solution2 = " + �����¿�.solution2(n3, position3)); // (1, 3)

        System.out.println("solution3 = " + �����¿�.solution3(n1, position1)); // (3, 4)
        System.out.println("solution3 = " + �����¿�.solution3(n2, position2)); // (6, 9)
        System.out.println("solution3 = " + �����¿�.solution3(n3, position3)); // (1, 3)
    }

    /////////////////[solution ����]/////////////////
    public static String solution1(int n, char[] position) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int x = 1, y = 1;

        //R = [ , +1], L = [ , -1], U = [+1, ], D[-1, ]
        for (char pos : position) {
            if (pos == 'R') {
                if (y >= n) {
                    continue;
                }
                y += 1;
            } else if (pos == 'L') {
                if (y <= 1) {
                    continue;
                }
                y -= 1;
            } else if (pos == 'U') {
                if (x <= 1) {
                    continue;
                }
                x -= 1;
            } else {
                if (x >= n) {
                    continue;
                }
                x += 1;
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return "(" + x + ", " + y + ")";
    }

    public static String solution2(int n, char[] position) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int x = 1, y = 1;

        //if�� ���� if���� ���� �����ڷ� �ٲ㺸�Ҵ�. �ڵ�� �� ª�������� ��������� �ð����⵵�鿡���� �� ���������� �� �𸣰ڴ�.
        for (char pos : position) {
            if (pos == 'R') {
                y = y>=n ? y : y+1;
            } else if (pos == 'L') {
                y = y<= 1 ? y : y-1;
            } else if (pos == 'U') {
                x = x<=1 ? x : x-1;
            } else {
                x = x>=n ? x : x+1;
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return "(" + x + ", " + y + ")";
    }

    public static String solution3(int n, char[] position) {
        /**
         * å�� Ǯ�� : Ȯ���� �� �ڵ庸�� �ξ� ����ϱ� �ϴ�.�̵��� �� �ִ� ��ǥ�� �迭��..!
         * ���� ����� ���� �ƴ� ���� �����ϵ��� �ϴ� �ڵ嵵 ����� �� ����.
         * �׷����� �ڵ���� �ӵ��� ������ ��� �� �ڵ尡 ���� �� ���� ���� Ȯ���� �� �ִ�..!����..!
         */
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int x = 1, y = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // �̵� ��ȹ�� �ϳ��� Ȯ��
        for (int i = 0; i < position.length; i++) {
            char plan = position[i];
            // �̵� �� ��ǥ ���ϱ�
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // ������ ����� ��� ����
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // �̵� ����
            x = nx;
            y = ny;
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return "(" + x + ", " + y + ")";
    }
}