package baekjoon.stack.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 막대기 {
    public static void main(String[] args) throws IOException{
//        solution1();
        solution2();
    }

    public static void solution1() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 1; //제일 뒤의 막대기는 무조건 보이기 때문에 1로 초기화
        int largeNum = arr[arr.length - 1]; //배열의 제일 뒤에 있는 값을 largeNum으로 저장
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > largeNum) {
                count++;
                largeNum = arr[i];
            }
        }

        System.out.println(count);
    }

    public static void solution2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int count = 1;
        int largeNum = stack.get(stack.size()-1); //배열의 제일 뒤에 있는 값을 largeNum으로 저장
        for (int i = stack.size() - 2; i >= 0; i--) {
            if (stack.get(i) > largeNum) {
                count++;
                largeNum = stack.get(i);
            }
        }

        System.out.println(count);
    }

}
