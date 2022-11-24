package programmers.level0;

public class 다음에올숫자 {
    public static void main(String[] args) {
        int[] common1 = {1, 2, 3, 4}; //등차
        int[] common2 = {2, 4, 8}; //등비
        int[] common3 = {70, 140, 210, 280, 350, 420}; //등차
        int[] common4 = {1, 2, 4, 8}; //등비
        int[] common5 = {3, 9, 27, 71}; //등비

        System.out.println(다음에올숫자.solution1(common1)); //5
        System.out.println(다음에올숫자.solution1(common2)); //16
        System.out.println(다음에올숫자.solution1(common3)); //490
        System.out.println(다음에올숫자.solution1(common4)); //8 --> 틀린답. 16이 나와야한다.
        System.out.println(다음에올숫자.solution1(common5)); //213

        System.out.println();

        System.out.println(다음에올숫자.solution2(common1)); //5
        System.out.println(다음에올숫자.solution2(common2)); //16
        System.out.println(다음에올숫자.solution2(common3)); //490
        System.out.println(다음에올숫자.solution2(common4)); //16
        System.out.println(다음에올숫자.solution2(common5)); //213
    }

    /////////////////[solution 시작]/////////////////

    /**
     * 틀린 답이다.
     * 반례를 위해서 남겨둔다.
     * 등비수열일 때
     * answer = common[common.length - 1] * (common[0]);
     * 라고 코드를 적었는데, 다른 등비수열은 다 통과되지만 딱 하나 통과가 안되는 등비수열이 있다.
     * 바로 1, 2, 4, 8 ... 로 시작하는 등비수열이다.
     * 그렇기 때문에 무조건 첫번째 원소를 곱해주는 것이 아닌 solution2처럼 등비를 구해서(?) 곱해줘야 맞는 답이 나온다.
     */
    public static int solution1(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[0]);
        }
        return answer;
    }

    public static int solution2(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) { //원소2번과 원소1번의 차와 원소3번 원소2번의 차가 같으면 등차수열이다.
            answer = common[common.length - 1] + (common[1] - common[0]); //배열의 제일 마지막 값에 원소의 차를 더해주면 다음에 올 수가 된다.
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }
}
