package programmers.kakao2023;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A",
                              "2021.07.01 B",
                              "2022.02.19 C",
                              "2022.02.20 C",};

        String today2 = "2020.03.01";
        String[] terms2 = {"A 10", "B 5", "C 3"};
        String[] privacies2 = {"2019.01.01 A",
                "2019.03.02 A",
                "2019.03.19 A",
                "2019.04.20 A",};

        System.out.println(Arrays.toString(test1.solution(today, terms, privacies)));
        System.out.println(Arrays.toString(test1.solution(today2, terms2, privacies2)));
    }

    /////////////////[solution ����]/////////////////
    public static int[] solution(String today, String[] terms, String[] privacies) {
        //���ó�¥�� �������� �ı��ؾ� �� ���������� ��ȣ�� ������������ �����Ͽ� return�ض�

        //���ε��� ��� ���� ��¥, ��� ������ �߶� �� �迭�� �ֱ�
        String[] agreeDay = new String[privacies.length];
        String[] privateTermName = new String[privacies.length];
        for (int i = 0; i < privacies.length; i++) {
            agreeDay[i] = privacies[i].split(" ")[0];
            privateTermName[i] = privacies[i].split(" ")[1];
        }

        //��� ���� �߶� �� �迭�� �ֱ�
        String[] termName = new String[terms.length]; //��� �̸�
        int[] termDay = new int[terms.length]; //���� �Ⱓ
        for (int i = 0; i < terms.length; i++) {
            termName[i] = terms[i].split(" ")[0];
            termDay[i] = Integer.parseInt(terms[i].split(" ")[1]);
        }

        //��� ���� map�� �ֱ�
        Map<String, Integer> termsMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            termsMap.put(termName[i], termDay[i]);
        }

        // �� ���� ����� �´� �����ñ⸦ ���ؼ�
        // if(���� 12 �ʰ��� ) {
        // �⵵ +1, �� -12, �� -1 } else{�� -1}
        int[] privYear = new int[agreeDay.length];
        int[] privmonth = new int[agreeDay.length];
        int[] privday = new int[agreeDay.length];

        for (int i = 0; i < agreeDay.length; i++) {
            privYear[i] = Integer.parseInt(agreeDay[i].split("\\.")[0]);
            privmonth[i] = Integer.parseInt(agreeDay[i].split("\\.")[1]);
            privday[i] = Integer.parseInt(agreeDay[i].split("\\.")[2]);
        }

        for (int i = 0; i < agreeDay.length; i++) {
            int addMonth = termsMap.get(privateTermName[i]);
            privmonth[i] += addMonth;
            while (privmonth[i] > 12) {
                privYear[i] += 1;
                privmonth[i] -= 12;
                if (privmonth[i] < 12) {
                    break;
                }
            }
        }

        String[] todayArr = today.split("\\.");
            int[] todayInt = new int[3];
            for (int i = 0; i < todayArr.length; i++) {
                todayInt[i] = Integer.parseInt(todayArr[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            if (privYear[i] < todayInt[0]) {
                list.add(i + 1);
            } else if (privYear[i] == todayInt[0] && privmonth[i] < todayInt[1]) {
                list.add(i + 1);
            } else if (privYear[i] == todayInt[0] && privmonth[i] == todayInt[1] && privday[i] <= todayInt[2]) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}