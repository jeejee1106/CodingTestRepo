package programmers.level1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(로또의최고순위와최저순위.solution1(lottos1, win_nums1))); //[3, 5]
        System.out.println(Arrays.toString(로또의최고순위와최저순위.solution1(lottos2, win_nums2))); //[1, 6]
        System.out.println(Arrays.toString(로또의최고순위와최저순위.solution1(lottos3, win_nums3))); //[1, 1]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int[] lottos, int[] win_nums) {
        int winCount = 0; //내 번호와 win_nums번호 중 일치하는 번호의 갯수
        int zeroCount = 0; //내 번호 중 0의 갯수

        for(int lotto : lottos){
            if(lotto == 0){
                zeroCount++;
                continue;
            }
            for(int win_num : win_nums){
                if(lotto == win_num){
                    winCount++;
                    break;
                }
            }
        }

        int maxTotal = zeroCount + winCount; //최대 맞힌갯수

        if(maxTotal == 0){ //맞힌갯수가 0개면 1을 넣겠다.
            maxTotal = 1;
        }
        if(winCount == 0){ //맞힌갯수가 0개면 1을 넣겠다.
            winCount = 1;
        }

        int[] answer = {7-maxTotal, 7-winCount};
        //7에서 0의 갯수와 일치하는 갯수를 더한 수를 빼주면 등수가 나온다.(최댓값)
        //7에서 일치하는 번호의 갯수(winCount)를 빼주면 등수가 나온다.(최솟값)

        return answer;
    }
}