package programmers.level0;

public class 옷가게할인받기 {
    public static void main(String[] args) {
        int price1 = 150000;
        int price2 = 580000;
        int price3 = 1510;
        int price4 = 10;
        int price5 = 154030; //얘가...!
        int price6 = 11110;
        int price7 = 210040;

        System.out.println(옷가게할인받기.solution1(price1)); //142500
        System.out.println(옷가게할인받기.solution1(price2)); //464000
        System.out.println(옷가게할인받기.solution1(price3)); //1510
        System.out.println(옷가게할인받기.solution1(price4)); //10
        System.out.println(옷가게할인받기.solution1(price5)); //146329 -> 틀림
        System.out.println(옷가게할인받기.solution1(price6)); //11110
        System.out.println(옷가게할인받기.solution1(price7)); //199538

        System.out.println();

        System.out.println(옷가게할인받기.solution3(price1)); //142500
        System.out.println(옷가게할인받기.solution3(price2)); //464000
        System.out.println(옷가게할인받기.solution3(price3)); //1510
        System.out.println(옷가게할인받기.solution3(price4)); //10
        System.out.println(옷가게할인받기.solution3(price5)); //146328 -> 맞음
        System.out.println(옷가게할인받기.solution3(price6)); //11110
        System.out.println(옷가게할인받기.solution3(price7)); //199538

    }

    /////////////////[solution 시작]/////////////////
    // 틀린 코드임!!!!!! price5 확인!
    public static int solution1(int price) {
        if (price >= 500000) {
            return price - (int) (price * 0.2);
        } else if (price >= 300000) {
            return price - (int) (price * 0.1);
        } else if (price >= 100000) {
            return price - (int) (price * 0.05);
        }
        return price;
        //훔 헷갈리네... 계산기로 해봐도 확실히 결과가 다르긴 함...흠.... 그래도 헷갈리네..
    }

    public static int solution3(int price) {
        if(price >= 500000) {
            price *= 0.8;
        } else if(price >= 300000) {
            price *= 0.9;
        } else if(price >= 100000) {
            price *= 0.95;
        }

        //더 깔끔한 코드!
//        if(price>=500000) return (int)(price*0.8);
//        if(price>=300000) return (int)(price*0.9);
//        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}
