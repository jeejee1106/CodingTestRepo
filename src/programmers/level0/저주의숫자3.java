package programmers.level0;

public class �����Ǽ���3 {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 40;

        System.out.println(�����Ǽ���3.solution1(n1)); //25
        System.out.println(�����Ǽ���3.solution1(n2)); //76
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int n) {
        int answer = n;

        //i�� n���� �۰ų� ���� �� ���� �ݺ�
        for (int i = 1; i <= answer; i++) {
            //���࿡ i�� 3�� ����ų� i�� 3�� ���ԵǾ� ������ answer�� 1�� ���� -> 3x ������ �꿡 ���ߴ� ����
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
        }

        return answer;
    }
}
