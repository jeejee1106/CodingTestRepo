package programmers.level1;

import java.util.ArrayList;
import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] a = {1,1,3,3,0,1,1};
        int[] b = {4,4,4,3,3};

        System.out.println(같은숫자는싫어.solution1(a)); //[1,3,0,1]
        System.out.println(같은숫자는싫어.solution1(b)); //[4,3]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i - 1]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

    public static int[] solution2(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}