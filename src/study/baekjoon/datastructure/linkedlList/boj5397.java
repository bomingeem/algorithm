package study.baekjoon.datastructure.linkedlList;

import java.io.*;
import java.util.Stack;

public class boj5397 {
    static int T;
    static Stack<String> leftStack = new Stack<>();
    static Stack<String> rightStack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 키로거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            String L = br.readLine();
            String answer = findKeyLogger(L);
            System.out.println(answer);
        }
    }

    public static String findKeyLogger(String L) {
        StringBuilder sb = new StringBuilder();
        for (int j=0; j<L.length(); j++) {
            char ch = L.charAt(j);
            if (ch == '-') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (ch == '<') {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (ch == '>') {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else {
                leftStack.push(String.valueOf(ch));
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        return sb.toString();
    }
}
