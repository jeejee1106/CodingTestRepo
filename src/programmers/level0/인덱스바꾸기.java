package programmers.level0;

public class �ε����ٲٱ� {
    public static void main(String[] args) {
        String my_string1 = "hello";
        int numA1 = 1;
        int numB1 = 2;

        String my_string2 = "I love you";
        int numA2 = 3;
        int numB2 = 6;

        System.out.println(�ε����ٲٱ�.solution1(my_string1, numA1, numB1)); //hlelo
        System.out.println(�ε����ٲٱ�.solution1(my_string2, numA2, numB2)); //I l veoyou
    }

    /////////////////[solution ����]/////////////////
    public static String solution1(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");

        String tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;

        return String.join("", arr);
    }
}
