package programmers.level0;

import java.util.Arrays;

public class 연속된수의합 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 4;
        int num4 = 5;

        int total1 = 12;
        int total2 = 15;
        int total3 = 14;
        int total4 = 5;

        System.out.println(Arrays.toString(연속된수의합.solution1(num1, total1))); //[3, 4, 5]
        System.out.println(Arrays.toString(연속된수의합.solution1(num2, total2))); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(연속된수의합.solution1(num3, total3))); //[2, 3, 4, 5]
        System.out.println(Arrays.toString(연속된수의합.solution1(num4, total4))); //[-1, 0, 1, 2, 3]

        System.out.println();

        System.out.println(Arrays.toString(연속된수의합.solution2(num1, total1))); //[3, 4, 5]
        System.out.println(Arrays.toString(연속된수의합.solution2(num2, total2))); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(연속된수의합.solution2(num3, total3))); //[2, 3, 4, 5]
        System.out.println(Arrays.toString(연속된수의합.solution2(num4, total4))); //[-1, 0, 1, 2, 3]

    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int num, int total) {
        int[] answer = new int[num];
        int sum = 0; //합 0, index[0]==0을 기준으로 잡기

        //배열에 0부터 num-1 까지 순서대로 넣어주기 -> 연속된 숫자를 만들기 위함
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i;
            sum += answer[i]; //0부터 더한 숫자를 sum에 넣어주기
        }

        //합이 total과 같아질 때 까지 반복
        while (sum != total) {
            if (sum < total) { //합이 total보다 작으면 배열의 원소에 1씩 더해서 total과 같아질 때 까지 반복
                sum = 0; //합 초기화해서 다시 더해서 넣기
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = answer[i] + 1;
                    sum += answer[i];
                }
            } else if (sum > total) { //합이 total보다 크면 배열의 원소를 1씩 빼서 total과 같아질 때 까지 반복
                sum = 0; //합 초기화해서 다시 더해서 넣기
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = answer[i] - 1;
                    sum += answer[i];
                }
            }
        }
        return answer;
    }

    public static int[] solution2(int num, int total) {
        int[] answer = new int[num];
        int sum = 0; //합 0, index[0]==0을 기준으로 잡기
        int startNum = 0;

        //굳이 배열에 0~num까지 넣어서 원소들의 합을 계산할 필요가 없음
        //why? 배열에 넣지 않아도 0~num까지 반복문으로 돌려서 더해주면 되니까!
        for(int i = 0; i < num; i++){
            sum += i;
        }

        //합이 total과 같아질 때 까지 반복
        //합이 total보다 작다면 각 원소의 값을 1씩 증가시켜 다시 합을 구하기 때문에 결국 원소의 갯수(=num)만큼 더해주면 되고, 반대의 경우는 num만큼 빼주면 된다!!! 대박
        while (sum != total) {
            if (sum < total) {
                sum += num;
                startNum++; //반복문이 한 번 돌 때 마다 index[0]의 값이 1씩 증가
            } else {
                sum -= num;
                startNum--; //반복문이 한 번 돌 때 마다 index[0]의 값이 1씩 감소
            }
        }

        //배열에 답 넣어주기
        for(int i = 0; i < num; i++){
            answer[i] = i + startNum;
        }

        return answer;
    }

}
