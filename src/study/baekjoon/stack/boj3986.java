package study.baekjoon.stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj3986 {
    static int N;
    public static void main(String[] args) throws IOException {
        //[백준] 좋은 단어
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.valueOf(st.nextToken());
        int count = 0;

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            stack.push(str.charAt(0));

            for (int j=1; j<str.length(); j++) {
                char currentCharacter = str.charAt(j);

                if (!stack.isEmpty()) {
                    Character previousCharacter = stack.peek();
                    if (previousCharacter == currentCharacter) {
                        stack.pop();
                        continue;
                    }
                }
                stack.push(currentCharacter);
            }
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
