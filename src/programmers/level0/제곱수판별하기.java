package programmers.level0;

public class 제곱수판별하기 {
    public static void main(String[] args) {
        int n1 = 144;
        int n2 = 976;

        System.out.println(제곱수판별하기.solution1(n1)); //1
        System.out.println(제곱수판별하기.solution1(n2)); //2
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) {
        int answer = 2;

        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                return 1;
            }
        }

        return answer;
    }

    //얘가 좀 더 빠르당
    public static int solution2(int n) {
        return n % Math.sqrt(n) == 0 ? 1 : 2;
    }
}
