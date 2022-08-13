package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        System.out.println(Arrays.toString(모의고사.solution1(answers1))); // [1]
        System.out.println(Arrays.toString(모의고사.solution1(answers2))); // [1,2,3]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(int[] answers) {
        int[] supoja1 = {1,2,3,4,5}, supoja2 = {2,1,2,3,2,4,2,5}, supoja3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0, count2 = 0, count3 = 0;

        for(int i = 0 ; i < answers.length; i++){
            //수포자들의 인덱스번호 [i]는 각자의 배열 길이만큼이 계속 반복 되어야 함
            if(answers[i] == supoja1[i%supoja1.length]) count1++;
            if(answers[i] == supoja2[i%supoja2.length]) count2++;
            if(answers[i] == supoja3[i%supoja3.length]) count3++;
        }

        //1등이 몇명이 나올 줄 모르므로 List선언
        ArrayList<Integer> list = new ArrayList<>();

        //제일 높은 점수 찾기
        // #1
//        int max = count1; //count1이 제일 높다고 가정
//        if(max < count2) max = count2;
//        if(max < count3) max = count3;

        // #2
        int max = Math.max(Math.max(count1, count2),count3); // max값 구하기

        //제일 점수 높은 사람 list에 담기
        if(max == count1) list.add(1);
        if(max == count2) list.add(2);
        if(max == count3) list.add(3);

        int[] answer = new int[list.size()];

        for(int i =0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}