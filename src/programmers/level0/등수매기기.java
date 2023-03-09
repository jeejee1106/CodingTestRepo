package programmers.level0;

import java.util.*;

public class ����ű�� {
    public static void main(String[] args) {
        int[][] score1 = {
                {80, 70},  //150 1
                {90, 50},  //140 2
                {40, 70},  //110 4
                {50, 80}}; //130 3

        int[][] score2 = {
                {80, 70},   //150  4
                {70, 80},   //150  4
                {30, 50},   //80   6
                {90, 100},  //190  2
                {100, 90},  //190  2
                {100, 100}, //200  1
                {10, 30}};  //40   7

        int[][] score3 = {
                {0, 0},  //0  7
                {0, 1},  //1  5
                {1, 0},  //1  5
                {1, 1},  //2  2
                {1, 2},  //3  1
                {0, 2},  //2  2
                {2, 0}}; //2  2

        System.out.println(Arrays.toString(����ű��.solution1(score1))); //[1, 2, 4, 3]
        System.out.println(Arrays.toString(����ű��.solution1(score2))); //[4, 4, 6, 2, 2, 1, 7]
        System.out.println(Arrays.toString(����ű��.solution1(score3))); //[7, 5, 5, 2, 1, 2, 2]
    }

    /////////////////[solution ����]/////////////////

    //�� ���� �� �����....��..
    public static int[] solution1(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();

        for(int[] s : score){
            scoreList.add(s[0] + s[1]);
        }

        scoreList.sort(Comparator.reverseOrder()); //�������� ����

        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1; //ArrayList.indexOf() �����. ���� ��ü�� �����ϸ� ���� �տ� �ִ� �ε��� ��ȯ!
        }

        return answer;
    }

}
