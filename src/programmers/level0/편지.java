package programmers.level0;

public class 편지 {
    public static void main(String[] args) {
        String my_string1 = "jaron";
        String my_string2 = "bread";

        System.out.println(편지.solution1(my_string1)); //noraj
        System.out.println(편지.solution1(my_string2)); //daerb

        System.out.println(편지.solution2(my_string1)); //noraj
        System.out.println(편지.solution2(my_string2)); //daerb
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String my_string) {
        String answer = "";

        for (int i = 1; i <= my_string.length(); i++) {
            answer += my_string.charAt(my_string.length() - i);
        }

        return answer;
    }

    //위 charAt보다 StringBuilder가 500~1000배 빠름 헐랭
    //charAt은 10.0ms / StringBuilder는 0.02ms
    public static String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
