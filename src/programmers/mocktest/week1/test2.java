package programmers.mocktest.week1;

import java.util.HashMap;

/**
 * 정답!!!! 100점
 */
public class test2 {
    public static void main(String[] args) {

        String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
        int[] number1 = {3, 2, 2, 2, 1};
        String[] discount1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        String[] want2 = {"apple"};
        int[] number2 = {10};
        String[] discount2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        System.out.println(solution1(want1, number1, discount1)); //3
        System.out.println(solution1(want2, number2, discount2)); //0
    }

    public static int solution1(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int discountLength = discount.length;
        HashMap<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            myMap.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length; i++) {
            if (discountLength - 10 < 0) {
                break;
            }
            HashMap<String, Integer> disMap = new HashMap<>();
            int count = 0;
            for (int j = i; j < 10 + i; j++) {
                disMap.put(discount[j], disMap.getOrDefault(discount[j], 0) + 1);
            }
            for (int k = 0; k < want.length; k++) {
                if (!disMap.containsKey(want[k]) || myMap.get(want[k]) > disMap.get(want[k])) {
                    break;
                } else if (myMap.get(want[k]) <= disMap.get(want[k])) {
                    count++;
                }
            }
            if (count == want.length) {
                answer++;
            }
            discountLength--;
        }

        return answer;
    }

}