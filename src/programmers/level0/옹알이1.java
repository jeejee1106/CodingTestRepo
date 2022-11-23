package programmers.level0;

public class �˾���1 {
    public static void main(String[] args) {
        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(�˾���1.solution1(babbling1)); //1
        System.out.println(�˾���1.solution1(babbling2)); //3
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(String[] babbling) {
        int answer = 0;
        String[] orgArr = {"aya", "ye", "woo", "ma"}; //��ī�� ���� �� �ִ� �ܾ�

        for (String paramBab : babbling) {
            for (String orgStr : orgArr) {
                //babbling�� �� ���ҿ� ��ī�� ���� �� �ִ� �ܾ ���ԵǾ����� �� �ܾ Y�� ���÷��̽�
                paramBab = paramBab.replace(orgStr, "Y");
            }
            //�� �ܾ�� �ִ� �� ���� �̾�ٿ� ���� �� �����Ƿ� �ִ� �� �ܾ �̾�ٿ� ���� �� �ִ�.
            //�׷��� ������ ���÷��̽��� paramBab�� Y, YY, YYY, YYYY ��� answer�� 1�� �����ش�.
            if (paramBab.equals("Y") || paramBab.equals("YY") || paramBab.equals("YYY") || paramBab.equals("YYYY")) {
                answer++;
            }
        }
        return answer;
    }

    public static int solution2(String[] babbling) {
        int answer = 0;
        String[] orgArr = {"aya", "ye", "woo", "ma"}; //��ī�� ���� �� �ִ� �ܾ�

        for (String paramBab : babbling) {
            for (String orgStr : orgArr) {
                //babbling�� �� ���ҿ� ��ī�� ���� �� �ִ� �ܾ ���ԵǾ����� �� �ܾ Y�� ���÷��̽�
                paramBab = paramBab.replace(orgStr, "Y");
            }
            //Y�� �������� ���÷��̽�. (�� �ش信���� Y, YY, YYY, YYYY�� �˻��ϴ� ���ŷο��� ���ֱ� ����)
            paramBab = paramBab.replace("Y", "");
            //paramBab�� �����̶��(paramBab�� ��� Y���) answer�� 1�� �����ش�.
            if (paramBab.equals("")) {
                answer++;
            }
        }
        return answer;

        /**
         * �� Ǯ�̿��� �����ؾ��� ��
         * for���� �� �� �� �ѹ��� �������� replace���� �ʰ� Y�� ��ȯ �� for���� ������ �ٽ� �� Y�� �������� replace�ߴ��ĸ�!!
         * for������ �������� replace�� �ϸ� "wyeoo" �� ���� ���ڿ��� ������ �� "ye"�� ���� �������� replace�Ǹ� "woo"�� �ȴ�.
         * �׸��� �ٽ� "woo"�� for���� ���鼭 �������� replace�ȴ�. �׷� ���������� "wyeoo"�� ������ �Ǿ� answer++�� ����ȴ�.
         * ������ "wyeoo"�� ������ ��ī�� ������ �� ���� �ܾ��̴�.
         * �׷��� ������ for�������� Y�� replace�� �ϰ�, ��ī�� ������ �� �ִ� �ܾ�鳢�� ���յ� paramBab�� ã�� �������� replace ���ذ��̴�!
         */
    }
}
