package ect.hm;

public class yg2 {
    public static void main(String[] args) {
        String phone_number1 = "01012345678";
        String phone_number2 = "010-1212-3333";
        String phone_number3 = "+82-10-3243-2323";
        String phone_number4 = "+82-010-3434-2226";

        System.out.println((yg2.solution1(phone_number1)));
        System.out.println((yg2.solution1(phone_number2)));
        System.out.println((yg2.solution1(phone_number3)));
        System.out.println((yg2.solution1(phone_number4)));
    }

    /////////////////[solution ����]/////////////////

    public static int solution1(String phone_number) {
        int answer = -1;

        //phone_number�� -�� ���ԵǾ� ���� �ʴ�? ���ڿ� ���� ���� 11���� 2����
        //-�� ���ԵǾ� �ְ� +�� ���ԵǾ� ���� �ʴ�? 4, 9��°�� -��, 13�ڸ����� 1����
        //+�� ���ԵǾ��ִ�? 1���� +�� �ְ�, 4, 7, 12��°�� -��, 16�ڸ����� 3����
        //�ƹ��͵� �ƴϸ� -1 ����

        if (!phone_number.contains("-") && !phone_number.contains("+") && phone_number.length() == 11) {
            return 2;
        } else if (phone_number.contains("-") && !phone_number.contains("+") && phone_number.length() == 13 && phone_number.indexOf("-") == 3 && phone_number.indexOf("-",7) == 8) {
            return 1;
        } else if (phone_number.indexOf("+") == 0 && phone_number.indexOf("-") == 3 && phone_number.indexOf("-", 5) == 6 && phone_number.indexOf("-", 8) == 11 && phone_number.length() == 16) {
            return 3;
        } else {
            return -1;
        }


    }
}