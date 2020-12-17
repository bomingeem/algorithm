package study.baekjoon.math;

import java.util.Scanner;

public class boj1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean[] check = new boolean[b+1];

        //true = 소수아님, false = 소수
        check[0] = check[1] = true;

        for(int i=2; i*i<=b; i++) {
            if (check[i] == true) { //소수의 배수만 체크
                continue;
            }
            for(int j=2*i; j<=b; j+=i) {
                check[j] = true;
            }
        }
        for (int i=a; i<=b; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}
