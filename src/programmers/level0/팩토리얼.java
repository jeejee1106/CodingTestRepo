package programmers.level0;

public class ���丮�� {
    public static void main(String[] args) {
        int n1 = 3628800, n2 = 7;

        System.out.println(���丮��.solution1(n1)); //10
        System.out.println(���丮��.solution1(n2)); //3

        System.out.println(���丮��.solution2(n1)); //10
        System.out.println(���丮��.solution2(n2)); //3
    }

    /////////////////[solution ����]/////////////////
    public static int solution1(int n) {
        int num = 0;

        while (true) {
            int result = factorial(num);

            if (result < n) {
                num++;
            } else if(result == n){
                return num;
            } else if (result > n) {
                return num - 1;
            }
        }
    }

    public static int factorial (int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return num * factorial ( num - 1 );
    }

    public static int solution2(int n) {
        int factorial = 1;
        int i = 0;

        while(true){
            if (factorial <= n) {
                factorial *= i + 1;
                i++;
            } else {
                break;
            }
        }

        return i - 1;
    }
}
