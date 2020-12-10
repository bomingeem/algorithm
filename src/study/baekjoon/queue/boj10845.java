package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj10845 {
    public static void main(String[] args) throws IOException {
        //시간초과
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] queue = new int[n];
        int begin = 0;
        int end = 0;
        scanner.nextLine();

        while(n-- > 0) {
            String command = scanner.next();
            if(command.equals("push")) {
                int num = Integer.parseInt(scanner.next());
                queue[end] = num;
                end += 1;
            } else if(command.equals("pop")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin]);
                    begin += 1;
                }
            } else if(command.equals("size")) {
                System.out.println(end-begin);
            } else if(command.equals("empty")) {
                if (begin == end) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if(command.equals("front")) {
                if(begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin]);
                }

            } else if(command.equals("back")) {
                if(begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[end-1]);
                }
            }
        }
    }
}
