package study.baekjoon.step5;

public class boj15596 {
    //[백준] 정수 N개의 합
    public long sum(int[] a) {
        int sum = 0;
        for (int number : a) {
            sum += number;
        }
        return sum;
    }
}
