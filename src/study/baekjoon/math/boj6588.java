package study.baekjoon.math;

import java.util.ArrayList;
import java.util.Scanner;

public class boj6588 {
    public static final int MAX = 1000000;
    public static void main(String[] args) {
        //n = a + b
        Scanner scanner = new Scanner(System.in);
        boolean[] check = new boolean[MAX+1];
        ArrayList<Integer> prime = new ArrayList<Integer>();
        //int num = scanner.nextInt();

        //true = 소수아님, false = 소수
        check[0] = check[1] = true;
        for(int i=2; i*i <= MAX; i++) {
            if (check[i] == true) {
                continue;
            }
            prime.add(i);
            for(int j=2*i; j<=MAX; j+=i) {
                check[j] = true;
            }
        }

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            boolean isWrong = true;
            for(int i=1; i<prime.size(); i++) {
                int p = prime.get(i);
                if (check[num - p] == false) {
                    System.out.println(num + " = " + p + " + " + (num-p));
                    isWrong = false;
                    break;
                }
            }
            if(isWrong) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
