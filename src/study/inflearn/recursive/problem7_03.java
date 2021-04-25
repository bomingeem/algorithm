package study.inflearn.recursive;

public class problem7_03 {
    public static void main(String[] args) {
        problem7_03 problem = new problem7_03();
        System.out.println(problem.DFS(6));
    }

    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*DFS(n-1);
        }
    }
}
