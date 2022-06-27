package book.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 숫자카드게임 {
    public static void main(String[] args) {
        int[][] num1 = {{3, 1, 2},
                        {4, 1, 4},
                        {2, 2, 2}};
        int[][] num2 = {{7, 3, 1, 8},
                        {3, 3, 3, 4}};
        int[][] num3 = {{73,16,94,20},
                        {67,23,56,13},
                        {94,34,18,47},
                        {56,14,10,44}};

        System.out.println(숫자카드게임.solution1(num1)); //2
        System.out.println(숫자카드게임.solution1(num2)); //3
        System.out.println(숫자카드게임.solution1(num3)); //2

        System.out.println(숫자카드게임.solution2(num1)); //2
        System.out.println(숫자카드게임.solution2(num2)); //3
        System.out.println(숫자카드게임.solution2(num3)); //2

        System.out.println(숫자카드게임.solution3(num1)); //2
        System.out.println(숫자카드게임.solution3(num2)); //3
        System.out.println(숫자카드게임.solution3(num3)); //2
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[][] num) { //내 풀이
        //1. List에 각 행에서 가장 작은 수를 담기
        List<Integer> minNumList = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            int minNum = num[0][0];
            for (int j = 1; j < num[0].length; j++) {
                if (num[i][j] < minNum) {
                    minNum = num[i][j];
                }
            }
            minNumList.add(minNum);
        }

        //2. List에 담긴 수들 중 가장 큰수를 return하기
        return Collections.max(minNumList);
    }

    public static int solution2(int[][] num) { //내 풀이 - 2차원 배열을 향상된 for문으로!! (우와 처음해본다..! 과연 될까?) 잘된다!
        List<Integer> minNumList = new ArrayList<>();
        for (int[] columns : num) {
            int minNum = num[0][0];
            for (int numArr : columns) {
                if (numArr < minNum) {
                    minNum = numArr;
                }
            }
            minNumList.add(minNum);
        }
        return Collections.max(minNumList);
    }

    public static int solution3(int[][] num) { //내 풀이
        List<Integer> minNumList = new ArrayList<>();
        for (int[] columns : num) { //향상된 for문으로 2차원 배열을 1차원으로 만든 후
            Arrays.sort(columns); //정렬을 통해
            minNumList.add(columns[0]); //가장 작은 수를 List에 넣어주기!
        }
        return Collections.max(minNumList);
    }

    /**
     * 책의 해설과 똑같은 아이디어로 문제를 풀어냄.
     * solution1에서는 무작정 코드를 써내려갔고,
     * solution2에서는 2차원 배열을 향상된 for문으로 쓸 수는 없을까? 라는 의문을 가져 구글링을 통해 향상된 for문으로 문제 해결
     * solution3에서는 2중 for문을 돌리지 않고 문제를 해결해봤다.
     * 제한시간내에 다 돌아갈지가 너무 궁금하다 3번 코드가 제일 짧긴 하지만 더 좋은 방법이 있는지, 시간복잡도에서 마이너스가 되는 건 아닌지 궁금하다.
     */

}