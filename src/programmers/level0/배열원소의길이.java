package programmers.level0;

import java.util.Arrays;

public class �迭�����Ǳ��� {
    public static void main(String[] args) {
        String[] strList1 = {"We", "are", "the", "world!"};
        String[] strList2 = {"I", "Love", "Programmers."};

        System.out.println(Arrays.toString(�迭�����Ǳ���.solution1(strList1))); //[2, 3, 3, 6]
        System.out.println(Arrays.toString(�迭�����Ǳ���.solution1(strList2))); //[1, 4, 12]

        System.out.println(Arrays.toString(�迭�����Ǳ���.solution2(strList1))); //[2, 3, 3, 6]
        System.out.println(Arrays.toString(�迭�����Ǳ���.solution2(strList2))); //[1, 4, 12]
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(String[] strList) {
        int[] answer = new int[strList.length];

        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }

        return answer;
    }

    //stream�� �̿��� Ǯ��. ���ó� �ð���...�� 0.01~0.03ms, �Ʒ� �ڵ� 3.0~1.9ms
    public static int[] solution2(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
