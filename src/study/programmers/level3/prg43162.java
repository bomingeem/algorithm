package study.programmers.level3;

public class prg43162 {
    //[프로그래머스] 네트워크
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                DFS(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }

    public static void DFS(int[][] computers, int i, boolean[] visited) {
        visited[i] = true;

        for (int j=0; j<computers.length; j++) {
            if (computers[i][j] == 1 && !visited[j]) {
                DFS(computers, j, visited);
            }
        }
    }
}
