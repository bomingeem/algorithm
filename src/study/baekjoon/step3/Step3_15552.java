package study.baekjoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Step3_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int caseNum = Integer.parseInt(bufferedReader.readLine());
        int[] caseArr = new int[caseNum];

        for(int i=0; i<caseNum; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            caseArr[i] = a+b;
        }

        for (int i : caseArr) {
            bufferedWriter.write(i + "\n");
        }

        bufferedWriter.close();
    }
}
