package study.codeup.basic;

import java.util.Scanner;

public class codeup1048 {
    public static void main(String[] args) {
        //정수 2개(a,b)를 입력받아 a를 2의 b제곱승 곱한 값으로 출력하기
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a<<b);
    }
}
