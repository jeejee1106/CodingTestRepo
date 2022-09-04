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

    /////////////////[solution 시작]/////////////////

    public static int solution1(String phone_number) {
        int answer = -1;

        //phone_number에 -가 포함되어 있지 않다? 문자열 길이 세서 11개면 2리턴
        //-가 포함되어 있고 +가 포함되어 있지 않다? 4, 9번째가 -고, 13자리수면 1리턴
        //+가 포함되어있다? 1번에 +가 있고, 4, 7, 12번째가 -고, 16자리수면 3리턴
        //아무것도 아니면 -1 리턴

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