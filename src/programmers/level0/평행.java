package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 평행 {
    public static void main(String[] args) {
        int[][] dots1 = {
                {1, 4},   //[(0,0) (0,1)]
                {9, 2},   //[(1,0) (1,1)]
                {3, 8},  //[(2,0) (2,1)]
                {11, 6}};  //[(3,0) (3,1)]

        int[][] dots2 = {
                {3, 5},  //[(0,0) (0,1)]
                {4, 1},  //[(1,0) (1,1)]
                {2, 4},  //[(2,0) (2,1)]
                {5, 10}}; //[(3,0) (3,1)]

        System.out.println(평행.solution1(dots1)); //1
        System.out.println(평행.solution1(dots2)); //0
        System.out.println();
        System.out.println(평행.solution2(dots1)); //1
        System.out.println(평행.solution2(dots2)); //0
    }
        //두 선분이 평행하려면? 기울기가 같아야한다.
        //기울기 구하는 공식 : y값 증가량 / x값 증가량 = (y2 - y1) / (x2 - x1)
//        (0,1 - 1,1) / (0,0 - 1,0);
//        (0,1 - 2,1) / (0,0 - 2,0);
//        (0,1 - 3,1) / (0,0 - 3,0);
//
//        (1,1 - 2,1) / (1,0 - 2,0);
//        (1,1 - 3,1) / (1,0 - 3,0)

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[][] dots) {
        int answer = 0;
        List<Double> slopeList = new ArrayList<>();

        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                //1. 각 좌표값들의 기울기를 모두 계산해준다.
                double slope = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                //2. 기울기리스트에 같은 기울기가 있으면 퍙행하는 선이 있으므로 1리턴.
                if (slopeList.contains(slope)) {
                    return 1;
                }
                //3. 기울기 리스트에 같은 기울기가 없으면 리스트에 새로 넣어주기
                slopeList.add(slope);
            }

        }
        return answer;
    }

    public static int solution2(int[][] dots) {
        int answer = 0;
        return answer;
    }

}
