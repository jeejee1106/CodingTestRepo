package programmers.level0;

/**
 * 와 백준 구현 파트에서 해봤던 문제인데 오랜만에 해보니까 헷갈리고 어렵다..
 * 이게 level0이라니...
 * 몇 번 더 풀어보기!!
 */
public class 안전지대 {

    //지뢰가 있는 곳을 기준으로 위험지대로 바꾸어줄 좌표 8방향. xy,xy ...로 읽어보면 8방향의 좌표를 얻을 수 있다.
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

        System.out.println(안전지대.solution1(board1)); //16
        System.out.println(안전지대.solution1(board2)); //13
        System.out.println(안전지대.solution1(board3)); //0

        System.out.println(안전지대.solution2(board1)); //16
        System.out.println(안전지대.solution2(board2)); //13
        System.out.println(안전지대.solution2(board3)); //0
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[][] board) {
        int answer = 0;
        //위험지대로 표시할 수 있는 8가지 방향 정의 : x,y를 짝지어서 해석하면 된다.
        //즉, 지뢰가 있는 위체에서 위험 지대가 될 수 있는 방향은 (0, -1), (0, 1), (-1, 0), (1, 0), (-1, -1), (-1, 1),(1, -1), (1, 1)
        int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
        int[] dy = {-1, 1, 0, 0, -1, 1, -1, 1};

        //1. 지뢰가 있는 위치 좌표 찾기
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) { //지뢰가 있다면
                    //2. 8가지 방향을 탐색해 값이 0인(안전지대였던) 애들의 값을 2로 바꿔주기(1로 바꾸면 안됨. 그럼 지뢰가 있는 자리라고 착각함)
                    for (int k = 0; k < 8; k++) { //dx.length만큼 돌리는거임
                        int x = i + dx[k];
                        int y = j + dy[k]; //위험지대가 될 x,y 좌표

                        //3. 2차원 배열 안에 있는 인덱스인지 검사해서 배열에 포함되면 2로 바꿔주기
                        if (x >= 0 && y >= 0 && x < board.length && y < board.length) {
                            if(board[x][y] == 0) {
                                board[x][y] = 2;
                            }
                        }
                    }
                }
            }
        }

        //4. 주어진 2차원 배열에서 0의 개수를 찾아 리턴.
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
