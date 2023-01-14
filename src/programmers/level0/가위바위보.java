package programmers.level0;

public class 가위바위보 {
    public static void main(String[] args) {
        String my_string1 = "2";
        String my_string2 = "205";

        System.out.println(가위바위보.solution1(my_string1)); //0
        System.out.println(가위바위보.solution1(my_string2)); //052

        System.out.println(가위바위보.solution2(my_string1)); //0
        System.out.println(가위바위보.solution2(my_string2)); //052
    }

    /////////////////[solution 시작]/////////////////
    //평균속도 2.0ms...
    public static String solution1(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");

        for (String s : arr) {
            if (s.equals("2")) {
                answer += "0";
            } else if (s.equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }

    //평균 속도 0.04ms.. 이런 식이 내가 원하는 풀이인데ㅜㅜ 아직도 부족하네...휴
    public static String solution2(String rsp) {
        char[] cRsp = rsp.toCharArray();
        StringBuilder answer = new StringBuilder();

        for(int i=0; i < cRsp.length; i++) {
            switch(cRsp[i]) {
                case '0' :
                    answer.append("5");
                    break;
                case '2' :
                    answer.append("0");
                    break;
                case '5' :
                    answer.append("2");
                    break;
            }
        }
        return answer.toString();
    }
}
