package programmers.level0;

public class �ʰ������ιޱ� {
    public static void main(String[] args) {
        int price1 = 150000;
        int price2 = 580000;
        int price3 = 1510;
        int price4 = 10;
        int price5 = 154030; //�갡...!
        int price6 = 11110;
        int price7 = 210040;

        System.out.println(�ʰ������ιޱ�.solution1(price1)); //142500
        System.out.println(�ʰ������ιޱ�.solution1(price2)); //464000
        System.out.println(�ʰ������ιޱ�.solution1(price3)); //1510
        System.out.println(�ʰ������ιޱ�.solution1(price4)); //10
        System.out.println(�ʰ������ιޱ�.solution1(price5)); //146329 -> Ʋ��
        System.out.println(�ʰ������ιޱ�.solution1(price6)); //11110
        System.out.println(�ʰ������ιޱ�.solution1(price7)); //199538

        System.out.println();

        System.out.println(�ʰ������ιޱ�.solution3(price1)); //142500
        System.out.println(�ʰ������ιޱ�.solution3(price2)); //464000
        System.out.println(�ʰ������ιޱ�.solution3(price3)); //1510
        System.out.println(�ʰ������ιޱ�.solution3(price4)); //10
        System.out.println(�ʰ������ιޱ�.solution3(price5)); //146328 -> ����
        System.out.println(�ʰ������ιޱ�.solution3(price6)); //11110
        System.out.println(�ʰ������ιޱ�.solution3(price7)); //199538

    }

    /////////////////[solution ����]/////////////////
    // Ʋ�� �ڵ���!!!!!! price5 Ȯ��!
    public static int solution1(int price) {
        if (price >= 500000) {
            return price - (int) (price * 0.2);
        } else if (price >= 300000) {
            return price - (int) (price * 0.1);
        } else if (price >= 100000) {
            return price - (int) (price * 0.05);
        }
        return price;
        //�� �򰥸���... ����� �غ��� Ȯ���� ����� �ٸ��� ��...��.... �׷��� �򰥸���..
    }

    public static int solution3(int price) {
        if(price >= 500000) {
            price *= 0.8;
        } else if(price >= 300000) {
            price *= 0.9;
        } else if(price >= 100000) {
            price *= 0.95;
        }

        //�� ����� �ڵ�!
//        if(price>=500000) return (int)(price*0.8);
//        if(price>=300000) return (int)(price*0.9);
//        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}
