package programmers.level0;

public class 겹치는선분의길이 {
    public static void main(String[] args) {
        int[][] lines1 = {
                {0, 1},   //[(0,0) (0,1)]
                {2, 5},   //[(1,0) (1,1)]
                {3, 9}};  //[(2,0) (2,1)]

        int[][] lines2 = {
                {-1, 1},  //[(0,0) (0,1)]
                { 1, 3},  //[(1,0) (1,1)]
                { 3, 9}}; //[(2,0) (2,1)]

        int[][] lines3 = {
                {0, 5},   //[(0,0) (0,1)]
                {3, 9},   //[(1,0) (1,1)]
                {1, 10}}; //[(2,0) (2,1)]

        System.out.println(겹치는선분의길이.solution1(lines1)); //2
        System.out.println(겹치는선분의길이.solution1(lines2)); //0
        System.out.println(겹치는선분의길이.solution1(lines3)); //8
        System.out.println();
        System.out.println(겹치는선분의길이.solution2(lines1)); //2
        System.out.println(겹치는선분의길이.solution2(lines2)); //0
        System.out.println(겹치는선분의길이.solution2(lines3)); //8
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[][] lines) {
        int answer = 0;
        //1. 배열 생성 및 초기화
        int[] arr = new int[201]; //원소의 범위가 -100 ~ 100이기 때문에 길이 201(0포함)의 배열 생성

        //2. 선분 좌표에 해당하는 배열 인덱스에 ++ 해주기
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) { // +100을 해주는 이유? 배열의 인덱스 범위는 음수여서는 안되기 때문에.
                arr[j]++;
            }
        }

        //3. arr 배열을 쭉 돌면서 각 인덱스에 선분이 2개 이상이면 answer++ 해주기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                answer++;
            }
        }

        return answer;
    }

    public static int solution2(int[][] lines) {
        //하나의 기능을 하는 코드들을 따로 메서드로 뽑아보았다. 객체지향적으로!

        int answer = 0;

        //1. 배열 생성 및 초기화
        int[] arr = new int[201]; //원소의 범위가 -100 ~ 100이기 때문에 길이 201(0포함)의 배열 생성

        //2. 선분 좌표에 해당하는 배열 인덱스에 ++ 해주기
        dotCount(lines, arr);

        //3. arr 배열을 쭉 돌면서 각 인덱스에 선분이 2개 이상이면 answer++ 해주기
        return answerCount(answer, arr);
    }

    static void dotCount(int[][] lines, int[] arr) {
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) { // +100을 해주는 이유? 배열의 인덱스 범위는 음수여서는 안되기 때문에.
                arr[j]++;
            }
        }
    }

    static int answerCount(int answer, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                answer++;
            }
        }
        return answer;
    }

}
