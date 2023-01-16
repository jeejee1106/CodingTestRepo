package programmers.level0;

public class 숫자찾기 {
    public static void main(String[] args) {
        int num1 = 29183;
        int k1 = 1;

        int num2 = 232443;
        int k2 = 4;

        int num3 = 123456;
        int k3 = 7;

        System.out.println(숫자찾기.solution1(num1, k1)); //3
        System.out.println(숫자찾기.solution1(num2, k2)); //4
        System.out.println(숫자찾기.solution1(num3, k3)); //-1
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int num, int k) {
        String stringNum = Integer.toString(num);
        String stringK = Integer.toString(k);

        int answer = stringNum.indexOf(stringK);

        return answer != -1 ? answer + 1 : -1;
    }
}
