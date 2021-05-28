package study.baekjoon.class3;

import java.util.Scanner;

public class boj1541 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 55-(50+40)
        String expression = scanner.next();
        int sum = Integer.MAX_VALUE;
        String[] sub = expression.split("-");

        //50, 50+40
        for (int i=0; i<sub.length; i++) {
            int number = 0;
            String[] add = sub[i].split("\\+");

            for (int j=0; j<add.length; j++) {
                number += Integer.parseInt(add[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = number;
            } else {
                sum -= number;
            }
        }
        System.out.println(sum);
    }
}
