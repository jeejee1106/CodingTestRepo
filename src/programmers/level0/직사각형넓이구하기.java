package programmers.level0;

public class 직사각형넓이구하기 {
    public static void main(String[] args) {
        int[][] dots1 = {
                {1, 1},  //(0,0)(0,1)
                {2, 1},  //(1,0)(1,1)
                {2, 2},  //(2,0)(2,1)
                {1, 2}}; //(3,0)(3,1)

        int[][] dots2 = {
                {-1, -1},
                { 1,  1},
                { 1, -1},
                {-1,  1}};

        System.out.println(직사각형넓이구하기.solution1(dots1)); //1
        System.out.println(직사각형넓이구하기.solution1(dots2)); //4
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[][] dots) {
        int answer = 0;
        int[] xArr = new int[4];
        int[] yArr = new int[4];
        int x = 0;
        int y = 0;

        for (int i = 0; i < dots.length; i++) {
            xArr[i] = dots[i][0];
            yArr[i] = dots[i][1];
        }

        for (int i = 0; i < dots.length - 1; i++) {
            int tmpX = xArr[i] - xArr[i + 1];
            int tmpY = yArr[i] - yArr[i + 1];

            if (tmpX != 0) {
                x = tmpX;
            }

            if (tmpY != 0) {
                y = tmpY;
            }

            if (x != 0 && y != 0) {
                break;
            }
        }

        answer = Math.abs(x * y);

        return answer;
    }

    public static int solution2(int[][] dots) {
        int answer = 0;
        int[] xArr = new int[4];
        int[] yArr = new int[4];
        int x = 0;
        int y = 0;

        for (int i = 0; i < dots.length; i++) {
            xArr[i] = dots[i][0];
            yArr[i] = dots[i][1];
        }

        for (int i = 0; i < dots.length - 1; i++) {
            int tmpX = xArr[i] - xArr[i + 1];
            int tmpY = yArr[i] - yArr[i + 1];

            if (tmpX != 0) {
                x = tmpX;
            }

            if (tmpY != 0) {
                y = tmpY;
            }

            if (x != 0 && y != 0) {
                break;
            }
        }

        answer = Math.abs(x * y);

        return answer;
    }

}
