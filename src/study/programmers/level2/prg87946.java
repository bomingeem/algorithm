package study.programmers.level2;

public class prg87946 {
    public static boolean[] visited;
    public static int answer = 0;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    public static void dfs(int k, int[][] dungeons, int count) {
        answer = Math.max(answer, count);
        for (int i=0; i<dungeons.length; i++) {
            int[] dungeon = dungeons[i];
            if (!visited[i] && k >= dungeon[0]) {
                int remainK = k - dungeon[1];
                visited[i] = true;
                dfs(remainK, dungeons, count + 1);
                visited[i] = false;
            }
        }
    }
}
