package study.baekjoon.graphTraversal;

import java.util.Arrays;
import java.util.Scanner;

public class boj2667 {
    static int N;
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int count = 0;
    static int[] countList;
    public static void main(String[] args) {
        //[백준] 단지번호 붙이기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        graph = new int[N][N];
        visited = new boolean[N][N];
        countList = new int[N*N];

        for (int i=0; i<N; i++) {
            String str = scanner.next();
            for (int j=0; j<N; j++) {
                graph[i][j] = str.charAt(j)-'0';
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    count++;
                    DFS(i, j);
                }
            }
        }
        Arrays.sort(countList);
        System.out.println(count);

        for (int i=0; i<countList.length; i++) {
            if (countList[i] == 0) {

            } else {
                System.out.println(countList[i]);
            }
        }
    }

    public static void DFS(int x, int y) {
        visited[x][y] = true;
        countList[count]++;

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                    DFS(nx, ny);
                }
            }
        }
    }
}
