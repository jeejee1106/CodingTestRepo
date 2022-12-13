package programmers.level0;

/**
 * �� ���� ���� ��Ʈ���� �غô� �����ε� �������� �غ��ϱ� �򰥸��� ��ƴ�..
 * �̰� level0�̶��...
 * �� �� �� Ǯ���!!
 */
public class �������� {

    //���ڰ� �ִ� ���� �������� ��������� �ٲپ��� ��ǥ 8����. xy,xy ...�� �о�� 8������ ��ǥ�� ���� �� �ִ�.
    static int[] positionX = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] positionY = {0, 0, -1, 1, -1, 1, 1, -1};

    public static void main(String[] args) {
        int[][] board1 = {{0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0}};

        int[][] board2 = {{0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 1, 1, 0},
                          {0, 0, 0, 0, 0}};

        int[][] board3 = {{1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1}};

        System.out.println(��������.solution1(board1)); //16
        System.out.println(��������.solution1(board2)); //13
        System.out.println(��������.solution1(board3)); //0

        System.out.println(��������.solution2(board1)); //16
        System.out.println(��������.solution2(board2)); //13
        System.out.println(��������.solution2(board3)); //0
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[][] board) {
        int answer = 0;
        //��������� ǥ���� �� �ִ� 8���� ���� ���� : x,y�� ¦��� �ؼ��ϸ� �ȴ�.
        //��, ���ڰ� �ִ� ��ü���� ���� ���밡 �� �� �ִ� ������ (0, -1), (0, 1), (-1, 0), (1, 0), (-1, -1), (-1, 1),(1, -1), (1, 1)
        int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
        int[] dy = {-1, 1, 0, 0, -1, 1, -1, 1};

        //1. ���ڰ� �ִ� ��ġ ��ǥ ã��
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) { //���ڰ� �ִٸ�
                    //2. 8���� ������ Ž���� ���� 0��(�������뿴��) �ֵ��� ���� 2�� �ٲ��ֱ�(1�� �ٲٸ� �ȵ�. �׷� ���ڰ� �ִ� �ڸ���� ������)
                    for (int k = 0; k < 8; k++) { //dx.length��ŭ �����°���
                        int x = i + dx[k];
                        int y = j + dy[k]; //�������밡 �� x,y ��ǥ

                        //3. 2���� �迭 �ȿ� �ִ� �ε������� �˻��ؼ� �迭�� ���ԵǸ� 2�� �ٲ��ֱ�
                        if (x >= 0 && y >= 0 && x < board.length && y < board.length) {
                            if(board[x][y] == 0) {
                                board[x][y] = 2;
                            }
                        }
                    }
                }
            }
        }

        //4. �־��� 2���� �迭���� 0�� ������ ã�� ����.
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static int solution2(int[][] board) {
        getLandmine(board, positionX, positionY);
        return safetyCount(board);
    }

    private static void getLandmine(int[][] board, int[] positionX, int[] positionY) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    changeStatus(board, positionX, positionY, i, j);
                }
            }
        }
    }

    private static void changeStatus(int[][] board, int[] positionX, int[] positionY, int i, int j) {
        for (int k = 0; k < 8; k++) {
            int nextX = i + positionX[k];
            int nextY = j + positionY[k];
            if (nextX >= 0 && nextY >= 0 && nextX < board.length && nextY < board.length) {
                if (board[nextX][nextY] == 0) {
                    board[nextX][nextY] = 2;
                }
            }
        }
    }

    private static int safetyCount(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }


}
