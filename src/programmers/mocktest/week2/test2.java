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
        //1. 철수와 영희의 토핑의 개수를 담을 맵을 선언해준다.
        HashMap<Integer, Integer> toppingMap1 = new HashMap<>();
        HashMap<Integer, Integer> toppingMap2 = new HashMap<>();

        //2. toppingMap2에는 topping[0]을 제외한 나머지 토핑을 모두 넣어준다.
        for (int k = 1; k < topping.length; k++) {
            //map에 토핑이(key) 없으면 0(value), 있으면 기존의 value에 1을 더해줘서 토핑 종류마다 카운트를 세준다.
            toppingMap2.put(topping[k], toppingMap2.getOrDefault(topping[k], 0) + 1);
        }

        //3. topping.length - 1만큼 for문을 돌리는 이유는 topping배열의 인덱스가 마지막 번호일 땐 계산을 할 필요가 없기 때문.
        // 으어 이거 설명하기 어렵다.....음... {0 0 0 0 0 0 /} 이렇게 자르는 것은 의미가 없기 때문!
        // 즉, {0 0 0 0 0 / 0} 여기 까지만 잘라서 계산을 해보면 되니까!! 배열의 길이보다 하나 작게 돌려주면 된다!
        for (int i = 0; i < topping.length -1; i++) {
            //4. toppingMap1에는 topping[0]부터 담아준다. (for문이 한 번 돌면 다음 인덱스의 토핑이 계속 추가되도록)
            toppingMap1.put(topping[i], toppingMap1.getOrDefault(topping[i], 0) + 1);

            //5. 두 map의 사이즈를 비교해서(= 토핑종류가 몇가지인지를 비교) 같으면 answer++ 해주기
            if (toppingMap1.size() == toppingMap2.size()) {
                answer++;
            }

            //6. map의 사이즈를 비교한 후엔 toppingMap2에서 topping[1]부터 count를 하나씩 빼준다.
            // toppingMap2에는 topping[1]부터 들어가 있으니 topping[1]부터 빼주면 됨! 그러므로 key가 topping[i+1]인 value를 1씩 빼주면 된다.
            toppingMap2.put(topping[i+1], toppingMap2.get(topping[i+1]) - 1);

            //7. toppingMap2에서 카운트를 하나씩 빼서 결국 그 토핑의 개수가 0이 된 경우엔 toppingMap2에서 삭제를 해준다.
            // 그래야 사이즈 비교를 제대로 할 수 있다. value가 0이더라도 맵에서 없어지지 않으면 당연히 사이즈 측정이됨!
            if (toppingMap2.get(topping[i+1]) == 0) {
                toppingMap2.remove(topping[i+1]);
            }
        }
        return answer;
    }

}