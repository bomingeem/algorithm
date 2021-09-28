package study.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem9_02 {
    public static void main(String[] args) {
        //[인프런] 9-2. 회의실 배정
        problem9_02 problem = new problem9_02();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            meetings.add(new Meeting(start, end));
        }
        System.out.println(problem.solution(meetings));
    }

    public int solution(ArrayList<Meeting> meetings) {
        int cnt = 0;
        Collections.sort(meetings);
        int end = 0;

        for (Meeting meeting : meetings) {
            if (meeting.start >= end) {
                cnt++;
                end = meeting.end;
            }
        }
        return cnt;
    }

    public static class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            //시작시간 <= 끝나는 시간
            if (this.end == o.end) {
                return this.start - o.start;
            }
            return this.end - o.end; //오름차순 (음수가 된다)
        }
    }
}
