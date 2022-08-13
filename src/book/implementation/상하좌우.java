package book.implementation;

import java.math.BigDecimal;

public class 상하좌우 {

    public static void main(String[] args) {
        int n1 = 5;
        char[] position1 = {'R', 'R', 'R', 'U', 'D', 'D'};

        int n2 = 13;
        char[] position2 = {'L', 'L', 'D', 'D', 'D', 'D', 'R', 'R', 'R', 'R', 'R', 'D', 'R', 'R', 'D', 'D', 'R', 'U', 'R', 'U', 'L'};

        int n3 = 4;
        char[] position3 = {'R', 'R', 'D', 'D', 'R', 'U', 'R', 'U', 'L'};

        System.out.println("solution1 = " + 상하좌우.solution1(n1, position1)); // (3, 4)
        System.out.println("solution1 = " + 상하좌우.solution1(n2, position2)); // (6, 9)
        System.out.println("solution1 = " + 상하좌우.solution1(n3, position3)); // (1, 3)

        System.out.println("solution2 = " + 상하좌우.solution2(n1, position1)); // (3, 4)
        System.out.println("solution2 = " + 상하좌우.solution2(n2, position2)); // (6, 9)
        System.out.println("solution2 = " + 상하좌우.solution2(n3, position3)); // (1, 3)

        System.out.println("solution3 = " + 상하좌우.solution3(n1, position1)); // (3, 4)
        System.out.println("solution3 = " + 상하좌우.solution3(n2, position2)); // (6, 9)
        System.out.println("solution3 = " + 상하좌우.solution3(n3, position3)); // (1, 3)
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(int n, char[] position) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
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
        System.out.println("seconds : " + seconds + "초");
        return "(" + x + ", " + y + ")";
    }

    public static String solution2(int n, char[] position) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int x = 1, y = 1;

        //if문 안의 if문을 삼항 연산자로 바꿔보았다. 코드는 더 짧아졌지만 가독성면과 시간복잡도면에서는 더 나아진건지 잘 모르겠다.
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
        System.out.println("seconds : " + seconds + "초");
        return "(" + x + ", " + y + ")";
    }

    public static String solution3(int n, char[] position) {
        /**
         * 책의 풀이 : 확실히 내 코드보단 훨씬 깔끔하긴 하다.이동할 수 있는 좌표를 배열로..!
         * 또한 경우의 수가 아닐 때만 무시하도록 하는 코드도 깔끔한 것 같다.
         * 그렇지만 코드실행 속도를 측정한 결과 내 코드가 조금 더 빠른 것을 확인할 수 있다..!ㅎㅎ..!
         */
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int x = 1, y = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < position.length; i++) {
            char plan = position[i];
            // 이동 후 좌표 구하기
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간을 벗어나는 경우 무시
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // 이동 수행
            x = nx;
            y = ny;
        }

        long finishTime = System.nanoTime();
        BigDecimal seconds = new BigDecimal((finishTime - startTime) / 100000.0);
        System.out.println("seconds : " + seconds + "초");
        return "(" + x + ", " + y + ")";
    }
}