package study.inflearn.recursive;

public class problem7_02 {
    public static void main(String[] args) {
        problem7_02 problem = new problem7_02();
        problem.DFS(11);
    }

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }
}
