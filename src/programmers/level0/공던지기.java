package programmers.level0;

public class 공던지기 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4};
        int k1 = 2;

        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;

        int[] numbers3 = {1, 2, 3};
        int k3 = 3;

        System.out.println(공던지기.solution1(numbers1, k1)); //3
        System.out.println(공던지기.solution1(numbers2, k2)); //3
        System.out.println(공던지기.solution1(numbers3, k3)); //2

        System.out.println(공던지기.solution2(numbers1, k1)); //3
        System.out.println(공던지기.solution2(numbers2, k2)); //3
        System.out.println(공던지기.solution2(numbers3, k3)); //2
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }

    public static int solution2(int[] numbers, int k) {
        int count = 0;
        int answer = 0;
        for(int i = 0; i < k - 1; i++) {
            count = count + 2;
            if(count > numbers.length - 1) {
                count =  count - numbers.length;
            }
            answer = numbers[count];
        }

        return answer;
    }

}
