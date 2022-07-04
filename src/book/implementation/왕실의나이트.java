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
}