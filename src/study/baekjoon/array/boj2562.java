package study.baekjoon.array;

import java.util.Scanner;

public class boj2562 {
    static Maximum[] maximums;
    static int max = 0;
    static int index = 0;
    static int count = 0;
    public static void main(String[] args) {
        //[백준] 최댓값
        Scanner scanner = new Scanner(System.in);
        maximums = new Maximum[9];
        for (int i=0; i<9; i++) {
            maximums[i] = new Maximum(++count, scanner.nextInt());
        }

        for (Maximum maximum : maximums) {
            int number = maximum.number;
            int indexOfNumber = maximum.index;

            if (number > max) {
                max = number;
                index = indexOfNumber;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }

    public static class Maximum {
        int index;
        int number;

        public Maximum(int index, int number) {
            this.index = index;
            this.number = number;
        }
    }
}
