package programmers.level0;

public class 모음제거 {
    public static void main(String[] args) {
        String my_string1 = "bus";
        String my_string2 = "nice to meet you";

        System.out.println(모음제거.solution1(my_string1)); //bs
        System.out.println(모음제거.solution1(my_string2)); //nc t mt y

        System.out.println(모음제거.solution2(my_string1)); //bs
        System.out.println(모음제거.solution2(my_string2)); //nc t mt y

        System.out.println(모음제거.solution3(my_string1)); //bs
        System.out.println(모음제거.solution3(my_string2)); //nc t mt y

    }

    /////////////////[solution 시작]/////////////////
    //평균 속도 0.15ms
    public static String solution1(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    //평균 속도 0.15ms
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

    //평균 속도 0.05ms
    //흠 replace보다는 contains가 더 빠르다는건가??
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
