package programmers.level0;

import java.math.BigInteger;

public class 이진수더하기 {
    public static void main(String[] args) {
        String binA1 = "10";
        String binB1 = "11";

        String binA2 = "1001";
        String binB2 = "1111";

        System.out.println(이진수더하기.solution1(binA1, binB1)); //101
        System.out.println(이진수더하기.solution1(binA2, binB2)); //11000

        System.out.println(이진수더하기.solution2(binA1, binB1)); //101
        System.out.println(이진수더하기.solution2(binA2, binB2)); //11000

        System.out.println(이진수더하기.solution3(binA1, binB1)); //101
        System.out.println(이진수더하기.solution3(binA2, binB2)); //11000

    }

    /////////////////[solution 시작]/////////////////
    //평균속도 1.00ms
    public static String solution1(String bin1, String bin2) {
        //1. 10진수로 바꿔주기. 2진수는 80자리까리 표현할 수 있는데, 이를 10진수로 바꿔주면 Long타입을 넘어가게 된다.
        //그렇기 때문에 BigInteger타입을 써준다. (물론 해당 문제는 조건이 10자리 이긴함)
        BigInteger binary1 = new BigInteger(bin1, 2);
        BigInteger binary2 = new BigInteger(bin2, 2);

        //2. 10진수로 변환된 값들을 더해주기
        BigInteger sum = binary1.add(binary2);

        //3. 더한 값을 다시 2진수로 변환하기
        String answer = sum.toString(2);

        return answer;
    }

    //평균속도 0.03ms
    public static String solution2(String bin1, String bin2) {
        //이 문제에 알맞는 코드 (문제에서 주어진 숫자 범위가 작아서 숫자 타입을 Integer로 잡아도됨)
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);

    }

    //평균속도 0.3~0.4ms
    public static String solution3(String bin1, String bin2) {
        BigInteger bin1Binary = new BigInteger(bin1, 2);
        BigInteger bin2Binary = new BigInteger(bin2, 2);

        int num = (bin1Binary.add(bin2Binary)).intValue(); //BigInteger -> int

        return Integer.toBinaryString(num);
    }
}
