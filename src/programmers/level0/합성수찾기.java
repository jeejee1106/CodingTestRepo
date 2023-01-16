package programmers.level0;

public class 합성수찾기 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        System.out.println(합성수찾기.solution1(num1)); //5
        System.out.println(합성수찾기.solution1(num2)); //8
    }

    /////////////////[solution 시작]/////////////////
    //평균속도 0.05ms
    public static int solution1(int n) {
        int answer = 0;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }

        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= i / 2; j++) { //어차피 약수는 구하려는 수의 절반(?) 이상을 넘어갈 수 없으므로 i/2만큼만 돌린다.
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }

        return answer;
    }
}
