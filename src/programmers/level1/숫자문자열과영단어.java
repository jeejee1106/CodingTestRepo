package programmers.level1;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        String s1 = "one4seveneight";
        String s2 = "23four5six7";
        String s3 = "2three45sixseven";
        String s4 = "123";

        System.out.println(숫자문자열과영단어.solution1(s1)); //1478
        System.out.println(숫자문자열과영단어.solution1(s2)); //234567
        System.out.println(숫자문자열과영단어.solution1(s3)); //234567
        System.out.println(숫자문자열과영단어.solution1(s4)); //123
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < num.length; i++){
            //문자열 s에 num[i]가 포함되어 있으면 replace해주기
            s = s.replace(num[i], Integer.toString(i)); //1. int타입을 String타입으로 바꿔줄 땐 Integer.toString()
            //2. "" + i 를 해도 String타입의 숫자가 된다.
        }

        return Integer.parseInt(s); //String타입을 int타입으로 바꿔줄 땐 Integer.parseInt();
    }
}