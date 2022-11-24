package programmers.level0;

public class �������ü��� {
    public static void main(String[] args) {
        int[] common1 = {1, 2, 3, 4}; //����
        int[] common2 = {2, 4, 8}; //���
        int[] common3 = {70, 140, 210, 280, 350, 420}; //����
        int[] common4 = {1, 2, 4, 8}; //���
        int[] common5 = {3, 9, 27, 71}; //���

        System.out.println(�������ü���.solution1(common1)); //5
        System.out.println(�������ü���.solution1(common2)); //16
        System.out.println(�������ü���.solution1(common3)); //490
        System.out.println(�������ü���.solution1(common4)); //8 --> Ʋ����. 16�� ���;��Ѵ�.
        System.out.println(�������ü���.solution1(common5)); //213

        System.out.println();

        System.out.println(�������ü���.solution2(common1)); //5
        System.out.println(�������ü���.solution2(common2)); //16
        System.out.println(�������ü���.solution2(common3)); //490
        System.out.println(�������ü���.solution2(common4)); //16
        System.out.println(�������ü���.solution2(common5)); //213
    }

    /////////////////[solution ����]/////////////////

    /**
     * Ʋ�� ���̴�.
     * �ݷʸ� ���ؼ� ���ܵд�.
     * �������� ��
     * answer = common[common.length - 1] * (common[0]);
     * ��� �ڵ带 �����µ�, �ٸ� �������� �� ��������� �� �ϳ� ����� �ȵǴ� �������� �ִ�.
     * �ٷ� 1, 2, 4, 8 ... �� �����ϴ� �������̴�.
     * �׷��� ������ ������ ù��° ���Ҹ� �����ִ� ���� �ƴ� solution2ó�� ��� ���ؼ�(?) ������� �´� ���� ���´�.
     */
    public static int solution1(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[0]);
        }
        return answer;
    }

    public static int solution2(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) { //����2���� ����1���� ���� ����3�� ����2���� ���� ������ ���������̴�.
            answer = common[common.length - 1] + (common[1] - common[0]); //�迭�� ���� ������ ���� ������ ���� �����ָ� ������ �� ���� �ȴ�.
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }
}
