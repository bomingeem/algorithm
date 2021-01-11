package study.codeup.basic;

import java.util.Locale;
import java.util.Scanner;

public class codeup1082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexa = scanner.nextLine();
        int num = Integer.parseInt(hexa, 16);

        String str, ans;
        for (int i=1; i<16; i++) {
            System.out.format("%X*%X=%X%n",num,i,num*i);
        }
    }
}
