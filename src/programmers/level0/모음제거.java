package programmers.level0;

public class �������� {
    public static void main(String[] args) {
        String my_string1 = "bus";
        String my_string2 = "nice to meet you";

        System.out.println(��������.solution1(my_string1)); //bs
        System.out.println(��������.solution1(my_string2)); //nc t mt y

        System.out.println(��������.solution2(my_string1)); //bs
        System.out.println(��������.solution2(my_string2)); //nc t mt y

        System.out.println(��������.solution3(my_string1)); //bs
        System.out.println(��������.solution3(my_string2)); //nc t mt y

    }

    /////////////////[solution ����]/////////////////
    //��� �ӵ� 0.15ms
    public static String solution1(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    //��� �ӵ� 0.15ms
    public static String solution2(String my_string) {
        String answer = my_string;
        String[] arr = my_string.split("");
        String[] vowels = {"a", "e", "i", "o", "u"};

        for(String s : arr){
            for (String vowel : vowels) {
                if (s.equals(vowel)) {
                    answer = answer.replace(vowel, "");
                }
            }
        }

        return answer;
    }

    //��� �ӵ� 0.05ms
    //�� replace���ٴ� contains�� �� �����ٴ°ǰ�??
    public static String solution3(String my_string) {
        String answer = my_string;
        String[] vowels = {"a", "e", "i", "o", "u"};

        for (String vowel : vowels) {
            if (my_string.contains(vowel)) {
                answer = answer.replace(vowel, "");
            }
        }

        return answer;
    }
}
