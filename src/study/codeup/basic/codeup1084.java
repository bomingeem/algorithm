package study.codeup.basic;

import java.io.*;
import java.util.Scanner;

public class codeup1084 {
    public static void main(String[] args) {
        //valueOf() 함수는 입력받은 인자값을 지정된 객체형으로 변환하여 반환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] n = br.readLine().split(" ");
            int count = 0;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < Integer.valueOf(n[0]); i++) {
                for (int j = 0; j < Integer.valueOf(n[1]); j++) {
                    for (int k = 0; k < Integer.valueOf(n[2]); k++) {
                        bw.write(i + " " + j + " " + k + "\n");
                        count++;
                    }
                }
            }
            bw.write(String.valueOf(count));
            bw.flush();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
