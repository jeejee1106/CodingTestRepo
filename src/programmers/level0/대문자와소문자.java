package programmers.level0;

public class �빮�ڿͼҹ��� {
    public static void main(String[] args) {
        String my_string1 = "cccCCC";
        String my_string2 = "abCdEfghIJ";

        System.out.println(�빮�ڿͼҹ���.solution1(my_string1)); //CCCccc
        System.out.println(�빮�ڿͼҹ���.solution1(my_string2)); //ABcDeFGHij

        System.out.println(�빮�ڿͼҹ���.solution2(my_string1)); //CCCccc
        System.out.println(�빮�ڿͼҹ���.solution2(my_string2)); //ABcDeFGHij
    }

    /////////////////[solution ����]/////////////////
    public static String solution1(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");

        for (String s : arr) {
            if (s.equals(s.toUpperCase())) {
                answer += s.toLowerCase();
            } else {
                answer += s.toUpperCase();
            }
        }
        return answer;
    }

    public static String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");

        for (String s : arr) {
            if (s.equals(s.toUpperCase())) {
                sb.append(s.toLowerCase());
            } else {
                sb.append(s.toUpperCase());
            }
        }
        return sb.toString();
    }
}
