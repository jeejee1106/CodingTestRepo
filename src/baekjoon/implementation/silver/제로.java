package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 제로 {
    /**
     * 아...! 스택문제였다...!
     * but, 내가 ArrayList로 구현한 방식과, Stack으로 구현한 방식은 원리, 방법 모두 동일함!
     */
    public static void main(String[] args) throws IOException {
//        solution1(); //속도 : 224ms, 메모리 : 24024KB
        solution2(); //속도 : 248ms, 메모리 : 23536KB
    }

    public static void solution1() throws IOException { //내 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //몇 개의 정수를 받을 것인가
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) { //들어온 정수가 0이 아니면
                list.add(n); //리스트에 추가하고
            } else { //들어온 정수가 0이라면
                list.remove(list.size() - 1); //제일 마지막 index에 해당하는 값 삭제
            }
        }
        for (int i : list) {
            sum += i; //list에 들어온 수의 합
        }

        System.out.println(sum);
    }

    public static void solution2() throws IOException { //다른 사람 풀이 참고(스택 사용)
        /**
         * 스택으로 이 문제를 구현해봤는데, 내가 ArrayList로 푼 풀이와 크게 다를 것이 없었다.
         * 거의 똑같다고 볼 수 있고, 메모리나 시간적인 면도 거의 차이가 없다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //몇 개의 정수를 받을 것인가
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) { //들어온 정수가 0이 아니면
                stack.add(n); //스택에 추가하고
//                stack.push(n); //add메서드와 push메서드는 동일한 역할! (상단에 원소를 추가)
            } else { //들어온 정수가 0이라면
                stack.pop(); //스택의 최상단에 있는 원소를 삭제
            }
        }
        for (int i : stack) {
            sum += i; //stack에 들어온 수의 합
        }

        System.out.println(sum);
    }
}