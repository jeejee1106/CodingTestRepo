package programmers.level0;

import java.util.Arrays;

public class 캐릭터의좌표 {
    public static void main(String[] args) {
        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};

        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};

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

        //switch문 풀이 속도는 아~~주 약간 더 빠른듯?
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up":
                    move(answer, x, 0, y);
                    positionCheck(answer, maxPosition, x, 0, y);
                    break;
                case "down":
                    move(answer, x, 1, y);
                    positionCheck(answer, maxPosition, x, 1, y);
                    break;
                case "left":
                    move(answer, x, 2, y);
                    positionCheck(answer, maxPosition, x, 2, y);
                    break;
                case "right":
                    move(answer, x, 3, y);
                    positionCheck(answer, maxPosition, x, 3, y);
            }
        }

        //if문 풀이
//        for (int i = 0; i < keyinput.length; i++) {
//            if (keyinput[i].equals("up")) {
//                move(answer, x, 0, y);
//                positionCheck(answer, maxPosition, x, 0, y);
//            } else if (keyinput[i].equals("down")) {
//                move(answer, x, 1, y);
//                positionCheck(answer, maxPosition, x, 1, y);
//            } else if (keyinput[i].equals("left")) {
//                move(answer, x, 2, y);
//                positionCheck(answer, maxPosition, x, 2, y);
//            } else if (keyinput[i].equals("right")) {
//                move(answer, x, 3, y);
//                positionCheck(answer, maxPosition, x, 3, y);
//            }
//        }


        return answer;
    }

    private static void move(int[] answer, int[] x, int x1, int[] y) {
        answer[0] += x[x1];
        answer[1] += y[x1];
    }

    private static void positionCheck(int[] answer, int[] maxPosition, int[] x, int x1, int[] y) {
        if (Math.abs(answer[0]) > maxPosition[0]) {
            answer[0] -= x[x1];
        }
        if (Math.abs(answer[1]) > maxPosition[1]) {
            answer[1] -= y[x1];
        }
    }
}
