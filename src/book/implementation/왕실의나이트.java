package book.implementation;

public class 왕실의나이트 {

    public static void main(String[] args) {
        char column1 = 'a';
        int row1 = 1;

        char column2 = 'c';
        int row2 = 2;

        char column3 = 'f';
        int row3 = 6;

        char column4 = 'e';
        int row4 = 8;


        System.out.println("solution1 = " + 왕실의나이트.solution1(column1, row1)); // 2
        System.out.println("solution1 = " + 왕실의나이트.solution1(column2, row2)); // 6
        System.out.println("solution1 = " + 왕실의나이트.solution1(column3, row3)); // 8
        System.out.println("solution1 = " + 왕실의나이트.solution1(column4, row4)); // 4

        System.out.println("solution2 = " + 왕실의나이트.solution2(column1, row1)); // 2
        System.out.println("solution2 = " + 왕실의나이트.solution2(column2, row2)); // 6
        System.out.println("solution2 = " + 왕실의나이트.solution2(column3, row3)); // 8
        System.out.println("solution2 = " + 왕실의나이트.solution2(column4, row4)); // 4

    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(char column, int row) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int answer = 8;

        int col = column - 'a' + 1; //char타입의 영어소문자를 숫자로바꿔주기 a:1, b:2, c:3 ......
        int[] x = {-2, -2, 2, 2, -1, 1, -1, 1};
        int[] y = {1, -1, 1, -1, 2, 2, -2, -2};

        //즉 나이트가 (col, row)의 위치에 있을 때 이동 가능한 경우의 수는?
        for (int i = 0; i < x.length; i++) {
            int nextCol = col + x[i];
            int nextRow = row + y[i];
            if (nextCol < 1 || nextCol > 8 || nextRow < 1 || nextRow > 8) {
                answer --;
            }
        }

        long finishTime = System.nanoTime();
        System.out.println("seconds : " + (finishTime - startTime) / 1000000000.0 + "초");
        return answer;
    }

    /**
     * 책의 풀이
     * 사실 x와 y를 배열로 만드는 것은 살짝 참고를 했지만
     * 그 후 현재 위치와 x, y를 더한 후 경우의 수를 찾는 것은 나 혼자 풀었다.
     * 나는 불가능 할 떼 카운트를 하나씩 빼주었는데, 책에서는 가능 할 때 카운트를 하나씩 늘려주었다.
     */
    public static int solution2(char column, int row) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함
        int col = column - 'a' + 1;
        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = col + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        long finishTime = System.nanoTime();
        System.out.println("seconds : " + (finishTime - startTime) / 1000000000.0 + "초");
        return result;
    }
}