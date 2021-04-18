package study.inflearn.string;

import java.util.Scanner;

public class problem1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        String str = scanner.next();

        //대문자 ASCII 65~90
        //소문자 ASCII 97~122
        //소문자 - 32(97-65) = 대문자
        for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122) {
                answer += (char)(c - 32);
            } else {
                answer += (char)(c + 32);
            }
            /*
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
            */
        }
        System.out.println(answer);
    }
}
