package programmers.level1;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};


        System.out.println(완주하지못한선수.solution1(participant1, completion1)); //leo
        System.out.println(완주하지못한선수.solution1(participant2, completion2)); //vinko
        System.out.println(완주하지못한선수.solution1(participant3, completion3)); //mislav
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String[] participant, String[] completion) {
        String answer = "";
        //1. HashMap에 참가자의 이름을 key로, 명 수를 value로 담는다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String part : participant) {
//            map.put(part, map.get(part) + 1);
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
        //2. map에서 완주자의 이름을 넣어 완주를 했으면 value를 -1해준다.
        for (String comp : completion) {
            map.put(comp, map.get(comp) - 1);
        }
        //3. 참가자의 이름으로 value값을 확인 했을 때 value값 0이 아닌(혹인 1인) 참가자가 완주를 못한 선수다.
        for (String part : participant) {
            if (map.get(part) != 0) {
                answer = part;
            }
        }
        return answer;
    }
}