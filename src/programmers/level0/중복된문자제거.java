package programmers.level0;

import java.util.*;

public class �ߺ��ȹ������� {
    public static void main(String[] args) {
        String my_string1 = "people";
        String my_string2 = "We are the world";

        System.out.println(�ߺ��ȹ�������.solution1(my_string1)); //peol
        System.out.println(�ߺ��ȹ�������.solution1(my_string2)); //We arthwold

        System.out.println(�ߺ��ȹ�������.solution2(my_string1)); //peol
        System.out.println(�ߺ��ȹ�������.solution2(my_string2)); //We arthwold
    }

    /////////////////[solution ����]/////////////////
    //��� 15.00ms ��.. �̰� �����ڱ���..charAt�� �ǵ���...�Ⱦ��°ɷ�..
    public static String solution1(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    //��� 0.8ms
    public static String solution2(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
