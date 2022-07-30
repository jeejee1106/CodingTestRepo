package programmers.mocktest.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        int[] topping1 = {1, 2, 1, 3, 1, 4, 1, 2};
        int[] topping2 = {1, 2, 3, 1, 4};
        int[] topping3 = {1, 1, 1, 1, 1, 1, 1};
        int[] topping4 = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1};

//        System.out.println(solution1(topping1)); //2
//        System.out.println(solution1(topping2)); //0
//        System.out.println(solution1(topping3)); //6

//        System.out.println(solution2(topping1)); //2
//        System.out.println(solution2(topping2)); //0
//        System.out.println(solution2(topping3)); //6

//        System.out.println(solution3(topping1)); //2
//        System.out.println(solution3(topping2)); //0
//        System.out.println(solution3(topping3)); //6

        System.out.println(solution4(topping1)); //2
        System.out.println(solution4(topping2)); //0
        System.out.println(solution4(topping3)); //6
        System.out.println(solution4(topping4)); //12

    }

    public static int solution1(int[] topping) {
        int answer = 0;
        for (int i = 0; i < topping.length - 1; i++) {
            List<Integer> toppingList1 = new ArrayList<>();
            List<Integer> toppingList2 = new ArrayList<>();
            HashMap<Integer, Integer> countMap1 = new HashMap<>();
            HashMap<Integer, Integer> countMap2 = new HashMap<>();

            for (int j = 0; j <= i; j++) {
                toppingList1.add(topping[j]);
            }
            for (int k = i + 1; k < topping.length; k++) {
                toppingList2.add(topping[k]);
            }

            for (int x = 0; x < toppingList1.size(); x++) {
                countMap1.put(toppingList1.get(x), 1);
            }
            for (int y = 0; y < toppingList2.size(); y++) {
                countMap2.put(toppingList2.get(y), 1);
            }

            if (countMap1.size() == countMap2.size()) {
                answer++;
            }
        }
        return answer;
    }

    public static int solution2(int[] topping) {
        int answer = 0;

        for (int i = 0; i < topping.length - 1; i++) {
            HashSet<Integer> toppingSet1 = new HashSet<>();
            HashSet<Integer> toppingSet2 = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                toppingSet1.add(topping[j]);
            }
            for (int k = i + 1; k < topping.length; k++) {
                toppingSet2.add(topping[k]);
            }
            if (toppingSet1.size() == toppingSet2.size()) {
                answer++;
            }
        }
        return answer;
    }

    public static int solution3(int[] topping) {
        int answer = 0;

        HashSet<Integer> toppingSet1 = new HashSet<>();
        for (int i = 0; i < topping.length - 1; i++) {
            HashSet<Integer> toppingSet2 = new HashSet<>();
            toppingSet1.add(topping[i]);
            for (int k = i + 1; k < topping.length; k++) {
                toppingSet2.add(topping[k]);
            }
            if (toppingSet1.size() == toppingSet2.size()) {
                answer++;
            }
        }
        return answer;
    }

    /**
     * 위 답들은 전부 시간 초과가 떳다.
     * 두시간 반 동안의 고민으로 드디어 100점!!!! ㅠㅠㅠㅠㅠㅠㅠ
     * 꼭 복습할 것
     */
    public static int solution4(int[] topping) {
        int answer = 0;
        //맵에 카운트 계산, 하나씩 빼면서 size 확인
        HashMap<Integer, Integer> toppingMap1 = new HashMap<>();
        HashMap<Integer, Integer> toppingMap2 = new HashMap<>();
        for (int k = 1; k < topping.length; k++) {
            toppingMap2.put(topping[k], toppingMap2.getOrDefault(topping[k], 0) + 1);
        }
        for (int i = 0; i < topping.length - 1; i++) {
            toppingMap1.put(topping[i], toppingMap1.getOrDefault(topping[i], 0) + 1);
            if (toppingMap1.size() == toppingMap2.size()) {
                answer++;
            }
            toppingMap2.put(topping[i+1], toppingMap2.get(topping[i+1]) - 1);
            if (toppingMap2.get(topping[i+1]) == 0) {
                toppingMap2.remove(topping[i+1]);
            }
        }
        return answer;
    }

}