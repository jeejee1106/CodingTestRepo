package programmers.level0;

import java.util.*;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        String s1 = "abcabcadc";
        String s2 = "abdc";
        String s3 = "hello";

        System.out.println(한번만등장한문자.solution1(s1)); //d
        System.out.println(한번만등장한문자.solution1(s2)); //abcd
        System.out.println(한번만등장한문자.solution1(s3)); //eho

        System.out.println(한번만등장한문자.solution2(s1)); //d
        System.out.println(한번만등장한문자.solution2(s2)); //abcd
        System.out.println(한번만등장한문자.solution2(s3)); //eho
    }

    /////////////////[solution 시작]/////////////////
//    평균 2.0ms
    public static String solution1(String s) {
        String[] arr = s.split("");
        Map<String, Integer> map = new HashMap();

        for (String s1 : arr) {
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }

        String answer = "";

        for (String s1 : map.keySet()) {
            if (map.get(s1) == 1) {
                answer += s1;
            }
        }

        String[] rmDuple = answer.split("");
        Arrays.sort(rmDuple);

        return String.join("", rmDuple);
    }

//    평균 8.0ms
    public static String solution2(String s) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String replace = s.replace(s.charAt(i) + "", "");
            if(s.length() - replace.length() == 1){
                set.add(s.charAt(i)+"");
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        return String.join("", list);
    }
}
