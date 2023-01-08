package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class ���ڿ��б� {
    public static void main(String[] args) {
        String A1 = "hello";
        String B1 = "ohell";

        String A2 = "apple";
        String B2 = "elppa";

        String A3 = "world";
        String B3 = "world";

        String A4 = "world";
        String B4 = "orldw";

        System.out.println(">>>>>>solution 1<<<<<<<<");
        System.out.println(���ڿ��б�.solution1(A1, B1)); //1
        System.out.println(���ڿ��б�.solution1(A2, B2)); //-1
        System.out.println(���ڿ��б�.solution1(A3, B3)); //0
        System.out.println(���ڿ��б�.solution1(A4, B4)); //4

        System.out.println();

        System.out.println(">>>>>>solution 2<<<<<<<<");
        System.out.println(���ڿ��б�.solution2(A1, B1)); //1
        System.out.println(���ڿ��б�.solution2(A2, B2)); //-1
        System.out.println(���ڿ��б�.solution2(A3, B3)); //0
        System.out.println(���ڿ��б�.solution2(A4, B4)); //4

        System.out.println();

        System.out.println(">>>>>>solution 3<<<<<<<<");
        System.out.println(���ڿ��б�.solution3(A1, B1)); //1
        System.out.println(���ڿ��б�.solution3(A2, B2)); //-1
        System.out.println(���ڿ��б�.solution3(A3, B3)); //0
        System.out.println(���ڿ��б�.solution3(A4, B4)); //4

        System.out.println();

        System.out.println(">>>>>>solution 4<<<<<<<<");
        System.out.println(���ڿ��б�.solution4(A1, B1)); //1
        System.out.println(���ڿ��б�.solution4(A2, B2)); //-1
        System.out.println(���ڿ��б�.solution4(A3, B3)); //0
        System.out.println(���ڿ��б�.solution4(A4, B4)); //4
    }

    /////////////////[solution ����]/////////////////
    //������ Ǭ Ǯ��
    //��� �ӵ� 0.54ms , ũ�� 73MB
    public static int solution1(String A, String B) {
        int answer = 0;
        String pushStr = A;

        String[] arr = A.split("");
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            if (pushStr.equals(B)) {
                return answer;
            } else {
                answer++;
                //���ڿ� �б� ����
                list.add(0, list.get(list.size() - 1)); //�� �� ����Ʈ�� ũ���
                list.remove(list.size() - 1); //�� �� ����Ʈ�� ũ��� �ٸ���. ����!
                pushStr = String.join("", list);
            }
        }
        return -1;
    }

    //substring�� �̿��� Ǯ��(�ٸ� ��� Ǯ�� �� �� ���� ������ Ǯ�)
    //��� �ӵ� 10.0ms , ũ�� 75MB
    //�� �迭 ����� ����Ʈ ����� �� �ӵ��� �ξ� ������? ���� � �� �ӵ��� �� ������ �������� ���ߴ�,.�̤�
    public static int solution2(String A, String B) {
        int answer = 0;

        if (A.equals(B)) {
            return 0;
        }

        while (answer < A.length()) {
            answer++;
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            if (A.equals(B)) {
                return answer;
            }
        }
        return -1;
    }

    //�����غ����� Ǯ�� #1
    public static int solution3(String A, String B) {
        return (B+B).indexOf(A);
    }

    //�����غ����� Ǯ�� #2
    public static int solution4(String A, String B) {
        String tempB = B.repeat(3);
        return tempB.indexOf(A);
    }


}
