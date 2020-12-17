package study.baekjoon.math;

import java.util.Scanner;

public class boj1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;

        while (size-- > 0) {
            if (prime(scanner.nextInt())) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean prime(int x) {
        if (x < 2) {
            return false;
        }
        for(int i=2; i<=x-1; i++) {
            if(x % i == 0) {
                return  false;
            }
        }
        return true;
    }
}
