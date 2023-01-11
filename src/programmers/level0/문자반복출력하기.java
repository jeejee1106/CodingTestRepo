package programmers.level0;

public class 문자반복출력하기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        System.out.println(문자반복출력하기.solution1(my_string, n)); //hhheeellllllooo
        System.out.println(문자반복출력하기.solution2(my_string, n)); //hhheeellllllooo
        System.out.println(문자반복출력하기.solution3(my_string, n)); //hhheeellllllooo
        System.out.println(문자반복출력하기.solution4(my_string, n)); //hhheeellllllooo
    }

    /////////////////[solution 시작]/////////////////
    //평균 속도 1.30 ~ 1.40ms
    public static String solution1(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                answer += arr[i];
            }
        }

        return answer;
    }

    //평균 속도 1.70ms
    public static String solution2(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");

        for (String s : arr) {
            for (int i = 1; i <= n; i++) {
                answer += s;
            }
        }

        return answer;
    }

    //평균 속도 10.70ms -> 확실히 charAt, substring같은 메서드는 시간복잡도가 높은 편인 것 같다. 범위가 더 커지면 시간초과 나올 듯.
    public static String solution3(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

    //자바11부터 새로 나온 문자열 반복 메서드 : repeat
    //평균 속도 1.70ms 오호 나쁘지 않네
    public static String solution4(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            answer += arr[i].repeat(n);
        }

        return answer;
    }
}
