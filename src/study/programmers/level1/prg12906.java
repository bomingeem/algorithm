package study.programmers.level1;

import study.example.datastructure.stack.Stack;

public class prg12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            // 1, 1, 3, 3, 0, 1, 1
            // 1 3 0 1
            if (stack.empty() || stack.peek() != a) {
                stack.push(a);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i=answer.length - 1; i>=0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
