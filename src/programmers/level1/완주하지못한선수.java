package programmers.level1;

import java.util.HashMap;

public class �����������Ѽ��� {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};


        System.out.println(�����������Ѽ���.solution1(participant1, completion1)); //leo
        System.out.println(�����������Ѽ���.solution1(participant2, completion2)); //vinko
        System.out.println(�����������Ѽ���.solution1(participant3, completion3)); //mislav
    }

    /////////////////[solution ����]/////////////////
    public static String solution1(String[] participant, String[] completion) {
        String answer = "";
        //1. HashMap�� �������� �̸��� key��, �� ���� value�� ��´�.
        HashMap<String, Integer> map = new HashMap<>();
        for (String part : participant) {
//            map.put(part, map.get(part) + 1);
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
        //2. map���� �������� �̸��� �־� ���ָ� ������ value�� -1���ش�.
        for (String comp : completion) {
            map.put(comp, map.get(comp) - 1);
        }
        //3. �������� �̸����� value���� Ȯ�� ���� �� value�� 0�� �ƴ�(Ȥ�� 1��) �����ڰ� ���ָ� ���� ������.
        for (String part : participant) {
            if (map.get(part) != 0) {
                answer = part;
            }
        }
        return answer;
    }
}