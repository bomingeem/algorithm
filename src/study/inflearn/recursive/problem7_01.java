package study.inflearn.recursive;

public class problem7_01 {
    public static void main(String[] args) {
        problem7_01 problem = new problem7_01();
        problem.DFS(3);
    }

    public void DFS(int n) {
        //스택 프레임: 매개변수, 지역변수, 복귀주소
        if(n == 0) {
            return;
        } else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
}
