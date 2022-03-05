package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj2661 {
    static int N;
    public static void main(String[] args) {
        //[백준] 좋은수열
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        //길이가 N인 수열에서 인접하면서 동일한 수열이 있는 경우는 동일한 수열의 길이가 최소 1부터 최대 N/2인 경우 발생한다
        permutation("");
    }

    public static void permutation(String result) {
        if (result.length() == N) {
            System.out.println(result);
            System.exit(0);
        } else {
            for (int i=1; i<=3; i++) {
                if (isGoodSequence(result + i)) {
                    permutation(result + i);
                }
            }
        }
    }

    //마지막 1개와 그 앞의 1개의 수가 동일한지
    //마지막 2개와 그 앞의 2개의 수가 동일한지
    //마지막 3개와 그 앞의 3개의 수가 동일한지
    //...
    //마지막 N/2개와 그 앞에 N/2개의 수가 동일한지 비교하여 한번이라도 동일한 경우가 생긴다면 그 수열은 나쁜 수열로 판단
    private static boolean isGoodSequence(String sequence) {
        int length = sequence.length() / 2;

        for (int i=1; i<=length; i++) {
            if (sequence.substring(sequence.length() - i).equals(sequence.substring(sequence.length() - 2 * i, sequence.length() - i)))  {
                return false;
            }
        }
        return true;
    }
}
