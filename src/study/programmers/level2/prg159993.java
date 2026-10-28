package study.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class prg159993 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public int solution(String[] maps) {
        return bfs(maps, dx, dy);
    }

    public static int bfs(String[] maps, int[] dx, int[] dy) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] visited = new int[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if (maps[i].charAt(j) == 'S') {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = 1;
                }
            }
        }

        boolean lever = false;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];

            if (!lever && maps[x].charAt(y) == 'L') {
                lever = true;
                int distant = visited[x][y];
                queue.clear();
                visited = new int[maps.length][maps[0].length()];
                queue.offer(new int[]{x, y});
                visited[x][y] = distant;
                continue;
            }

            if (lever && maps[x].charAt(y) == 'E') {
                return visited[x][y] - 1;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length()) {
                    if (maps[nx].charAt(ny) != 'X' && visited[nx][ny] == 0) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = visited[x][y] + 1;
                    }
                }
            }
        }
        return -1;
    }
}
