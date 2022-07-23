package baekjoon.greedy.bronze;

public class ZOAC2 {
    public static void main(String[] args) {
        System.out.println(solution1("ZOAC")); //26
        System.out.println(solution1("LBOLVUEEPMOIENMG")); //100
    }

   public static int solution1(String str) {
        int answer = 0;

        //1. 첫 시작은 무조건 A
        char ch = 'A';

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i); //2. 빈 변수에는 입력받은 문자열의 첫 글자부터 담아본다.
            int rightTime = Math.abs(ch - tmp); //3. 오른쪽으로 돌렸을 때 두 문자의 거리(즉, 시간)
            int leftTime = 26 - rightTime; //4. 알파벳의 갯수 26에서 rightTime을 빼주면 왼쪽으로 돌린 시간이 나온다
            answer += Math.min(rightTime, leftTime); //5. answer 변수에 두 값 중 더 작은 수(즉, 시간)를 계속 더해준다.
            ch = tmp; //6. ch변수에 tmp를 넣어주면 계속해서 현재 문자와 다음문자의 거리 비교가 가능하다.
        }
    return answer;
    }
}