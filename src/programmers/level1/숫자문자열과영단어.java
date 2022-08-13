package programmers.level1;

public class ���ڹ��ڿ������ܾ� {
    public static void main(String[] args) {
        String s1 = "one4seveneight";
        String s2 = "23four5six7";
        String s3 = "2three45sixseven";
        String s4 = "123";

        System.out.println(���ڹ��ڿ������ܾ�.solution1(s1)); //1478
        System.out.println(���ڹ��ڿ������ܾ�.solution1(s2)); //234567
        System.out.println(���ڹ��ڿ������ܾ�.solution1(s3)); //234567
        System.out.println(���ڹ��ڿ������ܾ�.solution1(s4)); //123
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < num.length; i++){
            //���ڿ� s�� num[i]�� ���ԵǾ� ������ replace���ֱ�
            s = s.replace(num[i], Integer.toString(i)); //1. intŸ���� StringŸ������ �ٲ��� �� Integer.toString()
            //2. "" + i �� �ص� StringŸ���� ���ڰ� �ȴ�.
        }

        return Integer.parseInt(s); //StringŸ���� intŸ������ �ٲ��� �� Integer.parseInt();
    }
}