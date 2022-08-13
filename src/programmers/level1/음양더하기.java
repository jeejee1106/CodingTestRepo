package programmers.level1;

public class ������ϱ� {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false,false,true};

        System.out.println(������ϱ�.solution1(absolutes, signs)); //9
        System.out.println(������ϱ�.solution1(absolutes2, signs2)); //0

        //�ٽ� �ʱ�ȭ (��.. �׽�Ʈ �ڵ�� ¥�� �� �� ��������...?)
        int[] absolutes3 = {4,7,12};
        boolean[] signs3 = {true,false,true};

        int[] absolutes4 = {1,2,3};
        boolean[] signs4 = {false,false,true};
        System.out.println(������ϱ�.solution2(absolutes3, signs3)); //9
        System.out.println(������ϱ�.solution2(absolutes4, signs4)); //0
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < signs.length; i++){
            if(!signs[i]){ //signs[i]�� false�̸� absolutes[i]�� ���� �����̱� ������
                absolutes[i] *= (-1); //-1 �����༭ ���� ���������� �����
            }
            answer += absolutes[i]; //��� absolutes[i]�� �� ���ϱ�
        }

        return answer;
    }

    public static int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;

        //���׿����ڸ� �̿��� Ǯ��
        for(int i = 0; i < signs.length; i++){
            // signs[i]�� true��? absolutes[i]�״��! true�ƴϾ�? absolutes[i]�� -1 �����ֱ�
            // �� �ٷ� answer�� �����ֱ�!
            answer += signs[i] ? absolutes[i] : absolutes[i] * (-1);
//            answer += absolutes[i] * (signs[i]? 1: -1); // ���׿����ڸ� �̷��� ���� �����..! ���� ������ �����ϱ�... ����ؾ߰ڴ�.
        }

        return answer;
    }
}