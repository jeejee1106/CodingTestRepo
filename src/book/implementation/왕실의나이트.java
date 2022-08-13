package book.implementation;

public class �ս��ǳ���Ʈ {

    public static void main(String[] args) {
        char column1 = 'a';
        int row1 = 1;

        char column2 = 'c';
        int row2 = 2;

        char column3 = 'f';
        int row3 = 6;

        char column4 = 'e';
        int row4 = 8;


        System.out.println("solution1 = " + �ս��ǳ���Ʈ.solution1(column1, row1)); // 2
        System.out.println("solution1 = " + �ս��ǳ���Ʈ.solution1(column2, row2)); // 6
        System.out.println("solution1 = " + �ս��ǳ���Ʈ.solution1(column3, row3)); // 8
        System.out.println("solution1 = " + �ս��ǳ���Ʈ.solution1(column4, row4)); // 4

        System.out.println("solution2 = " + �ս��ǳ���Ʈ.solution2(column1, row1)); // 2
        System.out.println("solution2 = " + �ս��ǳ���Ʈ.solution2(column2, row2)); // 6
        System.out.println("solution2 = " + �ս��ǳ���Ʈ.solution2(column3, row3)); // 8
        System.out.println("solution2 = " + �ս��ǳ���Ʈ.solution2(column4, row4)); // 4

    }

    /////////////////[solution ����]/////////////////
    public static int solution1(char column, int row) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���

        int answer = 8;

        int col = column - 'a' + 1; //charŸ���� ����ҹ��ڸ� ���ڷιٲ��ֱ� a:1, b:2, c:3 ......
        int[] x = {-2, -2, 2, 2, -1, 1, -1, 1};
        int[] y = {1, -1, 1, -1, 2, 2, -2, -2};

        //�� ����Ʈ�� (col, row)�� ��ġ�� ���� �� �̵� ������ ����� ����?
        for (int i = 0; i < x.length; i++) {
            int nextCol = col + x[i];
            int nextRow = row + y[i];
            if (nextCol < 1 || nextCol > 8 || nextRow < 1 || nextRow > 8) {
                answer --;
            }
        }

        long finishTime = System.nanoTime();
        System.out.println("seconds : " + (finishTime - startTime) / 1000000000.0 + "��");
        return answer;
    }

    /**
     * å�� Ǯ��
     * ��� x�� y�� �迭�� ����� ���� ��¦ ���� ������
     * �� �� ���� ��ġ�� x, y�� ���� �� ����� ���� ã�� ���� �� ȥ�� Ǯ����.
     * ���� �Ұ��� �� �� ī��Ʈ�� �ϳ��� ���־��µ�, å������ ���� �� �� ī��Ʈ�� �ϳ��� �÷��־���.
     */
    public static int solution2(char column, int row) {
        long startTime = System.nanoTime(); //�ڵ� ���� �ð��� �˾ƺ��� ���� �߰���
        int col = column - 'a' + 1;
        // ����Ʈ�� �̵��� �� �ִ� 8���� ���� ����
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8���� ���⿡ ���Ͽ� �� ��ġ�� �̵��� �������� Ȯ��
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // �̵��ϰ��� �ϴ� ��ġ Ȯ��
            int nextRow = row + dx[i];
            int nextColumn = col + dy[i];
            // �ش� ��ġ�� �̵��� �����ϴٸ� ī��Ʈ ����
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        long finishTime = System.nanoTime();
        System.out.println("seconds : " + (finishTime - startTime) / 1000000000.0 + "��");
        return result;
    }
}