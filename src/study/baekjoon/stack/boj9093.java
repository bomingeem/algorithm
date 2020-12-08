package study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class boj9093 {
    public static void main(String[] args) {
        //시간초과나네 왜지?
        //Scanner.nextInt 메소드는 사용자 입력의 가장 마지막 개행문자를 제거하지 않음
        //개행문자 전까지만 숫자로 입력받아 다음에 호출되는 Scanner.nextLine() 메소드의 입력으로 처리되서 문제가 발생
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Stack<Character> reverse = new Stack<Character>();
        scanner.nextLine(); //개행문자(Enter)를 제거하기 위해 추가

        while (size-- > 0) {
            String word = scanner.nextLine() + " ";

            for(int i=0; i<word.length(); i++) {
                if (word.charAt(i) == ' ') {
                    while(!reverse.empty()) {
                        System.out.print(reverse.pop());
                    }
                    System.out.print(" ");
                } else {
                    reverse.push(word.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
