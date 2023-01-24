package programmers.level0;

public class 구슬을나누는경우의수 {
    public static void main(String[] args) {
        int balls1 = 3;
        int share1 = 2;

        int balls2 = 5;
        int share2 = 3;

        int balls3 = 30;
        int share3 = 15;

        System.out.println(구슬을나누는경우의수.solution1(balls1, share1)); //3
        System.out.println(구슬을나누는경우의수.solution1(balls2, share2)); //10
        System.out.println(구슬을나누는경우의수.solution1(balls3, share3)); //-4 (return타입이 int형이라서)

        System.out.println(구슬을나누는경우의수.solution2(balls1, share1)); //3
        System.out.println(구슬을나누는경우의수.solution2(balls2, share2)); //10
        System.out.println(구슬을나누는경우의수.solution2(balls3, share3)); //155117520 (return타입이 int형이라서)
    }

    /////////////////[solution 시작]/////////////////
    //int형까지는 답이 잘 나오지만 세 번째 예시와 같이 int형을 넘어가는 숫자에서는 틀린 답이 나오게 된다.
    //팩토리얼을 구현을 잘 했지만 딱 int형까지만... 그러므로 틀린 답.
    public static int solution1(int balls, int share) {
        return factorial(balls) / (factorial(balls - share) * factorial(share));
    }

    public static int factorial(int n) {
        return n <= 1 ? n : factorial(n - 1) * n;
    }

    /////////////////[solution2 시작]/////////////////와 어렵당....
    //순열, 조합 참고 블로그 : 친절할 데이터 사이언티스트 되기 강좌 - https://recipesds.tistory.com/entry/%EC%B4%88%EA%B0%84%EB%8B%A8-Permuation%EC%88%9C%EC%97%B4%EA%B3%BC-Combination%EC%A1%B0%ED%95%A9
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
