package study.baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11724 {
    static int N;
    static int M;
    static int[][] graph;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        //[백준] 연결 요소의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = 1;
        }

        for (int i=1; i<=N; i++) {
            if (!visited[i]) {
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void DFS(int v) {
        visited[v] = true;
        for (int i=1; i<=N; i++) {
            if (!visited[i] && graph[v][i] == 1) {
                DFS(i);
            }
        }
    }
}
