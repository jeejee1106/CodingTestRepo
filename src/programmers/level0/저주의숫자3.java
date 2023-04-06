package programmers.level0;

public class 저주의숫자3 {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 40;

        System.out.println(저주의숫자3.solution1(n1)); //25
        System.out.println(저주의숫자3.solution1(n2)); //76
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int n) {
        int answer = n;

        //i가 n보다 작거나 같을 때 까지 반복
        for (int i = 1; i <= answer; i++) {
            //만약에 i가 3의 배수거나 i에 3이 포함되어 있으면 answer를 1씩 증가 -> 3x 마을의 룰에 맞추는 과정
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
        }

        return answer;
    }
}
