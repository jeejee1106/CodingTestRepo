package book.implementation;

public class 시각 {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 13;

        System.out.println("solution1 = " + 시각.solution1(n1)); // 11475
        System.out.println("solution1 = " + 시각.solution1(n2)); // 26100
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) {
        long startTime = System.nanoTime(); //코드 실행 시간을 알아보기 위해 추가함

        int answer = 0;
        String time = "";

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    time = "" + i + j + k ; //숫자를 문자열로 바꿔주는 작업
                    if (time.contains("3")) { //문자열에 3이 포함되어 있는지 확인
                        answer++; //포함되었을 때 카운트 세주기
                    }
                }
            }
        }

        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;
        double seconds = elapsedTime / 1000000000.0;
        System.out.println("seconds : " + seconds + "초");
        return answer;
    }
}