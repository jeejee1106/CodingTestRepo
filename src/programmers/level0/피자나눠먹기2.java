package programmers.level0;

public class ÇÇÀÚ³ª´²¸Ô±â2 {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 10;
        int n3 = 4;
        int n4 = 99;
        int n5 = 100;

        System.out.println(ÇÇÀÚ³ª´²¸Ô±â2.solution1(n1)); //1
        System.out.println(ÇÇÀÚ³ª´²¸Ô±â2.solution1(n2)); //5
        System.out.println(ÇÇÀÚ³ª´²¸Ô±â2.solution1(n3)); //2
        System.out.println(ÇÇÀÚ³ª´²¸Ô±â2.solution1(n4)); //33
        System.out.println(ÇÇÀÚ³ª´²¸Ô±â2.solution1(n5)); //50
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    public static int solution1(int n) {
        int answer = 0;

        for (int i = 1; i <= 100; i++) {
            if ((i * 6) % n == 0) {
                return i;
            }
        }

        return answer;
    }
}
