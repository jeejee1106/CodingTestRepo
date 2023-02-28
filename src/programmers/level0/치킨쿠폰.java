package programmers.level0;

public class ġŲ���� {
    public static void main(String[] args) {
        int chicken1 = 100;
        int chicken2 = 1081;
        int chicken3 = 0;
        int chicken4 = 1;
        int chicken5 = 500;
        int chicken6 = 999999;
        int chicken7 = 1999;

        System.out.println(ġŲ����.solution1(chicken1)); //11
        System.out.println(ġŲ����.solution1(chicken2)); //120
        System.out.println(ġŲ����.solution1(chicken3)); //0
        System.out.println(ġŲ����.solution1(chicken4)); //0
        System.out.println(ġŲ����.solution1(chicken5)); //55
        System.out.println(ġŲ����.solution1(chicken6)); //111110
        System.out.println(ġŲ����.solution1(chicken7)); //222
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int chicken) {
        int answer = 0;
        int couponCount = chicken;

        while(true) {
            couponCount = chicken / 10; //���񽺷� ���� �� �ִ� ġŲ ��
            answer += couponCount;
            chicken = chicken % 10 + couponCount; //ġŲ�� ���Ѹ԰� �� ���� ���� ���� ��
            if(chicken < 10) {
                break;
            }
        }
        return answer;
    }
}
