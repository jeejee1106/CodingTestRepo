package programmers.level0;

import java.util.Arrays;

public class 배열의평균값 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(배열의평균값.solution1(numbers1)); //5.5
        System.out.println(배열의평균값.solution1(numbers2)); //94.0
    }

    /////////////////[solution 시작]/////////////////
    public static double solution1(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }

        return answer / numbers.length;
    }

    //다른사람이 푼 풀이 중 이런 풀이도 있는데, 위 풀이보다 속도가 100배 이상 느리다.
    //아무리 코드가 간결해도 간단한 문제는 내장 메서드를 사용하지 않는 것이 좋을 것 같다.
    public static double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
