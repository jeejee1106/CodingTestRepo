package programmers.level0;

public class �����ִ¼����ǵ���2 {
    public static void main(String[] args) {
        String my_string1 = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123Z";

        System.out.println(�����ִ¼����ǵ���2.solution1(my_string1)); //37
        System.out.println(�����ִ¼����ǵ���2.solution1(my_string2)); //133

        System.out.println(�����ִ¼����ǵ���2.solution2(my_string1)); //37
        System.out.println(�����ִ¼����ǵ���2.solution2(my_string2)); //133
    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 0.1~0.2ms �ٵ� 1.23ms�� �ϳ� �ֳ�...
    public static int solution1(String my_string) {
        String[] arr = my_string.replaceAll("[^0-9]", " ").split(" ");

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) {
                continue;
            } else {
                answer += Integer.parseInt(arr[i].trim());
            }
        }
        return answer;
    }

    //��ռӵ� 0.1~0.2ms
    public static int solution2(String my_string) {
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        int answer = 0;

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
