package programmers.level0;

public class ������� {
    public static void main(String[] args) {
        int age1 = 40;
        int age2 = 23;
        int age3 = 28;

        System.out.println(�������.solution1(age1)); //1983
        System.out.println(�������.solution1(age2)); //2000
        System.out.println(�������.solution1(age3)); //1995
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int age) {
        return 2022 - age + 1;
    }
}
