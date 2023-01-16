package programmers.level0;

public class k의개수 {
    public static void main(String[] args) {
        int i1 = 1, j1 = 13, k1 = 1;

        int i2 = 10, j2 = 50, k2 = 5;

        int i3 = 3, j3 = 10, k3 = 2;

        System.out.println(k의개수.solution1(i1, j1, k1)); //6
        System.out.println(k의개수.solution1(i2, j2, k2)); //5
        System.out.println(k의개수.solution1(i3, j3, k3)); //0

        System.out.println(k의개수.solution2(i1, j1, k1)); //6
        System.out.println(k의개수.solution2(i2, j2, k2)); //5
        System.out.println(k의개수.solution2(i3, j3, k3)); //0

        System.out.println(k의개수.solution3(i1, j1, k1)); //6
        System.out.println(k의개수.solution3(i2, j2, k2)); //5
        System.out.println(k의개수.solution3(i3, j3, k3)); //0
    }

    /////////////////[solution 시작]/////////////////
    //이런 문제엔선 절대 쓰지 말아야할 문자열 더하기....ㅜㅜ 5000ms까지 나옴...
    public static int solution1(int i, int j, int k) {
        String strNum = "";
        String strK = "" + k;

        for (int n = i; n <= j; n++) {
            strNum += "" + n;
        }

        int numStrLength = strNum.length();
        int replaceLength = strNum.replace(strK, "").length();

        return numStrLength - replaceLength;
    }

    public static int solution2(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        String strK = "" + k;

        for (int n = i; n <= j; n++) {
            sb.append(n);
        }

        int numStrLength = sb.length();
        int replaceLength = sb.toString().replace(strK, "").length();

        return numStrLength - replaceLength;
    }


    //흐미 비교가 안되게 빠르당...
    public static int solution3(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k){
                    answer++;
                }
                tmp /= 10;
            }
        }
        return answer;
    }
}
