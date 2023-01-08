package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 문자열밀기 {
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
        System.out.println(문자열밀기.solution1(A1, B1)); //1
        System.out.println(문자열밀기.solution1(A2, B2)); //-1
        System.out.println(문자열밀기.solution1(A3, B3)); //0
        System.out.println(문자열밀기.solution1(A4, B4)); //4

        System.out.println();

        System.out.println(">>>>>>solution 2<<<<<<<<");
        System.out.println(문자열밀기.solution2(A1, B1)); //1
        System.out.println(문자열밀기.solution2(A2, B2)); //-1
        System.out.println(문자열밀기.solution2(A3, B3)); //0
        System.out.println(문자열밀기.solution2(A4, B4)); //4

        System.out.println();

        System.out.println(">>>>>>solution 3<<<<<<<<");
        System.out.println(문자열밀기.solution3(A1, B1)); //1
        System.out.println(문자열밀기.solution3(A2, B2)); //-1
        System.out.println(문자열밀기.solution3(A3, B3)); //0
        System.out.println(문자열밀기.solution3(A4, B4)); //4

        System.out.println();

        System.out.println(">>>>>>solution 4<<<<<<<<");
        System.out.println(문자열밀기.solution4(A1, B1)); //1
        System.out.println(문자열밀기.solution4(A2, B2)); //-1
        System.out.println(문자열밀기.solution4(A3, B3)); //0
        System.out.println(문자열밀기.solution4(A4, B4)); //4
    }

    /////////////////[solution 시작]/////////////////
    //스스로 푼 풀이
    //평균 속도 0.54ms , 크기 73MB
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
                //문자열 밀기 로직
                list.add(0, list.get(list.size() - 1)); //이 때 리스트의 크기와
                list.remove(list.size() - 1); //이 때 리스트의 크기는 다르다. 주의!
                pushStr = String.join("", list);
            }
        }
        return -1;
    }

    //substring을 이용한 풀이(다른 사람 풀이 한 번 보고 스스로 풀어봄)
    //평균 속도 10.0ms , 크기 75MB
    //앗 배열 만들고 리스트 만드는 게 속도가 훨씬 빠르네? 아직 어떤 게 속도가 더 빠른지 이해하지 못했다,.ㅜㅜ
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

    //공부해봐야할 풀이 #1
    public static int solution3(String A, String B) {
        return (B+B).indexOf(A);
    }

    //공부해봐야할 풀이 #2
    public static int solution4(String A, String B) {
        String tempB = B.repeat(3);
        return tempB.indexOf(A);
    }


}
