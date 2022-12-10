package programmers.level0;

public class ��ġ�¼����Ǳ��� {
    public static void main(String[] args) {
        int[][] lines1 = {
                {0, 1},   //[(0,0) (0,1)]
                {2, 5},   //[(1,0) (1,1)]
                {3, 9}};  //[(2,0) (2,1)]

        int[][] lines2 = {
                {-1, 1},  //[(0,0) (0,1)]
                { 1, 3},  //[(1,0) (1,1)]
                { 3, 9}}; //[(2,0) (2,1)]

        int[][] lines3 = {
                {0, 5},   //[(0,0) (0,1)]
                {3, 9},   //[(1,0) (1,1)]
                {1, 10}}; //[(2,0) (2,1)]

        System.out.println(��ġ�¼����Ǳ���.solution1(lines1)); //2
        System.out.println(��ġ�¼����Ǳ���.solution1(lines2)); //0
        System.out.println(��ġ�¼����Ǳ���.solution1(lines3)); //8
        System.out.println();
        System.out.println(��ġ�¼����Ǳ���.solution2(lines1)); //2
        System.out.println(��ġ�¼����Ǳ���.solution2(lines2)); //0
        System.out.println(��ġ�¼����Ǳ���.solution2(lines3)); //8
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int[][] lines) {
        int answer = 0;
        //1. �迭 ���� �� �ʱ�ȭ
        int[] arr = new int[201]; //������ ������ -100 ~ 100�̱� ������ ���� 201(0����)�� �迭 ����

        //2. ���� ��ǥ�� �ش��ϴ� �迭 �ε����� ++ ���ֱ�
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) { // +100�� ���ִ� ����? �迭�� �ε��� ������ ���������� �ȵǱ� ������.
                arr[j]++;
            }
        }

        //3. arr �迭�� �� ���鼭 �� �ε����� ������ 2�� �̻��̸� answer++ ���ֱ�
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                answer++;
            }
        }

        return answer;
    }

    public static int solution2(int[][] lines) {
        //�ϳ��� ����� �ϴ� �ڵ���� ���� �޼���� �̾ƺ��Ҵ�. ��ü����������!

        int answer = 0;

        //1. �迭 ���� �� �ʱ�ȭ
        int[] arr = new int[201]; //������ ������ -100 ~ 100�̱� ������ ���� 201(0����)�� �迭 ����

        //2. ���� ��ǥ�� �ش��ϴ� �迭 �ε����� ++ ���ֱ�
        dotCount(lines, arr);

        //3. arr �迭�� �� ���鼭 �� �ε����� ������ 2�� �̻��̸� answer++ ���ֱ�
        return answerCount(answer, arr);
    }

    static void dotCount(int[][] lines, int[] arr) {
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) { // +100�� ���ִ� ����? �迭�� �ε��� ������ ���������� �ȵǱ� ������.
                arr[j]++;
            }
        }
    }

    static int answerCount(int answer, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                answer++;
            }
        }
        return answer;
    }

}
