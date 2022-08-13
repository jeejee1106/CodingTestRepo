package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class ���ǰ�� {
    public static void main(String[] args) {
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        System.out.println(Arrays.toString(���ǰ��.solution1(answers1))); // [1]
        System.out.println(Arrays.toString(���ǰ��.solution1(answers2))); // [1,2,3]
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(int[] answers) {
        int[] supoja1 = {1,2,3,4,5}, supoja2 = {2,1,2,3,2,4,2,5}, supoja3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0, count2 = 0, count3 = 0;

        for(int i = 0 ; i < answers.length; i++){
            //�����ڵ��� �ε�����ȣ [i]�� ������ �迭 ���̸�ŭ�� ��� �ݺ� �Ǿ�� ��
            if(answers[i] == supoja1[i%supoja1.length]) count1++;
            if(answers[i] == supoja2[i%supoja2.length]) count2++;
            if(answers[i] == supoja3[i%supoja3.length]) count3++;
        }

        //1���� ����� ���� �� �𸣹Ƿ� List����
        ArrayList<Integer> list = new ArrayList<>();

        //���� ���� ���� ã��
        // #1
//        int max = count1; //count1�� ���� ���ٰ� ����
//        if(max < count2) max = count2;
//        if(max < count3) max = count3;

        // #2
        int max = Math.max(Math.max(count1, count2),count3); // max�� ���ϱ�

        //���� ���� ���� ��� list�� ���
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