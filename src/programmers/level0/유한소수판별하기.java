package programmers.level0;

public class 유한소수판별하기 {
    public static void main(String[] args) {
        int a1 = 7,  b1 = 20;
        int a2 = 11, b2 = 22;
        int a3 = 12, b3 = 21;

        System.out.println(유한소수판별하기.solution1(a1, b1)); //1
        System.out.println(유한소수판별하기.solution1(a2, b2)); //1
        System.out.println(유한소수판별하기.solution1(a3, b3)); //2
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int a, int b) {
        int answer = 0;
        //1. 두 수의 최대공약수 구하기(유클리드호제법)
        int gcd = getGcd(a, b);

        //2. 최대공약수로 분모 나누기
        int denominator = b / gcd;

        //3. 분모의 소인수 구하기
        while (denominator != 1) {
            if (denominator % 2 == 0) {
                denominator /= 2;
            } else if (denominator % 5 == 0) {
                denominator /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }

    public static int getGcd(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int val = max % min;

        if(val == 0){
            return min;
        } else{
            return getGcd(min, val);
        }
    }
}
