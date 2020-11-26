package study.baekjoon.step5;

import java.util.Scanner;

public class Step5_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiple = scanner.nextInt()*scanner.nextInt()*scanner.nextInt();
        int[] arr = new int[10];

        while(multiple != 0) {
            arr[multiple%10]++;
            multiple = multiple/10;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
