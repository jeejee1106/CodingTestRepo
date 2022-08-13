package baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피로도 {
    public static void main(String[] args) throws IOException {
//        solution1();

        int A1 = 5, B1 = 3, C1 = 2, M1 = 10;
        int A2 = 10, B2 = 5, C2 = 1, M2 = 10;
        int A3 = 11, B3 = 5, C3 = 1, M3 = 10;
        System.out.println(solution2(A1, B1, C1, M1)); // 24
        System.out.println(solution2(A2, B2, C2, M2)); // 15
        System.out.println(solution2(A3, B3, C3, M3)); // 0

        System.out.println(solution3(A1, B1, C1, M1)); // 24
        System.out.println(solution3(A2, B2, C2, M2)); // 15
        System.out.println(solution3(A3, B3, C3, M3)); // 0
    }

    public static void solution1() throws IOException { //백준 방식(BufferedReader로 한 줄 입력받고 StringTokenizer로 쪼개기) 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int fatigue = 0; //피로도
        int work = 0; //일한 양
        int time = 0;

        while(time < 24) {
            if (arr[0] > arr[3]) {
                break;
            }
            if (fatigue + arr[0] > arr[3]) {
                fatigue -= arr[2];
                fatigue = fatigue < 0 ? 0 : fatigue;
                time++;
                continue;
            }
            fatigue += arr[0];
            work += arr[1];
            time++;
        }
        System.out.println(work);
    }

    public static int solution2(int A, int B, int C, int M) {
        int fatigue = 0; //피로도
        int work = 0; //일한 양
        int time = 0;

        while(time < 24) {
            if (A > M) { //처음부터 피로도가 최고치(M)을 넘어가면 일 그만.
                break;
            }
            if (fatigue + A > M) { //현재 피로도 + 1시간 더 하면 쌓일 피로도가 최대치(M)보다 크면 쉬어주기
                fatigue -= C; //쉬면서 피로도 줄이기
                fatigue = fatigue < 0 ? 0 : fatigue; //피로도가 음수면 0으로 바꿔주기
                time++; //쉬는시간 더해주기
                continue;
            }
            fatigue += A; //일할 수 있는 상태라면 현재 피로도에 1시간 더 하면 쌓일 피로도 더해주기
            work += B; //일한 양 더해주기
            time++; //일한 시간 더해주기
        }
        return  work;
    }

    public static int solution3(int A, int B, int C, int M) {
        int fatigue = 0; //피로도
        int work = 0; //일한 양
        int time = 0;

        while(time < 24) {
            if (A > M) { //처음부터 피로도가 최고치(M)을 넘어가면 일 그만.
                break;
            }
            if (fatigue + A > M) { //현재 피로도 + 1시간 더 하면 쌓일 피로도가 최대치(M)보다 크면 쉬어주기
                fatigue = fatigue - C < 0 ? 0 : fatigue - C; //쉬면서 피로도 줄이고 피로도가 음수면 0으로 바꿔주기
            } else {
                fatigue += A; //일할 수 있는 상태라면 현재 피로도에 1시간 더 하면 쌓일 피로도 더해주기
                work += B; //일한 양 더해주기
            }
            time++; //쉬는시간 or 일한시간 더해주기
        }
        return  work;
    }
}