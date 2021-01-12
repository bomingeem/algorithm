package study.codeup.basic;

import java.util.Scanner;

public class codeup1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i=1;;i++) {
            sum += i;
            if(sum >= num) {
                break;
            }
        }
        System.out.println(sum);
    }
}
