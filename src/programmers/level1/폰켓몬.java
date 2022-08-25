package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ���ϸ� {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        System.out.println(���ϸ�.solution1(nums1)); //2
        System.out.println(���ϸ�.solution1(nums2)); //3
        System.out.println(���ϸ�.solution1(nums3)); //2

        System.out.println(���ϸ�.solution2(nums1)); //2
        System.out.println(���ϸ�.solution2(nums2)); //3
        System.out.println(���ϸ�.solution2(nums3)); //2

        System.out.println(���ϸ�.solution3(nums1)); //2
        System.out.println(���ϸ�.solution3(nums2)); //3
        System.out.println(���ϸ�.solution3(nums3)); //2
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] nums) {
        int answer = 0;
        int half = nums.length / 2; //���� ������ �� �ִ� ���ϸ��� ������

        //map�� �ֱ�
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
        int half = nums.length / 2; //���� ������ �� �ִ� ���ϸ��� ������

        //set�� �ֱ�
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        answer = set.size() <= half ? set.size() : half;

        return answer;

        /**
         *  �� ���� �ִ��� ���̸� �Ʒ��� ���� �ڵ尡 �ȴ�.
         */
//        int half = nums.length / 2;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i : nums) {
//            set.add(i);
//        }
//        return set.size() <= half ? set.size() : half;
    }

    public static int solution3(int[] nums) {
        int count = 1; //nums�迭�� ���� �ٸ� ������ ����
        int half = nums.length / 2; //���� ������ �� �ִ� ���ϸ��� ������

        //1. �迭 �����ϱ�
        Arrays.sort(nums);

        //2. �ߺ��� �����ؼ� ���� �ٸ� ���� ����� ����
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { //���� ���� ���ڰ� ������ ���ڿ� ���� ������
                count++; //ī��Ʈ�� �ϳ��� �÷��ش�. ��, ���� ���ڰ� ������ ���� ����!
            }
        }

        return Math.min(count, half); //count�� half�� ���ؼ� �� ���� ���� ����.
        /**
         * �� �ּڰ��� ����?
         * ���� 1 : count > half
         * ���� 10���� ���ϸ��� ������ ��� �ٸ��ٰ� �����ϸ� count�� 10�̵ȴ�.
         * �׷��� ���� ������ �� �ִ� ���ϸ��� 10/2 �����̱� ������ count 10�� half 5�߿� �� ���� ���� 5�� �����ؾ��Ѵ�.
         *
         * ���� 2 : count < half
         * ���� ���˸� 10������ ������ 4������� count�� 4�� �ȴ�.
         * ���� ������ �� �ִ� ���˸��� 10/2������ half�� 5���� ������ �ִ� �������� ���˸��� ������ �� �ִ���?�̱� ������
         * ���� ������ �� �ִ� ���˸� ������ 5�� �ƴ϶�, �ִ� ���������� 4�� �����ؾ��Ѵ�.
         * ��, ���⼭�� �� ���� ������ ���ؾ��Ѵ�!
         */
    }
}