package programmers.level0;

public class 치킨쿠폰 {
    public static void main(String[] args) {
        int chicken1 = 100;
        int chicken2 = 1081;
        int chicken3 = 0;
        int chicken4 = 1;
        int chicken5 = 500;
        int chicken6 = 999999;
        int chicken7 = 1999;

        System.out.println(치킨쿠폰.solution1(chicken1)); //11
        System.out.println(치킨쿠폰.solution1(chicken2)); //120
        System.out.println(치킨쿠폰.solution1(chicken3)); //0
        System.out.println(치킨쿠폰.solution1(chicken4)); //0
        System.out.println(치킨쿠폰.solution1(chicken5)); //55
        System.out.println(치킨쿠폰.solution1(chicken6)); //111110
        System.out.println(치킨쿠폰.solution1(chicken7)); //222
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int chicken) {
        int answer = 0;
        int couponCount = chicken;

        while(true) {
            couponCount = chicken / 10; //서비스로 받을 수 있는 치킨 수
            answer += couponCount;
            chicken = chicken % 10 + couponCount; //치킨을 시켜먹고 난 후의 보유 쿠폰 수
            if(chicken < 10) {
                break;
            }
        }
        return answer;
    }
}
