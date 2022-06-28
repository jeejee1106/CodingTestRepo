package book.implementation;

public class 상하좌우 {
    // 1이 될 때 까지
    public static void main(String[] args) {
        int n1 = 5;
        char[] position1 = {'R', 'R', 'R', 'U', 'D', 'D'};

        int n2 = 13;
        char[] position2 = {'L', 'L', 'D', 'D', 'D', 'D', 'R', 'R', 'R', 'R', 'R', 'D', 'R', 'R', 'D', 'D', 'R', 'U', 'R', 'U', 'L'};

        int n3 = 43;
        int k3 = 4;

        System.out.println(상하좌우.solution1(n1, position1)); // (3, 4)
        System.out.println(상하좌우.solution1(n2, position2)); // (3, 4)
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
        long elapsedTime = finishTime - startTime;
        System.out.println("elapsedTime(ns) : " + elapsedTime);
        return "(" + x + ", " + y + ")";
    }
}