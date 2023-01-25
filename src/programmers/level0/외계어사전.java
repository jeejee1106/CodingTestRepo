package programmers.level0;

public class 외계어사전 {
    public static void main(String[] args) {
        String[] spell1 ={"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};

        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};

        String[] spell3 ={"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println(외계어사전.solution1(spell1, dic1)); //2
        System.out.println(외계어사전.solution1(spell2, dic2)); //1
        System.out.println(외계어사전.solution1(spell3, dic3)); //2

        System.out.println(외계어사전.solution2(spell1, dic1)); //2
        System.out.println(외계어사전.solution2(spell2, dic2)); //1
        System.out.println(외계어사전.solution2(spell3, dic3)); //2
    }

    /////////////////[solution 시작]/////////////////
    //평균속도 0.04ms
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

    //평균속도 0.4ms 비슷하넹 그래도 이 코드가 가독성이 더 좋은 것 같다. 리턴을 바로 저렇게 해도 좋은 코드인지는 의문..!
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
