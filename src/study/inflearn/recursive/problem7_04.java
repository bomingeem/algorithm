package study.inflearn.recursive;

public class problem7_04 {
    //기록한 값을 리턴하는 형태 = 메모이제이션
    static int[] fibo;
    public static void main(String[] args) {
        problem7_04 problem = new problem7_04();
        int n = 10;
        fibo = new int[n+1];
        problem.DFS(n);
        for (int i=1; i<=n; i++) {
            System.out.print(fibo[i]+ " ");
        }
    }

    public int DFS(int n) {
        //배열의 경우 초기화 값이 0인데 0보다 크다는 의미는 특정 값이 들어갔다는 것이다
        //그러할 경우 기록된 값을 그대로 리턴하면 된다
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n]=1;
        } else if (n == 2) {
            return fibo[n]=1;
        } else {
            return fibo[n]=DFS(n-2)+DFS(n-1);
        }
    }
}
