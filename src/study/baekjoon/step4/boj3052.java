package study.baekjoon.step4;

import java.util.HashSet;
import java.util.Scanner;

public class boj3052 {
    public static void main(String[] args) {
        //[백준] 나머지
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i<10; i++) {
            hashSet.add(scanner.nextInt()%42);
        }
        System.out.println(hashSet.size());
    }
}
