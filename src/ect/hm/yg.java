package ect.hm;

public class yg {
    public static void main(String[] args) {
        int[] scores1 = {1, 3, 7, 8, 10, 15};
        int k1 = 5;

        int[] scores2 = {1,2,12,14,15};
        int k2 = 2;

        System.out.println((yg.solution1(scores1, k1)));
        System.out.println((yg.solution1(scores2, k2)));
    }

    /////////////////[solution 시작]/////////////////

    /**
     * 문제분석 :
     * 1. 각 조에서 (가장 점수가 높은 학생 점수 - 가장 낮은 학생 점수)들의 합이 최소가 되게
     * 2. 각 조에는 1명 이상의 학생이 포함 되어야함.
     * 3. 조는 k개로 나누어져야함
     * 4. 점수차의 합이 최솟값을 리턴해라라     * @param scores
     * @param k
     * @return
     */
    public static int solution1(int[] scores, int k) {
        int answer = -1;
        int min = 0;










        return answer;
    }
}