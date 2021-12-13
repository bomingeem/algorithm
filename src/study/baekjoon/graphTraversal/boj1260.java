package study.baekjoon.graphTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj1260 {
    static int N, M, V; //정점, 간선, 정점의 번호
    static int[][] graph;
    static boolean[] visited;
    public static void main(String[] args) {
        //[백준] DFS와 BFS
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        V = scanner.nextInt();

        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i=0; i<M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            graph[x][y] = graph[y][x] = 1;
        }
        DFS(V);
        System.out.println();
        visited = new boolean[N+1];
        BFS(V);
    }

    public static void DFS(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i=1; i<=N; i++) {
            if (graph[v][i] == 1 && visited[i] == false) {
                DFS(i);
            }
        }
    }

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(v);
        System.out.print(v + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i=1; i<=N; i++) {
                if (graph[temp][i] == 1 && visited[i] == false) {
                    visited[i] = true;
                    queue.offer(i);
                    System.out.print(i + " ");
                }
            }
        }
    }
}
