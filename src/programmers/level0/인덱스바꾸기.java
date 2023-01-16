package programmers.level0;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        String my_string1 = "hello";
        int numA1 = 1;
        int numB1 = 2;

        String my_string2 = "I love you";
        int numA2 = 3;
        int numB2 = 6;

        System.out.println(인덱스바꾸기.solution1(my_string1, numA1, numB1)); //hlelo
        System.out.println(인덱스바꾸기.solution1(my_string2, numA2, numB2)); //I l veoyou
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");

        String tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;

        return String.join("", arr);
    }
}
