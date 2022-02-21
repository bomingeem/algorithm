package study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class boj23253 {
    static int N; //교과서의 수
    static int M; //교과서 더미의 수
    static int K;
    static int bef;
    static int number;
    static boolean check = true;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        //[백준] 자료구조는 정말 최고야
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        //NOTE: 번호가 작은 교과서가 번호가 큰 교과서 아래에 깔려있는 더미가 하나라도 있으면 올바르게 교과서를 나열할 수 없다.
        for (int i=0; i<M; i++) {
            K = scanner.nextInt();
            bef = N+1;

            for (int j=0; j<K; j++) {
                number = scanner.nextInt();
                if (number > bef) {
                    check = false;
                    break;
                }
                bef = number;
            }
            if (!check) break;
        }
        System.out.println(check ? "Yes" : "No");
    }
}
