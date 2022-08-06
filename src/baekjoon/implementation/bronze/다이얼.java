package baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이얼 {
    public static void main(String[] args) throws IOException {
        solution1();
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int second = 0;
        /**
         * A,B,C = 2     D,E,F = 3     G,H,I = 4
         * J,K,L = 5     M,N,O = 6     P,Q,R,S = 7
         * T,U,V = 8     W,X,Y,Z = 9
         */

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                    second += 3;
                    break;

                    case 'D' : case 'E' : case 'F' :
                    second += 4;
                    break;

                case 'G' : case 'H' : case 'I' :
                    second += 5;
                    break;

                case 'J' : case 'K' : case 'L' :
                    second += 6;
                    break;

                case 'M' : case 'N' : case 'O' :
                    second += 7;
                    break;

                case 'P' : case 'Q' : case 'R' : case 'S' :
                    second += 8;
                    break;

                case 'T' : case 'U' : case 'V' :
                second += 9;
                break;

                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    second += 10;
                    break;
            }
        }
        System.out.println(second);
    }

}