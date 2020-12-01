package study.baekjoon.step5;

import java.util.Scanner;

public class Step5_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int caseNum = scanner.nextInt();

        for(int i=0; i<caseNum; i++) {
            int student = scanner.nextInt();
            arr = new int[student];

            double sum = 0;

            for(int j=0; j<student; j++) {
                int score = scanner.nextInt();
                arr[j] = score;
                sum += score;
            }

            double avg = (sum / student);
            double count = 0;

            for(int k=0; k<student; k++) {
                if(arr[k]> avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/student)*100);
        }
        scanner.close();
    }
}
