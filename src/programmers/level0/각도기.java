package programmers.level0;

public class 각도기 {
    public static void main(String[] args) {
        int angle1 = 70;
        int angle2 = 91;
        int angle3 = 180;

        System.out.println(각도기.solution1(angle1)); //1
        System.out.println(각도기.solution1(angle2)); //3
        System.out.println(각도기.solution1(angle3)); //4
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int angle) {
        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }
}
