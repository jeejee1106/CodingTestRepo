package programmers.level0;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        int[] array1 = {149, 180, 192, 170};
        int height1 = 167;

        int[] array2 = {180, 120, 140};
        int height2 = 190;

        System.out.println(머쓱이보다키큰사람.solution1(array1, height1)); //3
        System.out.println(머쓱이보다키큰사람.solution1(array2, height2)); //0
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] array, int height) {
        int answer = 0;

        for (int i : array) {
            if (i > height) {
                answer++;
            }
        }

        return answer;
    }
}
