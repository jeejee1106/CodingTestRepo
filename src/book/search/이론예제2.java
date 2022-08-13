package book.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 이론예제2 {

    /**
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     * DFS, BFS에 대한 간단한 이론과 예제!!!
     * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
     */

    public static void main(String[] args) {
        adjacencyMatrix();
        adjacencyList();
        mainDFS();
        mainBFS();
    }

    //DFS : 인접 행렬 예제
    static void  adjacencyMatrix() {
        System.out.println(">>>>> 인접 행렬 예제 <<<<<");
        int inf = 999999999; //무한의 비용 선언(infinity)

        //2차원 리스트를 이용해 인접 행렬 표현
        int[][] graph = {
                {0, 7, 5},
                {7, 0, inf},
                {5, inf, 0}
        };

        // 그래프 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //DFS : 인접 리스트 예제
    static class Node {

        private int index;
        private int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public void show() {
            System.out.print("(" + this.index + "," + this.distance + ") ");
        }
    }
    static void adjacencyList() {
        System.out.println(">>>>> 인접 리스트 예제 <<<<<");
        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

        // 그래프 초기화
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node>()); //안쪽의 리스트에 0,1,2 추가
        }

        // 노드 0에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(0).add(new Node(1, 7));
        graph.get(0).add(new Node(2, 5));

        // 노드 1에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(1).add(new Node(0, 7));

        // 노드 2에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(2).add(new Node(0, 5));

        // 그래프 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
        System.out.println();
    }

    //DFS, BSF예제 공통 필드
    static boolean[] visited = new boolean[9];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    //DFS 알고리즘 예제
    static void subDFS(int x) {
        //현재 노드를 방문처리
        visited[x] = true;
        System.out.print(x + " "); //노드의 방문 순서 출력

        //현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                subDFS(y);
            }
        }
    }

    static void mainDFS() {
        System.out.println(">>>>> DFS 예제 <<<<<");

        // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>()); //ArrayList<Integer> 리스트에 0,1,2,3,4,5,6,7,8 추가
        }

        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(2); //즉, 1번 노드엔 2번, 3번, 8번 노드가 연결되어 있다.
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        // 노드 3에 연결된 노드 정보 저장
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // 노드 4에 연결된 노드 정보 저장
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 노드 5에 연결된 노드 정보 저장
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 노드 6에 연결된 노드 정보 저장
        graph.get(6).add(7);

        // 노드 7에 연결된 노드 정보 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 노드 8에 연결된 노드 정보 저장
        graph.get(8).add(1);
        graph.get(8).add(7);

        subDFS(1); //노드의 첫 시작인 1을 넣어줌.

        System.out.println();
        System.out.println();
    }


    static boolean[] visited2 = new boolean[9];
    static ArrayList<ArrayList<Integer>> graph2 = new ArrayList<ArrayList<Integer>>();
    //BFS 알고리즘 예제
    static void subBFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        // 현재 노드를 방문 처리
        visited2[start] = true;

        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int x = q.poll();
            System.out.print(x + " ");

            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i = 0; i < graph2.get(x).size(); i++) {
                int y = graph2.get(x).get(i);
                if(!visited2[y]) {
                    q.offer(y);
                    visited2[y] = true;
                }
            }
        }
    }

    static void mainBFS() {
        System.out.println(">>>>> BFS 예제 <<<<<");

        // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph2.add(new ArrayList<Integer>()); //ArrayList<Integer> 리스트에 0,1,2,3,4,5,6,7,8 추가
        }

        // 노드 1에 연결된 노드 정보 저장
        graph2.get(1).add(2); //즉, 1번 노드엔 2번, 3번, 8번 노드가 연결되어 있다.
        graph2.get(1).add(3);
        graph2.get(1).add(8);

        // 노드 2에 연결된 노드 정보 저장
        graph2.get(2).add(1);
        graph2.get(2).add(7);

        // 노드 3에 연결된 노드 정보 저장
        graph2.get(3).add(1);
        graph2.get(3).add(4);
        graph2.get(3).add(5);

        // 노드 4에 연결된 노드 정보 저장
        graph2.get(4).add(3);
        graph2.get(4).add(5);

        // 노드 5에 연결된 노드 정보 저장
        graph2.get(5).add(3);
        graph2.get(5).add(4);

        // 노드 6에 연결된 노드 정보 저장
        graph2.get(6).add(7);

        // 노드 7에 연결된 노드 정보 저장
        graph2.get(7).add(2);
        graph2.get(7).add(6);
        graph2.get(7).add(8);

        // 노드 8에 연결된 노드 정보 저장
        graph2.get(8).add(1);
        graph2.get(8).add(7);

        subBFS(1); //노드의 첫 시작인 1을 넣어줌.

        System.out.println();
    }


}