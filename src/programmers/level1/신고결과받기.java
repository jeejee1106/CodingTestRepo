package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] idList1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k1 = 2;

        String[] idList2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;

//        System.out.println(신고결과받기.solution1(idList1, report1, k1)); //[2,1,1,0]
//        System.out.println(신고결과받기.solution1(idList2, report2, k2)); //[0,0]

        System.out.println(신고결과받기.solution2(idList1, report1, k1)); //[2,1,1,0]
        System.out.println(신고결과받기.solution2(idList2, report2, k2)); //[0,0]
    }

    /////////////////[solution 시작]/////////////////
    public static int[] solution1(String[] idList, String[] report, int k) {
        //한 번에 한명, 여러번 신고해도 카운트는 한 번만
        //k번 이상 신고 당하면 신고한 사람들에게 메일 발송
        //각 유저별로 메일을 받은 횟수를 리턴해라

        //1. 신고 중복 제거
        HashSet<String> set = new HashSet<>();
        for (String s : report) {
            set.add(s);
        }

        //2. 일단 map에 유저들의 아이디와 신고받은횟수를 0으로 초기화해서 넣어준다.
        HashMap<String, Integer> reportMap = new HashMap<>();
        for (int i = 0; i < idList.length; i++) {
            reportMap.put(idList[i], 0);
        }

        //3. map에 신고받은 id(key)들과 횟수(value)를 넣는다.
        for (String s : set) { // report배열의 원소를 하나씩 s에 넣는다.
            String[] reportSplit = s.split(" "); //공백을 기준으로 문자열을 분리하여 배열에 다시 넣는다.
            String badId = reportSplit[1]; //인덱스가 1인(즉, 신고당한 id) 데이터를 가져온다.
            reportMap.put(badId, reportMap.get(badId) + 1); //신고당한 id를 map에 넣어준다.
        }

        //4. list에 k번 이상 신고 당한 아이디를 넣는다.
        ArrayList<String> badIdList = new ArrayList<>();
        for (int i = 0; i < idList.length; i++) {
            if (reportMap.get(idList[i]) >= k) { //만약 신고당한 횟수가 k번 이상이면
                badIdList.add(idList[i]); //list에 해당 아이디 추가
            }
        }

        //5. 정답을 넣을 배열 선언
        int[] answer = new int[idList.length];

        //6. k번 이상 신고당한 유저를 신고한 유저에 대한 카운트++
        for (String s : set) {
            String[] reportSplit = s.split(" ");
            String id = reportSplit[0]; //신고한 유저 id
            String badId = reportSplit[1]; //신고당한 유저 id
            for (int i = 0; i < badIdList.size(); i++) {
                if (badId.equals(badIdList.get(i))) {
                    int x = Arrays.asList(idList).indexOf(id);
                    answer[x]++;
                }
            }
        }

        return answer;
    }

    public static int[] solution2(String[] idList, String[] report, int k) {

        //1. 신고 중복 제거
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report)); //일반 배열을 ArrayList로 변환 후 set에 넣어주기

        //2. map에 신고당한 유저의 id와 횟수를 넣는다.
        HashMap<String, Integer> badUserMap = new HashMap<>();
        for (String reportStr : reportSet) {
            String badId = reportStr.split(" ")[1]; //신고당한 유저 id
            badUserMap.put(badId, badUserMap.getOrDefault(badId, 0) + 1);
        }

        //3. list에 k번 이상 신고 당한 아이디를 넣는다.
        ArrayList<String> badIdList = new ArrayList<>();
        for (String badId : badUserMap.keySet()) {
            if (badUserMap.get(badId) >= k) { //만약 신고당한 횟수가 k번 이상이면
                badIdList.add(badId); //list에 해당 아이디 추가
            }
        }

        //4. 정답을 넣을 배열 선언
        int[] answer = new int[idList.length];

        //5.
        for (String reportStr : reportSet) {
            String[] reportSplit = reportStr.split(" ");
            String id = reportSplit[0]; //신고한 유저 id
            String badId = reportSplit[1]; //신고당한 유저 id
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