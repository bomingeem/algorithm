package study.inflearn.dfs;

public class problem7_06 {
    static int n;
    static int[] ch; //부분집합으로 사용하는지 안하는지 체크하기 위함
    public static void main(String[] args) {
        problem7_06 T = new problem7_06();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }

    public void DFS(int L) {
        if (L == n+1) {
            String tmp = "";
            for(int i=1; i<=n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if(tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }
}
