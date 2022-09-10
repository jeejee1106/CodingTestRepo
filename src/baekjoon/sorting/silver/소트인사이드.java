package baekjoon.sorting.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드 {
    /**
     * 세 방법 모두 알고리즘에 큰 차이가 없어서 그런지 메모리, 시간적으로도 거의 차이가 없다!
     */
    public static void main(String[] args) throws IOException{
//        solution1(); // String배열 + Arrays.sort(베열, Collections.reverseOrder()) 사용
//        solution2(); // String배열 + Arrays.sort(배열) 사용
        solution3(); // char배열 + Arrays.sort(배열) 사용
    }

    public static void solution1() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        String[] numArr = number.split("");
        Arrays.sort(numArr, Collections.reverseOrder());

        String numStr = "";
        for (int i = 0; i < numArr.length; i++) {
            numStr += numArr[i];
        }

        System.out.println(Integer.parseInt(numStr));

    }

    public static void solution2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        String[] numArr = number.split("");
        Arrays.sort(numArr);

        String numStr = "";
        for (int i = numArr.length - 1; i >= 0; i--) {
            numStr += numArr[i];
        }

        System.out.println(Integer.parseInt(numStr));

    }

    public static void solution3() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] numArr = br.readLine().toCharArray();
        Arrays.sort(numArr);

        for (int i = numArr.length - 1; i >= 0; i--) {
            System.out.print(numArr[i]);
        }
    }
}
