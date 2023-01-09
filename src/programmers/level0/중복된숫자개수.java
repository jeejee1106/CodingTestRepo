package programmers.level0;

public class 중복된숫자개수 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 4, 5};
        int n1 = 1;

        int[] array2 = {0, 2, 3, 4};
        int n2 = 1;

        System.out.println(중복된숫자개수.solution1(array1, n1)); //2
        System.out.println(중복된숫자개수.solution1(array2, n2)); //0
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] array, int n) {
        int answer = 0;

        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }

        return answer;
    }
}
