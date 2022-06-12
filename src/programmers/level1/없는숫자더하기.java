package programmers.level1;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0}; //14
        int[] numbers2 = {5,8,4,0,6,7,9}; //6

        System.out.println(없는숫자더하기.solution1(numbers)); //14
        System.out.println(없는숫자더하기.solution1(numbers2)); //6
        System.out.println(없는숫자더하기.solution2(numbers)); //14
        System.out.println(없는숫자더하기.solution2(numbers2)); //6
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] numbers) {
        int answer = 45; //0~9까지 모두 더한 값

        //1. 0~9를 모두 더한 45에서 있는 숫자를 모두 빼주면 없는 숫자를 더한 값이 된다.
        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }

    public static int solution2(int[] numbers) {
        int answer = 45; //0~9까지 모두 더한 값

        //향상된 for문을 쓴 풀이
        for(int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}