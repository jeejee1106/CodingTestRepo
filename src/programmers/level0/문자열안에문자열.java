package programmers.level0;

public class ���ڿ��ȿ����ڿ� {
    public static void main(String[] args) {
        String strA1 = "ab6CDE443fgh22iJKlmn1o";
        String strB1 = "6CD";

        String strA2 = "ppprrrogrammers";
        String strB2 = "pppp";

        String strA3 = "AbcAbcA";
        String strB3 = "AAA";

        System.out.println(���ڿ��ȿ����ڿ�.solution1(strA1, strB1)); //1
        System.out.println(���ڿ��ȿ����ڿ�.solution1(strA2, strB2)); //2
        System.out.println(���ڿ��ȿ����ڿ�.solution1(strA3, strB3)); //2
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
