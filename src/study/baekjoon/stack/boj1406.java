package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj1406 {
    static int M;
    static Stack<String> left = new Stack<>();
    static Stack<String> right = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 에디터
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String sentence = br.readLine();
        M = Integer.parseInt(br.readLine());

        for (char ch : sentence.toCharArray()) {
            left.push(String.valueOf(ch));
        }

        for (int i=0; i<M; i++) {
            StringTokenizer command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "L":
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case "D":
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case "B":
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case "P":
                    left.push(command.nextToken());
                    break;
                default:
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);
    }
}
