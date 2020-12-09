package study.baekjoon.stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class boj1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int size = scanner.nextInt();
        int[] arr = new int[size+1];
        int m = 1;
        ArrayList<String> stackList = new ArrayList<String>();
        boolean isTrue = true;

        for(int i=1; i<=size; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=1; i<=size; i++) {
            stack.push(i);
            stackList.add("+");
            while (!stack.empty() && stack.peek() == arr[m]) {
                stack.pop();
                stackList.add("-");
                m++;
            }
        }

        if(stack.empty()) {
            for (String s : stackList) {
                System.out.println(s);
            }
        } else {
            System.out.println("NO");
        }
    }
}
