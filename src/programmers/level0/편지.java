package programmers.level0;

public class ���� {
    public static void main(String[] args) {
        String my_string1 = "jaron";
        String my_string2 = "bread";

        System.out.println(����.solution1(my_string1)); //noraj
        System.out.println(����.solution1(my_string2)); //daerb

        System.out.println(����.solution2(my_string1)); //noraj
        System.out.println(����.solution2(my_string2)); //daerb
    }

    /////////////////[solution ����]/////////////////
    public static String solution1(String my_string) {
        String answer = "";

        for (int i = 1; i <= my_string.length(); i++) {
            answer += my_string.charAt(my_string.length() - i);
        }

        return answer;
    }

    //�� charAt���� StringBuilder�� 500~1000�� ���� �淩
    //charAt�� 10.0ms / StringBuilder�� 0.02ms
    public static String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
