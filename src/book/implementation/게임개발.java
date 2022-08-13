package book.implementation;

import java.math.BigDecimal;

public class ���Ӱ��� {

    public static void main(String[] args) {
        int n = 4; //3 <= n <= 50 ���� ����ũ��
        int m = 4; //3 <= m <= 50 ���� ����ũ��
        int x = 1; //ĳ������ ��ġ (x, y)
        int y = 1; //ĳ������ ��ġ (x, y)
        int direction = 0; // ĳ���Ͱ� �ٶ󺸴� ���� (0:����,  1:����, 2:����, 3:����)
        int[][] map = {{1, 1, 1, 1}, //0:����, 1:�ٴ�
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}};

        /**
         * 220710
         * �� ���ø� �߰��� �� ������ ���
         * å�� �ִ� ���÷δ� �� Ǯ�̴�, å�� Ǯ�̴� ���α׷��� �� ���������,
         * �ٸ� ���ø� �־�� ��� Ǯ�̰� ����� �������� �ʴ´�.
         * å ��򰡿� 'å�� ���� ���ø� ������ �� �ִ�' ��� ������ �� ���� �ִµ� ��¥����...
         * �� �� �ڵ尡 �߸��� �� �˰� �ﻷ�ߴ� �̤�
         * �ƹ�ư å�� Ǯ�̴� ���� �ϰ� �ٸ� ���ܵ� �� ó���� �� �ֵ��� ����ؾ߰ڴ�.
         */
        int n2 = 7; //3 <= n <= 50 ���� ����ũ��
        int m2 = 7; //3 <= m <= 50 ���� ����ũ��
        int x2 = 4; //ĳ������ ��ġ (x, y)
        int y2 = 2; //ĳ������ ��ġ (x, y)
        int direction2 = 3; // ĳ���Ͱ� �ٶ󺸴� ���� (0:����,  1:����, 2:����, 3:����)
        int[][] map2 = {{1, 1, 1, 1, 0, 0, 0}, //0:����, 1:�ٴ�
                {1, 0, 0, 1, 0, 1, 1},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 0}};
        System.out.println("solution2 = " + ���Ӱ���.solution1(n2, m2, x2, y2, direction2, map2)); //3

        System.out.println("solution1 = " + ���Ӱ���.solution1(n, m, x, y, direction, map)); //3
        System.out.println("solution2 = " + ���Ӱ���.solution2(n, m, x, y, direction, map)); //3
        System.out.println("solution3 = " + ���Ӱ���.solution3(n, m, x, y, direction, map)); //3
        System.out.println("solution4 = " + ���Ӱ���.solution4(n, m, x, y, direction, map)); //3

    }

    /////////////////[solution ����]/////////////////

    /**
     * Ǯ�� �ð��� 40���ε� �� 2�ð� ���� �ɸ� �� ����.. ���� �ȵ��..
     * Ǯ�̴� �׷��� ����� �������� ������ �ߴ�! ��ƴ�... ���� ���� �ʼ�!!!!
     */
    public static int solution1(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int xPos = x;
        int yPos = y; //ĳ���Ͱ� ó�� �� �ִ� ��ġ
        int[][] visitPos = new int[m][n]; //�湮�� ��ġ�� �����ϱ� ���� 2���� �迭 ���� - 0���� �ڵ� �ʱ�ȭ, �湮������ �ش� ��ǥ 1�� ����
        visitPos[xPos][yPos] = 1; //������ǥ �湮 ó��
        int answer = 1; //���� ��ǥ�� �湮ó���ϰ� �ڵ� ������!
        int turnCount = 0; //�̵� ���ϰ� ȸ���� Ƚ��

        //��, ��, ��, ���� �̵��� �� ����Ǵ� ��ǥũ��
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0 , -1};

        while (true) {
            direction -= 1; //1. ĳ���� ȸ�� ��Ű��
            if (direction == -1) {
                direction = 3; //ĳ���Ͱ� �ٶ󺸴� ������ 0(����)�̾��� �� ĳ���͸� ȸ�� ������ �� 3(����)�� �ٶ󺸰�
            }
            //2. ĳ���͸� ȸ���������� �ٶ󺸴� �������� �̵���Ű��
            // �ٵ� ���� �ٷ� �̵��ϴ� ���� �ƴ� ������ ���� ĭ�̰� ������ ���� �̵��ؾ���!
            // ���ðų� �ٴٸ� �� �ڸ� �״��!
            // �׷��� ������ �̵��ص� �Ǵ� ĭ���� �ȵǴ��� Ȯ�� ���� �ϱ� ���� ���ο� ���� ����
            int nx = xPos + dx[direction];
            int ny = yPos + dy[direction];

            //3. ������ �ϴ� ĭ�� ���� && ������ ����ĭ �̸�~?
            if (map[nx][ny] == 0 && visitPos[nx][ny] == 0) {
                //3-1. ĳ���� ��ġ �̵���Ű��
                xPos += dx[direction];
                yPos += dy[direction];
                //3-2. �� �� �ͺ� ��ġ��� ���� �����ϱ� ���� visitPos 1�� �������ֱ�
                visitPos[xPos][yPos] = 1;
                //3-3. �̵�Ƚ�� ī��Ʈ +1 ���ֱ�
                answer++;

                //4. �̵������� turnCount �ٽ� 0���� ���ְ� ó������ ���ư��� �� ȸ���ϱ�
                turnCount = 0;
                continue;
            } else { //5. ȸ���ߴµ� �ٴٰų� �� �� ������ �̵��� �� ����?
                turnCount++; //ȸ��Ƚ�� +1 ���ֱ�
            }

            //6. �� ������ ��� ���� ĭ�̰ų� �ٴ��� �� (�� �̻� ������ �� ���� ��)
            if (turnCount == 4) {
                //7. �ڷ� �� ĭ �̵����ش� (�ٶ󺸴� ������ ����)
                nx = xPos - dx[direction];
                ny = yPos - dy[direction];

                //8. �ڷ� �� ĭ �̵��ߴµ� �ٴ�?? ���� ��
                if (map[nx][ny] == 1) {
                    break;
                } else { //9. ������ ��ġ �����ϰ� �ٽ� ȸ���Ϸ� ó������
                    xPos = nx;
                    yPos = ny;
                    turnCount = 0;
                }
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return answer;
    }

    /**
     * �������� �ٽ� Ǯ��ô�.
     * ������ ��ƴ� �̤� ���� �� �� �� �����ؾ߰ڴ�.
     * �׷��� �ð��� 30�и��� Ǯ����!
     */
    public static int solution2(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int answer = 1; //ĳ���Ͱ� �湮�� ĭ �� - ó�� ������ ĭ�� �湮�ߴٰ� �����ϰ� 1�� �ʱ�ȭ
        int xPos = x;
        int yPos = y;
        int[][] visitPos = new int[m][n]; //ĳ���Ͱ� �湮�� ��ġ�� ǥ���ϱ� ���� 0���� �ʱ�ȭ, �湮������ 1�� ������ ����
        visitPos[x][y] = 1; //ó�� ���� ��ġ�� �湮�� ĭ�� �Ǵ� 1�� ����
        int turnCount = 0; //ĳ������ ȸ���� ����. turnCount�� 4�� �Ǹ� �� �̻� �̵��� �� ���� ������
        //ĳ���Ͱ� �ٶ󺸴� ���⿡�� �� ĭ �������� �� �ٲ�� ��ǥũ��(?). ��,��,��,�� ������
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0 , -1};

        //�ùķ��̼� ����
        while (true) {
            //1. ĳ���� ȸ����Ű��
            direction -= 1;
            if (direction == -1) {
                direction = 3;
            }
            //2. ������ �������� ���� ��ǥ�� ���� �� �������� ����, ������ ��ġ�� ���ڸ�
            int nx = xPos + dx[direction];
            int ny = yPos + dy[direction];
            // ��, (nx, ny)�� �� ���� �Ȱ��ð�(visitPos[nx][ny]), ������ ��(map[nx][ny] == 0)�� ����
            if (visitPos[nx][ny] == 0 && map[nx][ny] == 0) {
                xPos = nx;
                yPos = ny; //ĳ���� �̵�������
                visitPos[xPos][yPos] = 1; //�� �� �ͺôٴ� ���� �����ϱ� ����.
                answer++;
                turnCount = 0;
                continue; //�̵������� ȸ������ �ٽ�
            } else { //(nx, ny)�� ������ �ְų� �ٴٸ� ���ڸ�
                turnCount++; //ȸ������ �÷��ֱ�
            }
            //3. ȸ������ 4�� �Ǹ� �� �̻� �������� ���ϴ� ����. �ڷ� �� ĭ ���ֱ�
            if (turnCount > 4) {
                nx = xPos - dx[direction];
                ny = yPos - dy[direction];

                if (map[nx][ny] == 1) { //�ڷ� ���µ� �űⰡ �ٴ�???
                    break; //���� ��
                } else {
                    turnCount = 0; //������� ȸ���� 0���� �ʱ�ȭ �����ְ� �ٽ� ó������
                    continue;
                }
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return answer;
    }

    /**
     * 220708 ���� - 15�� Ŭ����!
     * �ڲ� �򰥸��� �κ��� �ִ�.
     * turnCount�� 4�� ���� �� ĭ �ڷΰ��µ�, �̶� if���� �ϳ� �� �Ἥ �ڷ� �� ĭ�� �ٴ����� �������� Ȯ���� �ؾ��Ѵ�.
     * �ڷ� �� ĭ �� �� �� ĭ�� ��ǥ�� nx ������ �־ �Ǵµ�, �ڲ�
     * '���ο� ������ �����ؼ� �ٽ� �־�����ϴ°� �ƴѰ�? ������ �̹� nx�� �� ĭ ������ �� �ɷ� �ʱ�ȭ �Ʊ� ������ �� ĭ �ڷΰ��� �ᱹ ���ڸ� �ƴѰ�???'
     * ��� ������ �Ѵ٤̤�
     * ������ �̹� nx�� �� ĭ ������ �� �� �´µ�, ������ nx = ~ �̷��� ������ ���ʱ�ȭ�� �Ǵ°Ŵϱ� ��� ���٤̤�
     * �� �⺻���� �� �ڲ� �򰥷��Ѵ� �� �ٺ�........
     */
    public static int solution3(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int answer = 1;
        int xPos = x;
        int yPos = y;
        int[][] visitPos = new int[m][n];
        visitPos[x][y] = 1;
        //��,��,��,��
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int turnCount = 0;

        while (true) {
            //�������� ȸ�� ��Ű��
            direction -= 1;
            if (direction == -1) {
                direction = 3;
            }

            //�� ĭ �̵��ϱ�
            int nx = xPos + dx[direction];
            int ny = yPos + dy[direction];

            if (map[nx][ny] == 0 && visitPos[nx][ny] == 0) {
                xPos = nx;
                yPos = ny;
                turnCount = 0;
                visitPos[xPos][yPos] = 1;
                answer++;
                continue;
            } else {
                turnCount++;
            }

            if (turnCount == 4) {
                int nx2 = xPos - dx[direction]; //���ο� ���� �ٽ� �ȸ��� ��!!!!!!!!!!!!!!!!!!!!
                int ny2 = yPos - dy[direction]; //���� ������ nx �ٽ� �ᵵ ��!!!! ������ ���ʱ�ȭ�� �� ĭ �ڷ� ������ �� �¾�!!
                if (map[nx2][ny2] == 1) {
                    break;
                } else {
                    xPos = nx2;
                    yPos = ny2;
                    turnCount = 0;
                    continue;
                }
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return answer;
    }

    /**
     * 220709 ���� - 8�� 30�� Ŭ����!
     * ���� ������ ���� �ܿ��� �׷��� ��������.
     * ���� �̷��� �ܿ����� �̷� ������ �ͼ�������, ���߿� ��¥ ���׿��� ������ �� �ִ� ����� ������ ���ڴ�.
     * ���� �����Ͽ� �� ������ ���� ������ ����.
     */
    public static int solution4(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int answer = 1;
        int xPos = x;
        int yPos = y;
        int[][] visitPos = new int[m][n];
        visitPos[x][y] = 1;
        //��,��,��,���� �������� �� ���ϴ� ��ǥ ũ��
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0 , -1};
        int turnCount = 0;

        while (true) {
            direction -= 1; //�������� ȸ��
            if(direction == -1){
                direction = 3;
            }
            int nx = xPos + dx[direction];
            int ny = yPos + dy[direction];

            if (map[nx][ny] == 0 && visitPos[nx][ny] == 0) {
                xPos = nx;
                yPos = ny;
                answer++;
                visitPos[xPos][yPos] = 1;
                turnCount = 0;
                continue;
            } else {
                turnCount++;
            }

            if (turnCount == 4) {
                nx = xPos - dx[direction];
                ny = yPos - dy[direction];
                if (map[nx][ny] == 1) {
                    break;
                } else {
                    xPos = nx;
                    yPos = ny;
                    turnCount = 0;
                    continue;
                }
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "��");
        return answer;
    }

}