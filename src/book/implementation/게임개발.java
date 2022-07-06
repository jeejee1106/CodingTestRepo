package book.implementation;

import java.math.BigDecimal;

public class 게임개발 {
    
    public static void main(String[] args) {
        int n = 4; //3 <= n <= 50 맵의 세로크기
        int m = 4; //3 <= m <= 50 맵의 가로크기
        int x = 1; //캐릭터의 위치 (x, y)
        int y = 1; //캐릭터의 위치 (x, y)
        int direction = 0; // 캐릭터가 바라보는 방향 (0:북쪽,  1:동쪽, 2:남쪽, 3:서쪽)
        int[][] map = {{1, 1, 1, 1}, //0:육지, 1:바다
                       {1, 0, 0, 1},
                       {1, 1, 0, 1},
                       {1, 1, 1, 1}};

        System.out.println("solution1 = " + 게임개발.solution1(n, m, x, y, direction, map)); //3

    }

    /////////////////[solution 시작]/////////////////

    /**
     * 풀이 시간은 40분인데 한 2시간 정도 걸린 것 같다.. 맘에 안든다..
     * 풀이는 그래도 디버깅 돌려가며 열심히 했다! 어렵다... 내일 복습 필수!!!!
     */
    public static int solution1(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int xPos = x;
        int yPos = y; //캐릭터가 처음 서 있는 위치
        int[][] visitPos = new int[m][n]; //방문한 위치를 저장하기 위한 2차원 배열 생성 - 0으로 자동 초기화, 방문했으면 해당 좌표 1로 변경
        visitPos[xPos][yPos] = 1; //현재좌표 방문 처리
        int answer = 1; //시작 좌표를 방문처리하고 코드 돌리기!
        int turnCount = 0; //이동 안하고 회전한 횟수

        //북, 동, 남, 서로 이동할 때 변경되는 좌표크기
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0 , -1};

        while (true) {
            direction -= 1; //1. 캐릭터 회전 시키기
            if (direction == -1) {
                direction = 3; //캐릭터가 바라보는 방향이 0(북쪽)이었을 땐 캐릭터를 회전 시켰을 때 3(서쪽)을 바라보게
            }
            //2. 캐릭터를 회전시켰으니 바라보는 방향으로 이동시키기
            // 근데 이제 바로 이동하는 것이 아닌 가보지 않은 칸이고 육지일 때만 이동해야함!
            // 가봤거나 바다면 그 자리 그대로!
            // 그렇기 때문에 이동해도 되는 칸인지 안되는지 확인 먼저 하기 위해 새로운 변수 선언
            int nx = xPos + dx[direction];
            int ny = yPos + dy[direction];

            //3. 가고자 하는 칸이 육지 && 가보지 않은칸 이면~?
            if (map[nx][ny] == 0 && visitPos[nx][ny] == 0) {
                //3-1. 캐릭터 위치 이동시키기
                xPos += dx[direction];
                yPos += dy[direction];
                //3-2. 한 번 와본 위치라는 것을 저장하기 위해 visitPos 1로 변경해주기
                visitPos[xPos][yPos] = 1;
                //3-3. 이동횟수 카운트 +1 해주기
                answer++;

                //4. 이동했으니 turnCount 다시 0으로 해주고 처음으로 돌아가서 또 회전하기
                turnCount = 0;
                continue;
            } else { //5. 회전했는데 바다거나 한 번 가봐서 이동할 수 없다?
                turnCount++; //회전횟수 +1 해주기
            }

            //6. 네 방향이 모두 가본 칸이거나 바다일 때 (더 이상 움직일 수 없을 때)
            if (turnCount == 4) {
                //7. 뒤로 한 칸 이동해준다 (바라보는 방향은 유지)
                nx = xPos - dx[direction];
                ny = yPos - dy[direction];

                //8. 뒤로 한 칸 이동했는데 바다?? 게임 끝
                if (map[nx][ny] == 1) {
                    break;
                } else { //9. 육지면 위치 저장하고 다시 회전하러 처음으로
                    xPos = nx;
                    yPos = ny;
                    turnCount = 0;
                }
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
        return answer;
    }

}