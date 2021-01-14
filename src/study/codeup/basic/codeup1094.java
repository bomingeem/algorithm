package study.codeup.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeup1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        Collections.reverse(list);

        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
