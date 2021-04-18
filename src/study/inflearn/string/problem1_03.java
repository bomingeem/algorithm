package study.inflearn.string;

import java.util.Scanner;

public class problem1_03 {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int length = tmp.length();
            if (length > max) {
                max = length;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        //마지막 단어 처리
        if (str.length() > max) {
            answer = str;
        }

        /*
        String[] array = str.split(" ");
        for (String s : array) {
            int length = s.length();
            if (length > max) {
                max = length;
                answer = s;
            }
        }
        */

        return answer;
    }
    
    public static void main(String[] args) {
        problem1_03 problem = new problem1_03();
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(problem.solution(sentence));
    }
}
