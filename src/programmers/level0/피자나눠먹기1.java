package programmers.level0;

public class 피자나눠먹기1 {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 1;
        int n3 = 15;

        System.out.println(피자나눠먹기1.solution1(n1)); //1
        System.out.println(피자나눠먹기1.solution1(n2)); //1
        System.out.println(피자나눠먹기1.solution1(n3)); //3
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) {
        if (n % 7 == 0) {
            return n / 7;
        } else {
            return n / 7 + 1;
        }

        //삼항연산자로 나타내면 이렇게
//        return (n % 7 == 0) ? n / 7 : n / 7 + 1;
    }
}
