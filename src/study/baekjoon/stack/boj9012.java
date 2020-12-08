package study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        while (size-- > 0) {
            int count = 0;
            boolean vps;
            String parenthesisString = scanner.next();
            char temp;
            for (int i=0; i<parenthesisString.length(); i++) {
                temp = parenthesisString.charAt(i);
                if (count < 0) {
                    vps = false;
                    break;
                }
                if(temp == '(') {
                    count++;
                } else if (temp == ')') {
                    count--;
                }
            }

            if(count == 0) {
                vps = true;
            } else {
                vps = false;
            }
            System.out.println(vps?"YES":"NO");
        }
    }
}
