package programmers.level0;

public class 특정문자제거하기 {
    public static void main(String[] args) {
        String my_string1 = "abcdef";
        String letter1 = "f";

        String my_string2 = "BCBdbe";
        String letter2 = "B";

        System.out.println(특정문자제거하기.solution1(my_string1, letter1)); //abcde
        System.out.println(특정문자제거하기.solution1(my_string2, letter2)); //Cdbe
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
