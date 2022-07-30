package programmers.mocktest.week2;

public class test1 {
    public static void main(String[] args) {
        int[] number1 = {-2, 3, 0, 2, -5};
        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        int[] number3 = {-1, 1, -1, 1};

        System.out.println(solution1(number1)); //2
        System.out.println(solution1(number2)); //5
        System.out.println(solution1(number3)); //0

    }

    public static int solution1(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

}