package programmers.level1;

public class 음양더하기 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false,false,true};

        System.out.println(음양더하기.solution1(absolutes, signs)); //9
        System.out.println(음양더하기.solution1(absolutes2, signs2)); //0

        //다시 초기화 (흠.. 테스트 코드로 짜는 게 더 편할지도...?)
        int[] absolutes3 = {4,7,12};
        boolean[] signs3 = {true,false,true};

        int[] absolutes4 = {1,2,3};
        boolean[] signs4 = {false,false,true};
        System.out.println(음양더하기.solution2(absolutes3, signs3)); //9
        System.out.println(음양더하기.solution2(absolutes4, signs4)); //0
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < signs.length; i++){
            if(!signs[i]){ //signs[i]가 false이면 absolutes[i]의 값이 음수이기 때문에
                absolutes[i] *= (-1); //-1 곱해줘서 실제 음수값으로 만들기
            }
            answer += absolutes[i]; //모든 absolutes[i]의 값 더하기
        }

        return answer;
    }

    public static int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;

        //삼항연산자를 이용한 풀이
        for(int i = 0; i < signs.length; i++){
            // signs[i]가 true야? absolutes[i]그대로! true아니야? absolutes[i]에 -1 곱해주기
            // 곧 바로 answer에 더해주기!
            answer += signs[i] ? absolutes[i] : absolutes[i] * (-1);
//            answer += absolutes[i] * (signs[i]? 1: -1); // 삼항연산자를 이렇게 쓰는 방법도..! 역시 사고력의 차이일까... 노력해야겠다.
        }

        return answer;
    }
}