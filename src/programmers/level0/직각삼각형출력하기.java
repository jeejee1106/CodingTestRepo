package programmers.level0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 직각삼각형출력하기 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }

    //내가 알기론 아래 버퍼드리더와 스트링빌더를 사용하는 것이 속도면에서 훨씬 빠르다고 알고 있다.
    //이 문제는 n의 범위가 10이하여서 두 방법의 속도가 거의 비슷했다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
