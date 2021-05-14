package study.inflearn.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem5_06 {
    public static void main(String[] args) {
        //공주 구하기
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        problem5_06 problem = new problem5_06();
        System.out.println(problem.solution(n, k));
    }
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            for (int i=1; i<k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }
}
