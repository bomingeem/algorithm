package study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class boj17298 {
    public static void main(String[] args) {
        //오큰수(NGE) 구하기
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        stack.push(0);
        for(int i=1; i<arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(i);
            }
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                nge[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            nge[stack.pop()] = -1;
        }
        for(int i=0; i<nge.length; i++) {
            sb.append(nge[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
