package study.inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class problem5_03 {
    public static void main(String[] args) throws IOException {
        //[인프런] 크레인 인형뽑기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            for (int i=0; i<board.length; i++) {
                if (board[i][move-1] != 0) {
                    if (!basket.isEmpty() && basket.peek() == board[i][move-1]) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(board[i][move-1]);
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
