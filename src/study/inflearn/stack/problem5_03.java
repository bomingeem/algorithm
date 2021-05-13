package study.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class problem5_03 {
    public static void main(String[] args) {
        //크레인 인형뽑기
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++) {
            moves[i] = scanner.nextInt();
        }
        System.out.println(solution.solution(board, moves));

    }

    static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> basket = new Stack<>();
            basket.push(0);
            for(int move : moves) {
                for(int i=0; i<board.length; i++) { //board.length: 행의 크기
                    if (board[i][move-1] != 0) { //0번째 index 부터 시작하므로 move-1
                        if (basket.peek() == board[i][move-1]) {
                            basket.pop();
                            answer += 2;
                        } else { //다른 인형일 경우
                            basket.push(board[i][move-1]);
                        }
                        board[i][move-1] = 0; //꺼냈으면 0을 해야한다
                        break; //더 꺼내면 안되니까 break 문을 건다
                    }
                }
            }
            return answer;
        }
    }
}
