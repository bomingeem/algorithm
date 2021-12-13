package study.baekjoon.class3;

import java.util.Scanner;

public class boj2606 {
    static int computer; //컴퓨터의 수
    static int pair; //컴퓨터 쌍의 수
    static int[][] graph;
    static boolean[] visited;
    static int answer = 0;
    public static void main(String[] args) {
        //[백준] 바이러스
        Scanner scanner = new Scanner(System.in);
        computer = scanner.nextInt();
        pair = scanner.nextInt();

        graph = new int[computer+1][computer+1];
        visited = new boolean[computer+1];

        for (int i=1; i<=pair; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        DFS(1);
        System.out.println(answer);
    }

    static void DFS(int virus) {
        visited[virus] = true;

        for (int i=1; i<=computer; i++) {
            if (graph[virus][i] == 1 && visited[i] == false) {
                answer++;
                DFS(i);
            }
        }
    }
}
