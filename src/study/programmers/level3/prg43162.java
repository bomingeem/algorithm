package study.programmers.level3;

public class prg43162 {
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i=0; i<computers.length; i++) {
            if (!visited[i]) {
                dfs(i, computers, visited);
                answer++;
            }
        }

        return answer;
    }

    public static void dfs(int node, int[][] computers, boolean[] visited) {
        visited[node] = true;
        for (int next = 0; next<computers.length; next++) {
            if (!visited[next] && computers[node][next] == 1) {
                dfs(next, computers, visited);
            }
        }
    }

}
