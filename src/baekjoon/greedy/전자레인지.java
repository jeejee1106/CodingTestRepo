package baekjoon.greedy;

import java.util.Scanner;

public class 전자레인지 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int A = 0, B = 0, C = 0; //A,B,C를 몇번씩 누를건지 count할 각각의 변수

        while (time >= 10) {
            if (time >= 300) {
                time -= 300;
                A++;
            } else if (time >= 60) {
                time -= 60;
                B++;
            } else if (time >= 10) {
                time -= 10;
                C++;
            }
        }
        System.out.println(time == 0 ? A + " " + B + " " + C : -1);
    }
}