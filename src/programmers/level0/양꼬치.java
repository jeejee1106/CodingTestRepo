package programmers.level0;

public class �粿ġ {
    public static void main(String[] args) {
        int n1 = 10, k1 = 3;
        int n2 = 64, k2 = 6;

        System.out.println(�粿ġ.solution1(n1, k1)); //124000
        System.out.println(�粿ġ.solution1(n2, k2)); //768000
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int n, int k) {
        k -= n / 10;
        int answer = n * 12000 + k * 2000;

        return answer;
    }
}
