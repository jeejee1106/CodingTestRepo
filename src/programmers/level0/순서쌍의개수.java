package programmers.level0;

import java.util.stream.IntStream;

public class �������ǰ��� {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 100;

        System.out.println(�������ǰ���.solution1(n1)); //6
        System.out.println(�������ǰ���.solution1(n2)); //9
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer = n % i == 0 ? answer + 1 : answer;
            //�� n���� �� �ȵ��Ƶ� �Ʒ�ó�� ���� �ָ� �� ������ �� ������.. �ƴѰ�?
//            if (i * i == n) {
//                answer = answer * 2 - 1;
//                break;
//            }
        }

        return answer;
    }

    //��Ʈ���� �ð��� ���̸� �����ɸ��� �����ؾ���..!
    public static int solution2(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
