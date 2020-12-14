package study.baekjoon.stack;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class boj17299 {
    public static void main(String[] args) throws IOException {
        //오등큰수(NGF) 구하기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        int[] ans = new int[n];
        int[] freq = new int[1000001];
        String[] temp = bf.readLine().split(" ");

        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(temp[i]);
            freq[a[i]] += 1;
        }

        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i=1; i<n; i++) {
            if(s.isEmpty()) {
                s.push(i);
            }

            while(!s.isEmpty() && freq[a[s.peek()]] < freq[a[i]]) {
                ans[s.pop()] = a[i];
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            ans[s.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
