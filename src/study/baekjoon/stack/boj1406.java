package study.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class boj1406 {
    public static void main(String[] args) throws IOException {
        //시간초과 난다 왜지?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder(br.readLine()); //편집기에 입력되는 문자열

        Stack<Character> leftStack = new Stack<Character>();
        Stack<Character> rightStack = new Stack<Character>();

        int m = Integer.parseInt(br.readLine()); //입력할 명령어의 개수

        for(int i=0; i<word.length(); i++) {
            leftStack.add(word.charAt(i));
        }

        while (m-- > 0) {
            String command = br.readLine();
            if (command.contains("P")) {
                leftStack.push(command.charAt(2));
            } else {
                switch (command) {
                    case "L":
                        if (!leftStack.empty()) {
                            rightStack.push(leftStack.pop());
                        }
                        break;
                    case "D":
                        if (!rightStack.empty()) {
                            leftStack.push(rightStack.pop());
                        }
                        break;
                    case "B":
                        if (!leftStack.empty()) {
                            leftStack.pop();
                        }
                        break;
                }
            }
        }
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            System.out.print(rightStack.pop());
        }
    }
}
