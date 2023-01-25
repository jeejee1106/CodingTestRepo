package programmers.level0;

public class 컨트롤제트 {
    public static void main(String[] args) {
        String s1 = "1 2 Z 3";
        String s2 = "10 20 30 40";
        String s3 = "10 Z 20 Z 1";
        String s4 = "10 Z 20 Z";
        String s5 = "-1 -2 -3 Z";

        System.out.println(컨트롤제트.solution1(s1)); //4
        System.out.println(컨트롤제트.solution1(s2)); //100
        System.out.println(컨트롤제트.solution1(s3)); //1
        System.out.println(컨트롤제트.solution1(s4)); //0
        System.out.println(컨트롤제트.solution1(s5)); //-3
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(String s) {
        String[] strArr = s.split(" ");
        int answer = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("Z")) {
                answer += Integer.parseInt(strArr[i]);
            } else {
                answer -= Integer.parseInt(strArr[i - 1]);
            }
        }

        return answer;
    }
}
