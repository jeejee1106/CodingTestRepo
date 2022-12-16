package programmers.level0;

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
                {2, 4},  //[(1,0) (1,1)]
                {5, 10}}; //[(3,0) (3,1)]

        System.out.println(평행.solution1(dots1)); //1
        System.out.println(평행.solution1(dots2)); //2
        System.out.println();
        System.out.println(평행.solution2(dots1)); //1
        System.out.println(평행.solution2(dots2)); //0
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[][] dots) {
        int answer = 0;
        return answer;
    }

    public static int solution2(int[][] dots) {
        int answer = 0;
        return answer;
    }

}
