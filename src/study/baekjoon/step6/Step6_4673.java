package study.baekjoon.step6;

public class Step6_4673 {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001];

        for(int i=1; i<=10000; i++) {
            int n = selfNumber(i);

            if(n <= 10000) {
                isNotSelfNumber[n] = true;
            }
        }
        for(int i=1; i<isNotSelfNumber.length; i++) {
            if(!isNotSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }
    public static int selfNumber(int number) {
        int sum = number;
        while (number != 0) {
            sum = sum + (number%10);
            number = number/10;
        }
        return sum;
    }
}
