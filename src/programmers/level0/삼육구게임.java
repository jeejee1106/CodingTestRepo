package programmers.level0;

public class »ïÀ°±¸°ÔÀÓ {
    public static void main(String[] args) {
        int order1 = 3;
        int order2 = 29423;

        System.out.println(»ïÀ°±¸°ÔÀÓ.solution1(order1)); //1
        System.out.println(»ïÀ°±¸°ÔÀÓ.solution1(order2)); //2

        System.out.println(»ïÀ°±¸°ÔÀÓ.solution2(order1)); //1
        System.out.println(»ïÀ°±¸°ÔÀÓ.solution2(order2)); //2

        System.out.println(»ïÀ°±¸°ÔÀÓ.solution3(order1)); //1
        System.out.println(»ïÀ°±¸°ÔÀÓ.solution3(order2)); //2
    }

    /////////////////[solution ½ÃÀÛ]/////////////////
    //Æò±Õ¼Óµµ 0.04ms
    public static int solution1(int order) {
        String strOrder = Integer.toString(order);

        String finalString = strOrder
                .replace("3", "")
                .replace("6", "")
                .replace("9", "");

        return strOrder.length() - finalString.length();
    }

    //Æò±Õ¼Óµµ 0.12ms
    public static int solution2(int order) {
        String strOrder = Integer.toString(order);
        String finalString = strOrder.replaceAll("[3 | 6 | 9]", "");

        return strOrder.length() - finalString.length();
    }

    //Æò±Õ¼Óµµ 0.02ms
    public static int solution3(int order) {
        int answer = 0;

        while(order > 0){
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                answer++;
            }
            order /= 10;
        }

        return answer;
    }
}
