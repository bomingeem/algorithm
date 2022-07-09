package study.baekjoon.step7;


import java.util.Scanner;

public class boj10757 {
    public static void main(String[] args) {
        //[백준] 큰 수 A+B
        Scanner scanner = new Scanner(System.in);
        String strA = scanner.next();
        String strB = scanner.next();

        //두 개의 수 중 가장 긴 자리수 길이를 구함
        int maxLength = Math.max(strA.length(), strB.length());

        //마지막 자리수 올림이 있을 수 있으므로 +1
        int[] A = new int[maxLength + 1];
        int[] B = new int[maxLength + 1];

        //A 초기화: 맨 뒤 문자부터 역순으로 하나씩 저장
        for (int i=strA.length()-1, index = 0; i>=0; i--, index++) {
            A[index] = strA.charAt(i) - '0';
        }

        //B 초기화: 맨 뒤 문자부터 역순으로 하나씩 저장
        for (int i=strB.length()-1, index = 0; i>=0; i--, index++) {
            B[index] = strB.charAt(i) - '0';
        }

        //더하기
        for (int i=0; i<maxLength; i++) {
            int value = A[i] + B[i];
            A[i] = value%10;
            A[i+1] += (value/10);
        }

        //역순 출력
        StringBuilder sb = new StringBuilder();
        if (A[maxLength] != 0) {
            sb.append(A[maxLength]);
        }

        for (int i=maxLength-1; i>=0; i--) {
            sb.append(A[i]);
        }
        System.out.println(sb);
    }
}
