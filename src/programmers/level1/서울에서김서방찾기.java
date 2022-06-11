package programmers.level1;

class 서울에서김서방찾기Solution{
    public static String solution1(String[] seoul) {
        String result = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                result = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return result;
    }

    public static String solution2(String[] seoul) {
        int x = 0; //String타입을 선언하는 것 보다 int타입으로 선언하는 것이 메모리 공간을 덜 차지하니까 더 좋지 않을까?

        //향상된 for문을 써봤는데, 음... 성능면의 차이는 잘 모르겠지만 배열을 돌릴 때 쓰라고 나온거니까 사용해봤다.
        for (String name : seoul) {
            if (name.equals("Kim")) {
                break;
            }
            x++;
        }
        return "김서방은 " + x + "에 있다";
    }
}

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Lee", "Park", "Kim"};
        String[] seoul2 = {"Kim", "Lee", "Park", "Kim"};
        System.out.println(서울에서김서방찾기Solution.solution1(seoul));
        System.out.println(서울에서김서방찾기Solution.solution2(seoul));
    }
}