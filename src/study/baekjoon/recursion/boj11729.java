package study.baekjoon.recursion;

import java.io.*;

public class boj11729 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int K; //옮긴 횟수
    public static void main(String[] args) throws IOException {
        //[백준] 하노이 탑 이동 순서
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //이동횟수: 𝑎𝑛 = 2n-1
        bw.write((int)(Math.pow(2, N) - 1) + "\n");

        //a의 가장 큰 원판을 제외한 원판을 b로 옮기는 경우: n-1
        //a의 가장 큰 원판을 c로 옮기는 경우: 1
        //b의 원판을 c로 옮기는 경우: n-1
        //hanoi(n) = hanoi(n-1) + 1 + hanoi(n-1);
        //hanoi(n) = 2hanoi(n-1) + 1;
        hanoi(N, 1, 2, 3);
        bw.flush();
        bw.close();
    }

    public static void hanoi(int n, int start, int mid, int to) throws IOException {
        //start = 1, mid = 2, to = 3
        if (n == 1) {
            bw.write(start + " " + to + "\n");
            return;
        }

        //(n-1, 1, 3, 2)
        //n-1개를 A에서 B로 이동
        hanoi(n-1, start, to, mid);

        //(1, 3)
        //1개를 A에서 C로 이동
        bw.write(start + " " + to + "\n");

        //(n-1, 2, 1, 3)
        //n-1개를 B에서 C로 이동
        hanoi(n-1, mid, start, to);
    }
}
