package programmers.level1;

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
    }
}