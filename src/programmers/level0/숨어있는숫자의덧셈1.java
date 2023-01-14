package programmers.level0;

public class �����ִ¼����ǵ���1 {
    public static void main(String[] args) {
        String my_string1 = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123";

        System.out.println(�����ִ¼����ǵ���1.solution1(my_string1)); //10
        System.out.println(�����ִ¼����ǵ���1.solution1(my_string2)); //16

        System.out.println(�����ִ¼����ǵ���1.solution2(my_string1)); //10
        System.out.println(�����ִ¼����ǵ���1.solution2(my_string2)); //16
    }

    /////////////////[solution ����]/////////////////
    //��� �ӵ� 6.10ms
    public static int solution1(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("");

        for (String s : arr) {
            for (int i = 0; i < my_string.length(); i++) {
                if (s.equals("" + i)) {
                    answer += Integer.parseInt(s);
                    break;
                }
            }
        }

        return answer;
    }

    //��� 3.5ms ��..
    public static int solution2(String my_string) {
        return my_string.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }
}
