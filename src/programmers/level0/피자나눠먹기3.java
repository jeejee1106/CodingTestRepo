package programmers.level0;

public class ÇÇÀÚ³ª´²¸Ô±â3 {
    public static void main(String[] args) {
        int slice1 = 7;
        int n1 = 10;

        int slice2 = 4;
        int n2 = 12;

        System.out.println(ÇÇÀÚ³ª´²¸Ô±â3.solution1(slice1, n1)); //2
        System.out.println(ÇÇÀÚ³ª´²¸Ô±â3.solution1(slice2, n2)); //3
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    public static int solution1(int slice, int n) {
        int quotient = n / slice;

        return n % slice == 0 ? quotient : quotient + 1;
    }
}
