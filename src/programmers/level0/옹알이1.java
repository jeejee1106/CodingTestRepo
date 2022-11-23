package programmers.level0;

public class 옹알이1 {
    public static void main(String[] args) {
        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(옹알이1.solution1(babbling1)); //1
        System.out.println(옹알이1.solution1(babbling2)); //3
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(String[] babbling) {
        int answer = 0;
        String[] orgArr = {"aya", "ye", "woo", "ma"}; //조카가 말할 수 있는 단어

        for (String paramBab : babbling) {
            for (String orgStr : orgArr) {
                //babbling의 각 원소에 조카가 말할 수 있는 단어가 포함되었으면 그 단어를 Y로 리플레이스
                paramBab = paramBab.replace(orgStr, "Y");
            }
            //각 단어는 최대 한 번씩 이어붙여 말할 수 있으므로 최대 네 단어를 이어붙여 말할 수 있다.
            //그렇기 때문에 리플레이스한 paramBab이 Y, YY, YYY, YYYY 라면 answer에 1을 더해준다.
            if (paramBab.equals("Y") || paramBab.equals("YY") || paramBab.equals("YYY") || paramBab.equals("YYYY")) {
                answer++;
            }
        }
        return answer;
    }

    public static int solution2(String[] babbling) {
        int answer = 0;
        String[] orgArr = {"aya", "ye", "woo", "ma"}; //조카가 말할 수 있는 단어

        for (String paramBab : babbling) {
            for (String orgStr : orgArr) {
                //babbling의 각 원소에 조카가 말할 수 있는 단어가 포함되었으면 그 단어를 Y로 리플레이스
                paramBab = paramBab.replace(orgStr, "Y");
            }
            //Y를 공백으로 리플레이스. (위 해답에서의 Y, YY, YYY, YYYY를 검사하는 번거로움을 없애기 위해)
            paramBab = paramBab.replace("Y", "");
            //paramBab이 공백이라면(paramBab이 모두 Y라면) answer에 1을 더해준다.
            if (paramBab.equals("")) {
                answer++;
            }
        }
        return answer;

        /**
         * 이 풀이에서 조심해야할 점
         * for문이 돌 때 왜 한번에 공백으로 replace하지 않고 Y로 변환 후 for문이 끝나고 다시 그 Y를 공백으로 replace했느냐면!!
         * for문에서 공백으로 replace를 하면 "wyeoo" 와 같은 문자열이 들어왔을 때 "ye"가 먼저 공백으로 replace되면 "woo"가 된다.
         * 그리고 다시 "woo"는 for문을 돌면서 공백으로 replace된다. 그럼 최종적으로 "wyeoo"는 공백이 되어 answer++이 실행된다.
         * 하지만 "wyeoo"는 실제로 조카가 발음할 수 없는 단어이다.
         * 그렇기 때문에 for문에서는 Y로 replace를 하고, 조카가 발음할 수 있는 단어들끼리 조합된 paramBab을 찾아 공백으로 replace 해준것이다!
         */
    }
}
