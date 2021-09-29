package study.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem9_03 {
    public static void main(String[] args) {
        //[인프런] 9-3. 결혼식
        problem9_03 problem = new problem9_03();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Reception> receptions = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            receptions.add(new Reception(start, 's'));
            receptions.add(new Reception(end, 'e'));
        }

        System.out.println(problem.solution(receptions));
    }

    public int solution(ArrayList<Reception> receptions) {
        int answer = Integer.MIN_VALUE;
        int cnt = 0; //피로연장 순간에 몇명이 존재하는지
        Collections.sort(receptions);

        for (Reception reception : receptions) {
            if (reception.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static class Reception implements Comparable<Reception> {
        int time;
        char state;

        public Reception (int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Reception o) {
            if (this.time == o.time) return this.state - o.state; //시간이 같으면 알파벳 오름차순(e, s)
            else return this.time - o.time; //시간 오름차순
        }
    }
}
