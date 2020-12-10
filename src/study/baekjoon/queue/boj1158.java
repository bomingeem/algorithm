package study.baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj1158 {
    public static void main(String[] args) {
        //원에서 사람들이 제거되는 순서를 (N,K)-요세푸스 순열
        //ex) (7,3) → <3,6,2,7,5,1,4>
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i=0; i<n; i++) {
            queue.offer(i+1);
        }

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<m-1; j++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}
