package study.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class prg1844 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps, dx, dy, visited);
        int answer = visited[maps.length - 1][maps[0].length - 1];
        return answer == 0 ? -1 : answer;
    }

    public static void bfs(int[][] maps, int[] dx, int[] dy, int[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];

            for (int d=0; d<4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {
                    if (maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                        visited[nx][ny] = visited[x][y] + 1;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }

}
