package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 신고결과받기 {
    /**
     * 으어ㅓ어ㅓ어어 거의 다 했는데 여러번 신고해도 한 번만 들어간다는 걸 간과함
     * 그것만 고치면 될 듯!!!!!
     * @param args
     */
    public static void main(String[] args) {
        String[] idList1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k1 = 2;

        String[] idList2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;

        System.out.println(신고결과받기.solution1(idList1, report1, k1)); //[2,1,1,0]
        System.out.println(신고결과받기.solution1(idList2, report2, k2)); //[0,0]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(String[] idList, String[] report, int k) {
        //한 번에 한명, 여러번 신고해도 카운트는 한 번만
        //k번 이상 신고 당하면 신고한 사람들에게 메일 발송
        //각 유저별로 메일을 받은 횟수를 리턴해라

        //map에 신고받은 id(key)들과 횟수(value)를 넣는다.
        HashMap<String, Integer> reportMap = new HashMap<>();
        for (int i = 0; i < idList.length; i++) {
            reportMap.put(idList[i], 0);
        }
        for (String s : report) { // report배열의 원소를 하나씩 s에 넣는다.
            String[] reports = s.split(" "); //공백을 기준으로 문자열을 분리하여 배열에 다시 넣는다.
            String badId = reports[1]; //인덱스가 1인(즉, 신고당한 id) 데이터를 가져온다.
            reportMap.put(badId, reportMap.get(badId) + 1); //신고당한 id를 map에 넣어준다.
        }

        //list에 k번 이상 신고 당한 아이디를 넣는다.
        ArrayList<String> badIdList = new ArrayList<>();
        for (int i = 0; i < idList.length; i++) {
            if (reportMap.get(idList[i]) >= k) { //만약 신고당한 횟수가 k번 이상이면
                badIdList.add(idList[i]); //list에 해당 아이디 추가
            }
        }

        int[] answer = new int[idList.length];
        for (String s : report) {
            String[] reports = s.split(" ");
            String id = reports[0];
            String badId = reports[1];
            for (int i = 0; i < badIdList.size(); i++) {
                if (badId.equals(badIdList.get(i))) {
                    int x = Arrays.asList(idList).indexOf(id);
                    answer[x]++;
                }
            }
        }

        return answer;
    }
}