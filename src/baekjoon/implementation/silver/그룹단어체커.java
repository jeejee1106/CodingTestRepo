package baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 그룹단어체커 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(Scanner로 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strCount = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < strCount; i++) {
            String str = br.readLine();

            //받은 문자열의 길이가 1이나 2면 무조건 그룹단어이기 때문에 따로 검사할 필요 없이 answer + 1을 해준다.
            if (str.length() < 3) {
                answer++;
            } else {
                //받은 문자열의 길이가 3이상이라면??
                HashMap<Character, Integer> map = new HashMap<>();
                map.put(str.charAt(0), 1); //HashMap에 첫 문자와 카운트를 넣는다.
                //문자열의 길이만큼 for문을 돌리는데, 위에서 첫 문자는 해결을 했으니 j = 1부터!
                for (int j = 1; j < str.length(); j++) {
                    char now = str.charAt(j); //현재 문자
                    char prev = str.charAt(j - 1); //이전 인덱스의 문자

                    //현재 문자를 map에 넣는다. 만약 이미 맵에 문자가 존재한다면 카운트 +1 해준다.
                    map.put(now, map.getOrDefault(now, 0) + 1);

                    //map의 현재 문자에 대한 value값이 2이상인데(즉 처음 등장한 문자가 아니라 두 번이상 등장한 문자라는 뜻),
                    //현재 문자가 이전 문자와 일치하지 않다면?
                    //끊어져서 같은 문자가 두 번 나왔다는 뜻이니 그룹 단어가 될 수 없다.
                    if (map.get(now) > 1 && now != prev) {
                        break; //그룹단어가 아니면 for문 빠져나오기
                    }
                    if (j == str.length() - 1) { //문자열을 끝까지 다 돌았다?? 그룹단어의 조건에 만족한다는 뜻
                        answer++; //그러므로 카운트 + 1
                    }
                }
            }
        }
        System.out.println(answer);
    }
}