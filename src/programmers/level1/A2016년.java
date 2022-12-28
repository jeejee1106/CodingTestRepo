package programmers.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class A2016�� {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        System.out.println(A2016��.solution1(a, b)); //TUE
    }

    /////////////////[solution ����]/////////////////
    public static String solution1(int a, int b) {
        /**
         * ���̺귯�� ����� ���� Ǯ��
         */
        String answer = "";
        String[] weeks = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        // 1. LocalDate ����
        LocalDate date = LocalDate.of(2016, a, b);

        // 2. DayOfWeek ��ü ���ϱ�
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // 3. ���� ���� ���ϱ�
        int dayOfWeekNumber = dayOfWeek.getValue();

        //4. weeks�迭���� dayOfWeekNumber���� �ش��ϴ� ���� ��������
        //�� ��, -1�� �� ������� dayOfWeek.getValue()�� ������ ~ �Ͽ����� ���� 1 ~ 7�� ǥ���ϰ� �ֱ� ������ �迭�� index�� ��������Ѵ�.
        answer = weeks[dayOfWeekNumber - 1];

        return answer;
    }

    public static String solution2(int a, int b) {
        /**
         * ���α׷��ӽ����� �߰��� ����� Ǯ��...���ƴٴ� ���ۿ�... ���� �̷� ���� Ű���...!
         * ������ "2016�� 1�� 1���� �ݿ����Դϴ�." ��� ������ ���� �ִ� �� �ƴ϶�� ����� �ô�. �´¸���.. ������ �ǵ��� ���̺귯���� ����� �� �ƴ� �� ����.
         * �˰����� �̷��� Ǯ��...
         */
        String answer = "";

        int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int Adate = 0;
        for(int i = 0 ; i< a-1; i++){
            Adate += c[i];
        }
        Adate += b-1;
        answer = MM[Adate % 7];

        return answer;
    }

    /**
     * �������� ���� ���� �Ұ�.
     * �̹� ������ Ǯ�� ������. �� ���� ���� �־�����...
     * �� ���׸� ���� ������ ���ϰԸ� Ǯ���� �ϰ� �־�����..�ϰ� ���̴�.
     * �˰����� �� ��Ȯ�� �����ϰ�, ������ Ǫ�� ������ ���� ���� Ű���� �� �� ����.
     * �ݼ����ڹݼ�����
     */
}