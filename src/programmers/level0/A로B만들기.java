package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A��B����� {
    public static void main(String[] args) {
        String before1 = "olleh";
        String after1 = "hello";

        String before2 = "allpe";
        String after2 = "apple";

        System.out.println(A��B�����.solution1(before1, after1)); //1
        System.out.println(A��B�����.solution1(before2, after2)); //0

        System.out.println(A��B�����.solution2(before1, after1)); //1
        System.out.println(A��B�����.solution2(before2, after2)); //0
    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 3.0ms
    public static int solution1(String before, String after) {
        String beforeStr = changeSortingStr(before);
        String afterStr = changeSortingStr(after);

        return beforeStr.equals(afterStr) ? 1 : 0;
    }

    public static String changeSortingStr(String str) {
        String[] arr = str.split("");
        Arrays.sort(arr);

        return String.join("", arr);
    }


    //��ռӵ� 3.0ms����???
    public static int solution2(String before, String after) {
        Map<String, Integer> beforeMap = strPutMap(before);
        Map<String, Integer> afterMap = strPutMap(after);

        for (String s : beforeMap.keySet()) {
            if (beforeMap.get(s) != afterMap.get(s)) {
                return 0;
            }
        }

        return 1;
    }

    public static Map<String, Integer> strPutMap(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = str.split("");

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        return map;
    }
}