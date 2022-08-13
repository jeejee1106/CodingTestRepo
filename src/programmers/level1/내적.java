package programmers.level1;

import java.util.Arrays;

public class ���� {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        int[] a2 = {-1,0,1};
        int[] b2 = {1,0,-1};

        System.out.println(����.solution1(a, b)); //3
        System.out.println(����.solution1(a2, b2)); //-2
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }
}