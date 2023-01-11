package programmers.level0;

public class ���ڹݺ�����ϱ� {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        System.out.println(���ڹݺ�����ϱ�.solution1(my_string, n)); //hhheeellllllooo
        System.out.println(���ڹݺ�����ϱ�.solution2(my_string, n)); //hhheeellllllooo
        System.out.println(���ڹݺ�����ϱ�.solution3(my_string, n)); //hhheeellllllooo
        System.out.println(���ڹݺ�����ϱ�.solution4(my_string, n)); //hhheeellllllooo
    }

    /////////////////[solution ����]/////////////////
    //��� �ӵ� 1.30 ~ 1.40ms
    public static String solution1(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                answer += arr[i];
            }
        }

        return answer;
    }

    //��� �ӵ� 1.70ms
    public static String solution2(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");

        for (String s : arr) {
            for (int i = 1; i <= n; i++) {
                answer += s;
            }
        }

        return answer;
    }

    //��� �ӵ� 10.70ms -> Ȯ���� charAt, substring���� �޼���� �ð����⵵�� ���� ���� �� ����. ������ �� Ŀ���� �ð��ʰ� ���� ��.
    public static String solution3(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

    //�ڹ�11���� ���� ���� ���ڿ� �ݺ� �޼��� : repeat
    //��� �ӵ� 1.70ms ��ȣ ������ �ʳ�
    public static String solution4(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            answer += arr[i].repeat(n);
        }

        return answer;
    }
}
