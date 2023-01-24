package programmers.level0;

public class �����������°���Ǽ� {
    public static void main(String[] args) {
        int balls1 = 3;
        int share1 = 2;

        int balls2 = 5;
        int share2 = 3;

        int balls3 = 30;
        int share3 = 15;

        System.out.println(�����������°���Ǽ�.solution1(balls1, share1)); //3
        System.out.println(�����������°���Ǽ�.solution1(balls2, share2)); //10
        System.out.println(�����������°���Ǽ�.solution1(balls3, share3)); //-4 (returnŸ���� int���̶�)

        System.out.println(�����������°���Ǽ�.solution2(balls1, share1)); //3
        System.out.println(�����������°���Ǽ�.solution2(balls2, share2)); //10
        System.out.println(�����������°���Ǽ�.solution2(balls3, share3)); //155117520 (returnŸ���� int���̶�)
    }

    /////////////////[solution ����]/////////////////
    //int�������� ���� �� �������� �� ��° ���ÿ� ���� int���� �Ѿ�� ���ڿ����� Ʋ�� ���� ������ �ȴ�.
    //���丮���� ������ �� ������ �� int��������... �׷��Ƿ� Ʋ�� ��.
    public static int solution1(int balls, int share) {
        return factorial(balls) / (factorial(balls - share) * factorial(share));
    }

    public static int factorial(int n) {
        return n <= 1 ? n : factorial(n - 1) * n;
    }

    /////////////////[solution2 ����]/////////////////�� ��ƴ�....
    //����, ���� ���� ��α� : ģ���� ������ ���̾�Ƽ��Ʈ �Ǳ� ���� - https://recipesds.tistory.com/entry/%EC%B4%88%EA%B0%84%EB%8B%A8-Permuation%EC%88%9C%EC%97%B4%EA%B3%BC-Combination%EC%A1%B0%ED%95%A9
    public static int solution2(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return combination(n-1, r-1) + combination(n-1, r);
        }
    }
}
