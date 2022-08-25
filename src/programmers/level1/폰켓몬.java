package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        System.out.println(폰켓몬.solution1(nums1)); //2
        System.out.println(폰켓몬.solution1(nums2)); //3
        System.out.println(폰켓몬.solution1(nums3)); //2

        System.out.println(폰켓몬.solution2(nums1)); //2
        System.out.println(폰켓몬.solution2(nums2)); //3
        System.out.println(폰켓몬.solution2(nums3)); //2

        System.out.println(폰켓몬.solution3(nums1)); //2
        System.out.println(폰켓몬.solution3(nums2)); //3
        System.out.println(폰켓몬.solution3(nums3)); //2
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] nums) {
        int answer = 0;
        int half = nums.length / 2; //내가 가져갈 수 있는 폰켓몬의 마리수

        //map에 넣기
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(map.get(nums[i]), 0) + 1);
        }

        if (map.size() <= half) {
            answer = map.size();
        } else {
            answer = half;
        }
        return answer;
    }

    public static int solution2(int[] nums) {
        int answer = 0;
        int half = nums.length / 2; //내가 가져갈 수 있는 폰켓몬의 마리수

        //set에 넣기
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        answer = set.size() <= half ? set.size() : half;

        return answer;

        /**
         *  위 식을 최대한 줄이면 아래와 같은 코드가 된다.
         */
//        int half = nums.length / 2;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i : nums) {
//            set.add(i);
//        }
//        return set.size() <= half ? set.size() : half;
    }

    public static int solution3(int[] nums) {
        int count = 1; //nums배열의 서로 다른 숫자의 개수
        int half = nums.length / 2; //내가 가져갈 수 있는 폰켓몬의 마리수

        //1. 배열 정렬하기
        Arrays.sort(nums);

        //2. 중복을 제거해서 서로 다른 수가 몇개인지 세기
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { //만약 현재 숫자가 직전의 숫자와 같지 않으면
                count++; //카운트를 하나씩 늘려준다. 즉, 같은 숫자가 나오면 세지 않음!
            }
        }

        return Math.min(count, half); //count와 half를 비교해서 더 작은 수를 리턴.
        /**
         * 왜 최솟값을 리턴?
         * 가정 1 : count > half
         * 만약 10마리 폰켓몬의 종류가 모두 다르다고 가정하면 count는 10이된다.
         * 그러나 내가 가져갈 수 있는 폰켓몬은 10/2 마리이기 때문에 count 10과 half 5중에 더 작은 값인 5를 리턴해야한다.
         *
         * 가정 2 : count < half
         * 만약 폰켄몬 10마리의 종류가 4가지라면 count는 4가 된다.
         * 내가 가져갈 수 있는 폰켄몬은 10/2마리로 half는 5지만 문제는 최대 몇종류의 폰켄몬을 가져갈 수 있느냐?이기 때문에
         * 내가 가져갈 수 있는 폰켄몬 갯수인 5가 아니라, 최대 종류갯수인 4를 리턴해야한다.
         * 즉, 여기서도 더 작은 값을을 턴해야한다!
         */
    }
}