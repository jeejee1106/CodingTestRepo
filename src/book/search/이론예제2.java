package book.search;

import java.util.ArrayList;

public class 이론예제2 {

    /**
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     * DFS, BFS에 대한 간단한 이론과 예제!!!
     * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
     */

    public static void main(String[] args) {
        adjacencyMatrix();
        adjacencyList();


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
    static void  adjacencyList() {
        System.out.println(">>>>> 인접 리스트 예제 <<<<<");
        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

        // 그래프 초기화
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node>());
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


}