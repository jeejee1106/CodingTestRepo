package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class �Ű����ޱ� {
    /**
     * ����þ�þ�� ���� �� �ߴµ� ������ �Ű��ص� �� ���� ���ٴ� �� ������
     * �װ͸� ��ġ�� �� ��!!!!!
     * @param args
     */
    public static void main(String[] args) {
        String[] idList1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k1 = 2;

        String[] idList2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;

        System.out.println(�Ű����ޱ�.solution1(idList1, report1, k1)); //[2,1,1,0]
        System.out.println(�Ű����ޱ�.solution1(idList2, report2, k2)); //[0,0]
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution1(String[] idList, String[] report, int k) {
        //�� ���� �Ѹ�, ������ �Ű��ص� ī��Ʈ�� �� ����
        //k�� �̻� �Ű� ���ϸ� �Ű��� ����鿡�� ���� �߼�
        //�� �������� ������ ���� Ƚ���� �����ض�

        //1. �Ű� �ߺ� ����
        HashSet<String> set = new HashSet<>();
        for (String s : report) {
            set.add(s);
        }

        //2. �ϴ� map�� �������� ���̵�� �Ű����Ƚ���� 0���� �ʱ�ȭ�ؼ� �־��ش�.
        HashMap<String, Integer> reportMap = new HashMap<>();
        for (int i = 0; i < idList.length; i++) {
            reportMap.put(idList[i], 0);
        }

        //3. map�� �Ű���� id(key)��� Ƚ��(value)�� �ִ´�.
        for (String s : set) { // report�迭�� ���Ҹ� �ϳ��� s�� �ִ´�.
            String[] reportSplit = s.split(" "); //������ �������� ���ڿ��� �и��Ͽ� �迭�� �ٽ� �ִ´�.
            String badId = reportSplit[1]; //�ε����� 1��(��, �Ű���� id) �����͸� �����´�.
            reportMap.put(badId, reportMap.get(badId) + 1); //�Ű���� id�� map�� �־��ش�.
        }

        //4. list�� k�� �̻� �Ű� ���� ���̵� �ִ´�.
        ArrayList<String> badIdList = new ArrayList<>();
        for (int i = 0; i < idList.length; i++) {
            if (reportMap.get(idList[i]) >= k) { //���� �Ű���� Ƚ���� k�� �̻��̸�
                badIdList.add(idList[i]); //list�� �ش� ���̵� �߰�
            }
        }

        //5. ������ ���� �迭 ����
        int[] answer = new int[idList.length];

        //6.
        for (String s : set) {
            String[] reportSplit = s.split(" ");
            String id = reportSplit[0]; //�Ű��� ���� id
            String badId = reportSplit[1]; //�Ű���� ���� id
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