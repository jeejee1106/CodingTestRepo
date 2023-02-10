package programmers.level0;

import java.util.Arrays;

public class 캐릭터의좌표 {
    public static void main(String[] args) {
        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};

        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};

        String[] keyinput3 = {"down", "down", "down", "down", "down"};
        int[] board3 = {7, 9};

        System.out.println(Arrays.toString(캐릭터의좌표.solution1(keyinput1, board1))); //[2, 1]
        System.out.println(Arrays.toString(캐릭터의좌표.solution1(keyinput2, board2))); //[0, -4]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(String[] keyinput, int[] board) {
        //       up, down, left, right
        int[] x = {0, 0, -1, 1};
        int[] y = {1, -1, 0, 0};
        int[] maxPosition = {board[0]/2, board[1]/2};
        int[] answer = {0, 0};

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                f1(answer, x, 0, y);
                extracted(answer, maxPosition, x, 0, y);
            } else if (keyinput[i].equals("down")) {
                f1(answer, x, 1, y);
                extracted(answer, maxPosition, x, 1, y);
            } else if (keyinput[i].equals("left")) {
                f1(answer, x, 2, y);
                extracted(answer, maxPosition, x, 2, y);
            } else if (keyinput[i].equals("right")) {
                f1(answer, x, 3, y);
                extracted(answer, maxPosition, x, 3, y);
            }
        }


        return answer;
    }

    private static void f1(int[] answer, int[] x, int x1, int[] y) {
        answer[0] += x[x1];
        answer[1] += y[x1];
    }

    private static void extracted(int[] answer, int[] maxPosition, int[] x, int x1, int[] y) {
        if (Math.abs(answer[0]) > maxPosition[0]) {
            answer[0] -= x[x1];
        }
        if (Math.abs(answer[1]) > maxPosition[1]) {
            answer[1] -= y[x1];
        }
    }
}
