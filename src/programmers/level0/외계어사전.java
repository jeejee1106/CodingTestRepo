package programmers.level0;

public class �ܰ����� {
    public static void main(String[] args) {
        String[] spell1 ={"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};

        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};

        String[] spell3 ={"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println(�ܰ�����.solution1(spell1, dic1)); //2
        System.out.println(�ܰ�����.solution1(spell2, dic2)); //1
        System.out.println(�ܰ�����.solution1(spell3, dic3)); //2

        System.out.println(�ܰ�����.solution2(spell1, dic1)); //2
        System.out.println(�ܰ�����.solution2(spell2, dic2)); //1
        System.out.println(�ܰ�����.solution2(spell3, dic3)); //2
    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 0.04ms
    public static int solution1(String[] spell, String[] dic) {
        int answer = 0;
        int count;

        for (int i = 0; i < dic.length; i++) {
            count = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == spell.length) {
                answer = 1;
                break;
            }
            answer = 2;
        }

        return answer;
    }

    //��ռӵ� 0.4ms ����ϳ� �׷��� �� �ڵ尡 �������� �� ���� �� ����. ������ �ٷ� ������ �ص� ���� �ڵ������� �ǹ�..!
    public static int solution2(String[] spell, String[] dic) {
        for(int i = 0; i < dic.length; i++){
            int answer = 0;

            for(int j = 0; j < spell.length; j++){
                if (dic[i].contains(spell[j])) {
                    answer++;
                }
            }
            if (answer == spell.length) {
                return 1;
            }
        }
        return 2;
    }
}
