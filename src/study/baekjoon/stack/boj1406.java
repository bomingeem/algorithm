package study.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class boj1406 {
    static int M;
    public static void main(String[] args) throws IOException {
        //[백준] 에디터
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        String sentence = br.readLine();
        M = Integer.parseInt(br.readLine());

        for (char ch : sentence.toCharArray()) {
            leftStack.push(String.valueOf(ch));
        }

        for (int i=0; i<M; i++) {
            String command = br.readLine();
            char ch = command.charAt(0);
            switch (ch) {
                case 'L':
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case 'D':
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case 'B':
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case 'P':
                    char character = command.charAt(2);
                    leftStack.push(String.valueOf(character));
                    break;
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            bw.write(rightStack.pop());
        }

        bw.flush();
        bw.close();
    }
}
