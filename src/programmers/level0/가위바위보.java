package programmers.level0;

public class ���������� {
    public static void main(String[] args) {
        String my_string1 = "2";
        String my_string2 = "205";

        System.out.println(����������.solution1(my_string1)); //0
        System.out.println(����������.solution1(my_string2)); //052

        System.out.println(����������.solution2(my_string1)); //0
        System.out.println(����������.solution2(my_string2)); //052
    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 2.0ms...
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

    //��� �ӵ� 0.04ms.. �̷� ���� ���� ���ϴ� Ǯ���ε��̤� ������ �����ϳ�...��
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
