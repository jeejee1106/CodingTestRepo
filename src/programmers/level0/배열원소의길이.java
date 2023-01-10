package programmers.level0;

import java.util.Arrays;

public class 배열원소의길이 {
    public static void main(String[] args) {
        String[] strList1 = {"We", "are", "the", "world!"};
        String[] strList2 = {"I", "Love", "Programmers."};

        System.out.println(Arrays.toString(배열원소의길이.solution1(strList1))); //[2, 3, 3, 6]
        System.out.println(Arrays.toString(배열원소의길이.solution1(strList2))); //[1, 4, 12]

        System.out.println(Arrays.toString(배열원소의길이.solution2(strList1))); //[2, 3, 3, 6]
        System.out.println(Arrays.toString(배열원소의길이.solution2(strList2))); //[1, 4, 12]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(String[] strList) {
        int[] answer = new int[strList.length];

        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }

        return answer;
    }

    //stream을 이용한 풀이. 역시나 시간이...위 0.01~0.03ms, 아래 코드 3.0~1.9ms
    public static int[] solution2(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
