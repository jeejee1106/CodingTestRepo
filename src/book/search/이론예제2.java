package book.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class �̷п���2 {

    /**
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     * DFS, BFS�� ���� ������ �̷а� ����!!!
     * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
     */

    public static void main(String[] args) {
        adjacencyMatrix();
        adjacencyList();
        mainDFS();
        mainBFS();
    }

    //DFS : ���� ��� ����
    static void  adjacencyMatrix() {
        System.out.println(">>>>> ���� ��� ���� <<<<<");
        int inf = 999999999; //������ ��� ����(infinity)

        //2���� ����Ʈ�� �̿��� ���� ��� ǥ��
        int[][] graph = {
                {0, 7, 5},
                {7, 0, inf},
                {5, inf, 0}
        };

        // �׷��� ���
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //DFS : ���� ����Ʈ ����
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
        System.out.println(">>>>> ���� ����Ʈ ���� <<<<<");
        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

        // �׷��� �ʱ�ȭ
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node>()); //������ ����Ʈ�� 0,1,2 �߰�
        }

        // ��� 0�� ����� ��� ���� ���� (���, �Ÿ�)
        graph.get(0).add(new Node(1, 7));
        graph.get(0).add(new Node(2, 5));

        // ��� 1�� ����� ��� ���� ���� (���, �Ÿ�)
        graph.get(1).add(new Node(0, 7));

        // ��� 2�� ����� ��� ���� ���� (���, �Ÿ�)
        graph.get(2).add(new Node(0, 5));

        // �׷��� ���
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
        System.out.println();
    }

    //DFS, BSF���� ���� �ʵ�
    static boolean[] visited = new boolean[9];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    //DFS �˰��� ����
    static void subDFS(int x) {
        //���� ��带 �湮ó��
        visited[x] = true;
        System.out.print(x + " "); //����� �湮 ���� ���

        //���� ���� ����� �ٸ� ��带 ��������� �湮
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                subDFS(y);
            }
        }
    }

    static void mainDFS() {
        System.out.println(">>>>> DFS ���� <<<<<");

        // �׷��� �ʱ�ȭ
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>()); //ArrayList<Integer> ����Ʈ�� 0,1,2,3,4,5,6,7,8 �߰�
        }

        // ��� 1�� ����� ��� ���� ����
        graph.get(1).add(2); //��, 1�� ��忣 2��, 3��, 8�� ��尡 ����Ǿ� �ִ�.
        graph.get(1).add(3);
        graph.get(1).add(8);

        // ��� 2�� ����� ��� ���� ����
        graph.get(2).add(1);
        graph.get(2).add(7);

        // ��� 3�� ����� ��� ���� ����
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // ��� 4�� ����� ��� ���� ����
        graph.get(4).add(3);
        graph.get(4).add(5);

        // ��� 5�� ����� ��� ���� ����
        graph.get(5).add(3);
        graph.get(5).add(4);

        // ��� 6�� ����� ��� ���� ����
        graph.get(6).add(7);

        // ��� 7�� ����� ��� ���� ����
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // ��� 8�� ����� ��� ���� ����
        graph.get(8).add(1);
        graph.get(8).add(7);

        subDFS(1); //����� ù ������ 1�� �־���.

        System.out.println();
        System.out.println();
    }


    static boolean[] visited2 = new boolean[9];
    static ArrayList<ArrayList<Integer>> graph2 = new ArrayList<ArrayList<Integer>>();
    //BFS �˰��� ����
    static void subBFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        // ���� ��带 �湮 ó��
        visited2[start] = true;

        // ť�� �� ������ �ݺ�
        while(!q.isEmpty()) {
            // ť���� �ϳ��� ���Ҹ� �̾� ���
            int x = q.poll();
            System.out.print(x + " ");

            // �ش� ���ҿ� �����, ���� �湮���� ���� ���ҵ��� ť�� ����
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
        System.out.println(">>>>> BFS ���� <<<<<");

        // �׷��� �ʱ�ȭ
        for (int i = 0; i < 9; i++) {
            graph2.add(new ArrayList<Integer>()); //ArrayList<Integer> ����Ʈ�� 0,1,2,3,4,5,6,7,8 �߰�
        }

        // ��� 1�� ����� ��� ���� ����
        graph2.get(1).add(2); //��, 1�� ��忣 2��, 3��, 8�� ��尡 ����Ǿ� �ִ�.
        graph2.get(1).add(3);
        graph2.get(1).add(8);

        // ��� 2�� ����� ��� ���� ����
        graph2.get(2).add(1);
        graph2.get(2).add(7);

        // ��� 3�� ����� ��� ���� ����
        graph2.get(3).add(1);
        graph2.get(3).add(4);
        graph2.get(3).add(5);

        // ��� 4�� ����� ��� ���� ����
        graph2.get(4).add(3);
        graph2.get(4).add(5);

        // ��� 5�� ����� ��� ���� ����
        graph2.get(5).add(3);
        graph2.get(5).add(4);

        // ��� 6�� ����� ��� ���� ����
        graph2.get(6).add(7);

        // ��� 7�� ����� ��� ���� ����
        graph2.get(7).add(2);
        graph2.get(7).add(6);
        graph2.get(7).add(8);

        // ��� 8�� ����� ��� ���� ����
        graph2.get(8).add(1);
        graph2.get(8).add(7);

        subBFS(1); //����� ù ������ 1�� �־���.

        System.out.println();
    }


}