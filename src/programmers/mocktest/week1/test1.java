package programmers.mocktest.week1;

/**
 *  효율성에서 탈락....
 *  73.7점
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println(solution1("100", "2345")); //-1
        System.out.println(solution1("100", "203045")); //0
        System.out.println(solution1("100", "123450")); //10
        System.out.println(solution1("12321", "42531")); //321
        System.out.println(solution1("5525", "1255")); //552

    }

    public static String solution1(String X, String Y) {
        String answer = "";

        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for (int i = 0; i < X.length(); i++) {
            char c = X.charAt(i);
            arrX[c - 48]++; //숫자 카운트
        }

        for (int i = 0; i < Y.length(); i++) {
            char c = Y.charAt(i);
            arrY[c - 48]++; //숫자 카운트
        }

        for (int i = 9; i >= 0; i--) {
            if (answer == "" && i == 0 && arrX[i] != 0 && arrY[i] != 0) {
                answer = "0";
            } else if (arrX[i] != 0 && arrY[i] != 0) {
                answer += i;
                arrX[i] -= 1;
                arrY[i] -= 1;
                i++;
            }
        }

        if (answer == "") {
            answer = "-1";
        }

        return answer;
    }

}