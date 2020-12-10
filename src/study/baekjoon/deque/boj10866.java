package study.baekjoon.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class boj10866 {
    public static void main(String[] args) {
        //System.println 말고 StringBuilder 사용하면 시간초과 안난다
        //Scanner보다는 BufferedReader/BufferedWriter, System.out.println보다 StringBuilder를 사용하자
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0) {
            String command = scanner.next();
            if (command.equals("push_front")) {
                int num = scanner.nextInt();
                deque.offerFirst(num);
            } else if (command.equals("push_back")) {
                int num = scanner.nextInt();
                deque.offerLast(num);
            } else if (command.equals("pop_front")) {
                sb.append(deque.isEmpty()? "-1\n" : deque.pollFirst()+"\n");
            } else if (command.equals("pop_back")) {
                sb.append(deque.isEmpty()? "-1\n" : deque.pollLast()+"\n");
            } else if (command.equals("size")) {
                sb.append(deque.size()+"\n");
            } else if (command.equals("empty")) {
                sb.append(deque.isEmpty()? "1\n" : "0\n");
            } else if (command.equals("front")) {
                sb.append(deque.isEmpty()? "-1\n" : deque.peekFirst()+"\n");
            } else if (command.equals("back")) {
                sb.append(deque.isEmpty()? "-1\n" : deque.peekLast()+"\n");
            }
        }
        System.out.println(sb);
    }
}
