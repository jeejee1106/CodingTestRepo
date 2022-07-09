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
        System.out.println("solution1 = " + 게임개발.solution2(n, m, x, y, direction, map)); //3
        System.out.println("solution1 = " + 게임개발.solution3(n, m, x, y, direction, map)); //3
        System.out.println("solution1 = " + 게임개발.solution4(n, m, x, y, direction, map)); //3

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

    /**
     * 복습으로 다시 풀어봤다.
     * 여전히 어렵다 ㅜㅜ 내일 한 번 더 복습해야겠다.
     * 그래도 시간은 30분만에 풀었다!
     */
    public static int solution2(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int answer = 1; //캐릭터가 방문한 칸 수 - 처음 시작한 칸도 방문했다고 인정하고 1로 초기화
        int xPos = x;
        int yPos = y;
        int[][] visitPos = new int[m][n]; //캐릭터가 방문한 위치를 표시하기 위해 0으로 초기화, 방문했으면 1로 변경할 것임
        visitPos[x][y] = 1; //처음 시작 위치도 방문한 칸이 되니 1로 변경
        int turnCount = 0; //캐릭터의 회전수 세기. turnCount가 4가 되면 더 이상 이동할 수 없는 상태임
        //캐릭터가 바라보는 방향에서 한 칸 전진했을 때 바뀌는 좌표크기(?). 북,동,남,서 순서임
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0 , -1};

        //시뮬레이션 시작
        while (true) {
            //1. 캐릭터 회전시키기
            direction -= 1;
            if (direction == -1) {
                direction = 3;
            }
            //2. 앞으로 전진했을 때의 좌표를 보고 갈 수있으면 전진, 못가는 위치면 제자리
            int nx = xPos + dx[direction];
            int ny = yPos + dy[direction];
            // 즉, (nx, ny)가 한 번도 안가봤고(visitPos[nx][ny]), 육지일 때(map[nx][ny] == 0)만 전진
            if (visitPos[nx][ny] == 0 && map[nx][ny] == 0) {
                xPos = nx;
                yPos = ny; //캐릭터 이동시켜줌
                visitPos[xPos][yPos] = 1; //한 번 와봤다는 것을 저장하기 위함.
                answer++;
                turnCount = 0;
                continue; //이동했으니 회전부터 다시
            } else { //(nx, ny)가 가본적 있거나 바다면 제자리
                turnCount++; //회전수만 늘려주기
            }
            //3. 회전수가 4가 되면 더 이상 움직이지 못하는 상태. 뒤로 한 칸 가주기
            if (turnCount > 4) {
                nx = xPos - dx[direction];
                ny = yPos - dy[direction];

                if (map[nx][ny] == 1) { //뒤로 갔는데 거기가 바다???
                    break; //게임 끝
                } else {
                     turnCount = 0; //육지라면 회전수 0으로 초기화 시켜주고 다시 처음으로
                    continue;
                }
            }
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
        return answer;
    }

    /**
     * 220708 복습 - 15분 클리어!
     * 자꾸 헷갈리는 부분이 있다.
     * turnCount가 4일 때는 한 칸 뒤로가는데, 이때 if문을 하나 더 써서 뒤로 간 칸이 바다인지 육지인지 확인을 해야한다.
     * 뒤로 한 칸 갈 때 그 칸의 좌표를 nx 변수에 넣어도 되는데, 자꾸
     * '새로운 변수를 선언해서 다시 넣어줘야하는거 아닌가? 위에서 이미 nx가 한 칸 앞으로 간 걸로 초기화 됐기 때문에 한 칸 뒤로가면 결국 제자리 아닌가???'
     * 라는 생각을 한다ㅜㅜ
     * 위에서 이미 nx가 한 칸 앞으로 간 건 맞는데, 어차피 nx = ~ 이렇게 넣으면 재초기화가 되는거니까 상관 없다ㅜㅜ
     * 이 기본적인 걸 자꾸 헷갈려한다 이 바보........
     */
    public static int solution3(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int answer = 1;
        int xPos = x;
        int yPos = y;
        int[][] visitPos = new int[m][n];
        visitPos[x][y] = 1;
        //북,동,남,서
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int turnCount = 0;

        while (true) {
            //왼쪽으로 회전 시키기
            direction -= 1;
            if (direction == -1) {
                direction = 3;
            }

            //한 칸 이동하기
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
                int nx2 = xPos - dx[direction]; //새로운 변수 다시 안만들어도 돼!!!!!!!!!!!!!!!!!!!!
                int ny2 = yPos - dy[direction]; //위에 선언한 nx 다시 써도 돼!!!! 어차피 재초기화라 한 칸 뒤로 가지는 게 맞아!!
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
        System.out.println("seconds : " + seconds + "초");
        return answer;
    }

    /**
     * 220709 복습 - 8분 30초 클리어!
     * 이젠 문제를 거의 외워서 그런지 빨라졌다.
     * 차라리 이렇게 외워서라도 이런 문제에 익숙해지고, 나중에 진짜 코테에서 참고할 수 있는 기억이 됐으면 좋겠다.
     * 이젠 일주일에 한 번씩만 복습 꾸준히 하자.
     */
    public static int solution4(int n, int m, int x, int y, int direction, int[][] map) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int answer = 1;
        int xPos = x;
        int yPos = y;
        int[][] visitPos = new int[m][n];
        visitPos[x][y] = 1;
        //북,동,남,서로 전진했을 때 변하는 좌표 크기
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0 , -1};
        int turnCount = 0;

        while (true) {
            direction -= 1; //왼쪽으로 회전
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
        System.out.println("seconds : " + seconds + "초");
        return answer;
    }

}