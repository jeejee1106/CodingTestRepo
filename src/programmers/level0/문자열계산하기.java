package programmers.level0;

public class 문자열계산하기 {
    public static void main(String[] args) {
        String my_string0 = "3 + 4 - 8";
        String my_string1 = "3 + 4";
        String my_string2 = "123 + 41 - 1 - 1 - 84 + 1 + 3452 + 10231 - 2400";
        String my_string3 = "123 + 41 - 1 - 1 - 84";

        System.out.println(문자열계산하기.solution1(my_string0)); //-1
        System.out.println(문자열계산하기.solution1(my_string1)); //7
        System.out.println(문자열계산하기.solution1(my_string2)); //11362
        System.out.println(문자열계산하기.solution1(my_string3)); //78
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(String my_string) {
        String[] myArr = my_string.split(" ");
        int answer = Integer.parseInt(myArr[0]);

        for (int i = 1; i < myArr.length; i += 2) {
            int iNum = Integer.parseInt(myArr[i + 1]);

            answer = myArr[i].equals("+") ? answer + iNum : answer - iNum;
        }

        return answer;
    }
}
