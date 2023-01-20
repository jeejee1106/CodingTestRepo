package programmers.level0;

public class Ä¥ÀÇ°³¼ö {
    public static void main(String[] args) {
        int[] array1 = {7, 77, 17};
        int[] array2 = {10, 29, 175};
        int[] array3 = {8, 7777, 7145, 27854, 3571};

        System.out.println(Ä¥ÀÇ°³¼ö.solution1(array1)); //4
        System.out.println(Ä¥ÀÇ°³¼ö.solution1(array2)); //1
        System.out.println(Ä¥ÀÇ°³¼ö.solution1(array3)); //1
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    public static int solution1(int[] array) {
        int answer = 0;

        for (int i : array) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 7) {
                    answer++;
                }
                num /= 10;
            }
        }

        return answer;
    }
}
