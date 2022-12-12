package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj1406 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        //[백준] 에디터
        String word = br.readLine();
        int m = Integer.parseInt(br.readLine());
        System.out.println(solution(word, m));
    }

    public static String solution(String word, int m) throws IOException {
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : word.toCharArray()) {
            left.push(String.valueOf(ch));
        }

        for (int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "L":
                    if (!left.empty()) {
                        right.push(left.pop());
                    }
                    break;
                case "D":
                    if (!right.empty()) {
                        left.push(right.pop());
                    }
                    break;
                case "B":
                    if (!left.empty()) {
                        left.pop();
                    }
                    break;
                case "P":
                    left.push(st.nextToken());
                    break;
            }
        }
        
        while (!left.empty()) {
            right.push(left.pop());
        }

        while (!right.empty()) {
            sb.append(right.pop());
        }

        return sb.toString();
    }
}
