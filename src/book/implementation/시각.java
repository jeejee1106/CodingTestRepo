package book.implementation;

public class �ð� {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 13;

        System.out.println("solution1 = " + �ð�.solution1(n1)); // 11475
        System.out.println("solution1 = " + �ð�.solution1(n2)); // 26100
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int n) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int answer = 0;
        String time = "";

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    time = "" + i + j + k ; //���ڸ� ���ڿ��� �ٲ��ִ� �۾�
                    if (time.contains("3")) { //���ڿ��� 3�� ���ԵǾ� �ִ��� Ȯ��
                        answer++; //���ԵǾ��� �� ī��Ʈ ���ֱ�
                    }
                }
            }
        }

        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;
        double seconds = elapsedTime / 1000000000.0;
        System.out.println("seconds : " + seconds + "��");
        return answer;
    }
}