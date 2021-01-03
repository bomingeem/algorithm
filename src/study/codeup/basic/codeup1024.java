package study.codeup.basic;

import java.util.Scanner;

public class codeup1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] ch = new char[str.length()];

        for(int i=0; i<str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (char c : ch) {
            System.out.println("'" + c + "'");
        }
    }
}
