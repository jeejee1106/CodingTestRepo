package programmers.level0;

public class �����ڸ��� {
    public static void main(String[] args) {
        int M1 = 2;
        int M2 = 2;
        int M3 = 1;

        int N1 = 2;
        int N2 = 5;
        int N3 = 1;
        System.out.println(�����ڸ���.solution1(M1, N1)); //3
        System.out.println(�����ڸ���.solution1(M2, N2)); //9
        System.out.println(�����ڸ���.solution1(M3, N3)); //0
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int M, int N) {
        int answer = (M * N) - 1;
        return answer;
    }
}
