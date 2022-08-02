package study.baekjoon.stack;


import java.io.*;
import java.util.Stack;

public class boj9093 {
    static int T;
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 단어 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String word = br.readLine() + "\n";

            for (char ch : word.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        bw.flush();
    }
}
