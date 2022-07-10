package book.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 이론예제1 {

    /**
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     * 스택, 큐, 재귀함수에 대한 간단한 이론과 예제!!!
     * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
     */

    public static void main(String[] args) {
        stack();

        queue();

//        infiniteRecursiveFunction(); //무한히 호출되는 재귀함수!!!!!! StackOverflowError발생 : 재귀의 최대 깊이를 초과했다. 호출횟수 제한이 있는데, 이 한계를 벗어남

        System.out.println(">>>>> 재귀함수 예제 <<<<<");
        recursiveFunction(1);
        System.out.println();

        factorialIterative(5);

        System.out.println(">>>>> 재귀함수를 사용한 팩토리얼 예제 <<<<<");
        System.out.println(factorialRecursive(5));
        System.out.println();

    }

    //Stack 예제
    static void stack() {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop(); //제일 마지막에 들어간(제일 위에 있는) 4가 삭제됨
        stack.push(1);
        stack.push(4);
        stack.pop(); //제일 마지막에 들어간(제일 위에 있는) 4가 삭제굄

        System.out.println(">>>>> stack 예제 <<<<<");
        //스택의 최상단 원소부터 출력
        while (!stack.empty()) {
            System.out.println(stack.peek()); //제일 위에 원소 출력하기
            stack.pop(); //출력 후 삭제! 그래야 그 밑의 원소가 나오지!
        }
        System.out.println();
    }

    //Queue 예제
    static void queue() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(7);
        queue.poll(); //제일 먼저 들어간 5가 삭제됨
        queue.offer(1);
        queue.offer(4);
        queue.poll(); //두 번째로 들어간 2가 삭제됨

        System.out.println(">>>>> queue 예제 <<<<<");
        //먼저 들어온 원소부터 추출됨
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); //제일 먼저 들어온 원소를 삭제하면서 확인해보기
        }
        System.out.println();
    }

    //무한히 호출되는 재귀함수 예제
    static void infiniteRecursiveFunction() {
        System.out.println("재귀함수를 호출합니다.");
        infiniteRecursiveFunction(); //자기 자신을 호출
    }

    //재귀함수의 종료 조건 예제
    static void recursiveFunction(int i) {
        //100번째 호출을 했을 때 종료되도록 종료 조건 명시
        if (i == 100) {
            return;
        }
        System.out.println(i + "번째 재귀함수에서 " + (i + 1) + "번째 재귀함수를 호출합니다.");
        recursiveFunction(i + 1);
        System.out.println(i + "번째 재귀함수를 종료합니다.");
        /**
         * 컴푸터 내부에서 재귀함수의 수행은 스택 자료구조를 이용
         * 함수를 계속 호출 했을 때 가장 마지막에 호출한 함수가 먼저 수행을 끝내야 그 앞의 함수 호출이 종료되기 때문.
         * 즉, 재귀함수는 내부적으로 스택 자료구조와 동일하다.
         */
    }

    // 반복적으로 구현한 n! (팩토리얼)
    static void factorialIterative(int n) {
        System.out.println(">>>>> 반복문을 사용한 팩토리얼 예제 <<<<<");
        int result = 1;
        // 1부터 n까지의 수를 차례대로 곱하기
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        System.out.println();
    }

    // 재귀적으로 구현한 n!
    static int factorialRecursive(int n) {
        // n이 1 이하인 경우 1을 반환
        if (n <= 1) return 1;
        // n! = n * (n - 1)!를 그대로 코드로 작성하기
        return n * factorialRecursive(n - 1); //싱기하다......
    }



}