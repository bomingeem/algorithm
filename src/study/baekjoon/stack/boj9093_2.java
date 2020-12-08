package study.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class boj9093_2 {
    public static void main(String[] args) throws IOException {
        //BufferedReader/BufferedWriter 사용하니까 된다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        Stack<Character> reverse = new Stack<Character>();

        while (size-- > 0) {
            String word = br.readLine() + "\n";

            for (char c : word.toCharArray()) {
                if(c == ' ' || c == '\n') {
                    while (!reverse.isEmpty()) {
                        bw.write(reverse.pop());
                    }
                    bw.write(c);
                } else {
                    reverse.push(c);
                }
            }
        }
        bw.flush();
    }
}
