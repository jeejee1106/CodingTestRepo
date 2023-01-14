package programmers.level0;

public class 암호해독 {
    public static void main(String[] args) {
        String cipher1 = "dfjardstddetckdaccccdegk";
        int code1 = 4;

        String cipher2 = "pfqallllabwaoclk";
        int code2 = 2;

        System.out.println(암호해독.solution1(cipher1, code1)); //attack
        System.out.println(암호해독.solution1(cipher2, code2)); //fallback

        System.out.println(암호해독.solution2(cipher1, code1)); //attack
        System.out.println(암호해독.solution2(cipher2, code2)); //fallback
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] arr = cipher.split("");
        int num = code;

        for (int i = code; i <= arr.length; i = code) {
            answer.append(arr[i - 1]);
            code += num;
        }

        return answer.toString();
    }

    public static String solution2(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }

        return answer;
    }
}
