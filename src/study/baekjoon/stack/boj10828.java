package study.baekjoon.stack;

import java.util.Scanner;

public class boj10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stack = new int[n];
        int size = 0;

        while (n-- > 0) {
            String word = scanner.next();
            if (word.equals("push")) {
                int num = Integer.parseInt(scanner.next());
                stack[size++] = num;
            } else if (word.equals("pop")) {
                if(size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size-1]);
                    size = size-1;
                }
            } else if (word.equals("top")) {
                if(size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size-1]);
                }
            } else if (word.equals("size")) {
                System.out.println(size);
            } else if (word.equals("empty")) {
                if (size == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}
