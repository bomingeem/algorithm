package study.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class prg1844 {
    //[프로그래머스] 게임 맵 최단거리
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];

        BFS(maps, visited);
        answer = visited[maps.length - 1][maps[0].length - 1];

        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void BFS(int[][] maps, int[][] visited) {
        int x = 0, y = 0;
        visited[x][y] = 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int px = position[0];
            int py = position[1];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + px;
                int ny = dy[i] + py;
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {
                    if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                        visited[nx][ny] = visited[px][py] + 1;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
