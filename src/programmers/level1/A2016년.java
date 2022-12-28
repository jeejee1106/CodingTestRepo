package programmers.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class A2016년 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        System.out.println(A2016년.solution1(a, b)); //TUE
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(int a, int b) {
        /**
         * 라이브러리 사용한 나의 풀이
         */
        String answer = "";
        String[] weeks = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        // 1. LocalDate 생성
        LocalDate date = LocalDate.of(2016, a, b);

        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // 3. 숫자 요일 구하기
        int dayOfWeekNumber = dayOfWeek.getValue();

        //4. weeks배열에서 dayOfWeekNumber값에 해당하는 요일 가져오기
        //이 때, -1을 꼭 해줘야함 dayOfWeek.getValue()는 월요일 ~ 일요일을 숫자 1 ~ 7로 표현하고 있기 때문에 배열의 index와 맞춰줘야한다.
        answer = weeks[dayOfWeekNumber - 1];

        return answer;
    }

    public static String solution2(int a, int b) {
        /**
         * 프로그래머스에서 발견한 어떤분의 풀이...미쳤다는 말밖엔... 나도 이런 사고력 키우기...!
         * 문제에 "2016년 1월 1일은 금요일입니다." 라는 문구가 괜히 있는 게 아니라는 댓글을 봤다. 맞는말임.. 문제의 의도는 라이브러리를 쓰라는 게 아닌 것 같다.
         * 알고리즘은 이렇게 풀자...
         */
        String answer = "";

        int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int Adate = 0;
        for(int i = 0 ; i< a-1; i++){
            Adate += c[i];
        }
        Adate += b-1;
        answer = MM[Adate % 7];

        return answer;
    }

    /**
     * 오랜만에 쓰는 코테 소감.
     * 이번 문제를 풀고 느꼈다. 난 정말 한참 멀었구나...
     * 난 코테를 그저 빠르고 편하게만 풀려고 하고 있었구나..하고 말이다.
     * 알고리즘을 더 정확히 이해하고, 문제를 푸는 사고력을 정말 많이 키워야 할 것 같다.
     * 반성하자반성하자
     */
}