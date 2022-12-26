package study.baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1260 {
    static int N, M, V;
    static int[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        //[백준] DFS와 BFS
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
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
            if (!visited[i] && graph[v][i] == 1) {
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
            Integer temp = queue.poll();

            for (int i=1; i<=N; i++) {
                if (!visited[i] && graph[temp][i] == 1) {
                    visited[i] = true;
                    queue.offer(i);
                    System.out.print(i + " ");
                }
            }
        }
    }
}
