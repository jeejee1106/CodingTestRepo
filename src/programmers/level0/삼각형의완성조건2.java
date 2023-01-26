package programmers.level0;

public class 삼각형의완성조건2 {
    public static void main(String[] args) {
        int[] sides1 = {1, 2};
        int[] sides2 = {3, 6};
        int[] sides3 = {11, 7};

        System.out.println(삼각형의완성조건2.solution1(sides1)); //1
        System.out.println(삼각형의완성조건2.solution1(sides2)); //5
        System.out.println(삼각형의완성조건2.solution1(sides3)); //13
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] sides) {
        int bigNum = Math.max(sides[0], sides[1]);
        int smallNum = Math.min(sides[0], sides[1]);

        //어떤 2변이 주어졌을 때 삼각형이 될 수 있는 경우는
        //항상 큰 변에서 작은 변을 뺀 값에서 1을 더한 값부터, 큰 변과 작은 변을 더한 값에서 1을 뺀 값까지임
        int lowLimit = bigNum - smallNum + 1;
        int highLimit = bigNum + smallNum - 1;

        return highLimit - lowLimit + 1;
    }

}
