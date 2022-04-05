package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj10828_2 {
    static Stack<Integer> stack = new Stack<>();
    static int N;
    public static void main(String[] args) throws IOException {
        //[백준] 스택: stack library 를 사용한 예제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer command;
        N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "push":
                    stack.push(Integer.parseInt(command.nextToken()));
                    break;
                case "pop":
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if (stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "top":
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
            }
        }
    }
}
