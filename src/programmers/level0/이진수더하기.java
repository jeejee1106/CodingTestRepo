package programmers.level0;

import java.math.BigInteger;

public class ���������ϱ� {
    public static void main(String[] args) {
        String binA1 = "10";
        String binB1 = "11";

        String binA2 = "1001";
        String binB2 = "1111";

        System.out.println(���������ϱ�.solution1(binA1, binB1)); //101
        System.out.println(���������ϱ�.solution1(binA2, binB2)); //11000

        System.out.println(���������ϱ�.solution2(binA1, binB1)); //101
        System.out.println(���������ϱ�.solution2(binA2, binB2)); //11000

        System.out.println(���������ϱ�.solution3(binA1, binB1)); //101
        System.out.println(���������ϱ�.solution3(binA2, binB2)); //11000

    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 1.00ms
    public static String solution1(String bin1, String bin2) {
        //1. 10������ �ٲ��ֱ�. 2������ 80�ڸ�� ǥ���� �� �ִµ�, �̸� 10������ �ٲ��ָ� LongŸ���� �Ѿ�� �ȴ�.
        //�׷��� ������ BigIntegerŸ���� ���ش�. (���� �ش� ������ ������ 10�ڸ� �̱���)
        BigInteger binary1 = new BigInteger(bin1, 2);
        BigInteger binary2 = new BigInteger(bin2, 2);

        //2. 10������ ��ȯ�� ������ �����ֱ�
        BigInteger sum = binary1.add(binary2);

        //3. ���� ���� �ٽ� 2������ ��ȯ�ϱ�
        String answer = sum.toString(2);

        return answer;
    }

    //��ռӵ� 0.03ms
    public static String solution2(String bin1, String bin2) {
        //�� ������ �˸´� �ڵ� (�������� �־��� ���� ������ �۾Ƽ� ���� Ÿ���� Integer�� ��Ƶ���)
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);

    }

    //��ռӵ� 0.3~0.4ms
    public static String solution3(String bin1, String bin2) {
        BigInteger bin1Binary = new BigInteger(bin1, 2);
        BigInteger bin2Binary = new BigInteger(bin2, 2);

        int num = (bin1Binary.add(bin2Binary)).intValue(); //BigInteger -> int

        return Integer.toBinaryString(num);
    }
}
