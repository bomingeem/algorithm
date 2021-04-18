package study.inflearn.string;

import java.util.Scanner;

public class problem1_01 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        /*
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }
        */

        for (char x : str.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem1_01 problem = new problem1_01();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.print(problem.solution(str, c));
    }
}
