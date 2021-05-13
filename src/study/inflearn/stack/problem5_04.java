package study.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class problem5_04 {
    public static void main(String[] args) {
        //후위식 연산(postfix)
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String postfix = scanner.next();
        System.out.println(solution.solution(postfix));
    }

    static class Solution {
        public int solution(String str) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for(char ch : str.toCharArray()) {
                if(Character.isDigit(ch)) {
                    stack.push(ch-48);
                } else {
                    int rt = stack.pop();
                    int lt = stack.pop();
                    if (ch == '+') {
                        stack.push(lt+rt);
                    } else if (ch == '-') {
                        stack.push(lt-rt);
                    } else if (ch == '*') {
                        stack.push(lt*rt);
                    } else if (ch == '/') {
                        stack.push(lt/rt);
                    }
                }
            }
            answer = stack.get(0);
            return answer;
        }
    }
}
