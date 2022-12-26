package programmers.level0;

public class 다항식더하기 {
    public static void main(String[] args) {
        String polynomial1 = "3x + 7 + x";
        String polynomial2 = "x + x + x";
        String polynomial3 = "5x + 10x + x + 23 + 11 + 9x";
        String polynomial4 = "5x + 10x + x";
        String polynomial5 = "23 + 11 + 9";
        String polynomial6 = "0 + 0 + 0 + x";
        String polynomial7 = "0 + 0 + 0";
        String polynomial8 = "x + x + x + x";
        String polynomial9 = "x";
        String polynomial10 = "x + 3";

        System.out.println(다항식더하기.solution1(polynomial1)); //4x + 7
        System.out.println(다항식더하기.solution1(polynomial2)); //3x
        System.out.println(다항식더하기.solution1(polynomial3)); //25x + 34
        System.out.println(다항식더하기.solution1(polynomial4)); //16x
        System.out.println(다항식더하기.solution1(polynomial5)); //43
        System.out.println(다항식더하기.solution1(polynomial6)); //x
        System.out.println(다항식더하기.solution1(polynomial7)); //0
        System.out.println(다항식더하기.solution1(polynomial8)); //4x
        System.out.println(다항식더하기.solution1(polynomial9)); //x
        System.out.println(다항식더하기.solution1(polynomial10)); //x + 3
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String polynomial) {
        int constantCount = 0;
        int xCount = 0;
        String[] splitArr = polynomial.split(" \\+ ");

        for (String str : splitArr) {
            if (str.contains("x")) {
                xCount += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", ""));
            }else {
                constantCount += Integer.parseInt(str);
            }
        }

        if (constantCount == 0 && xCount == 0) {
            return "0";
        } else if (constantCount == 0 && xCount != 0) {
            return xCount == 1 ? "x" : xCount + "x";
        } else if (constantCount != 0 && xCount == 0) {
            return Integer.toString(constantCount);
        } else {
            return xCount == 1 ? "x + " + constantCount : xCount + "x + " + constantCount;
        }
    }
}
