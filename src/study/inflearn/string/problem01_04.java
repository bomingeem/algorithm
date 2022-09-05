package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem01_04 {
    static Stack<Character> stack = new Stack<>();
    static int N;
    public static void main(String[] args) throws IOException {
        //[인프런] 단어 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            String word = br.readLine();
            for (char ch : word.toCharArray()) {
                stack.push(ch);
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
