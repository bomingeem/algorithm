package study.inflearn.greedy;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem9_01 {
    public static void main(String[] args) {
        //[인프런] 9-1. 씨름선수
        problem9_01 problem = new problem9_01();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> bodies = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            bodies.add(new Body(h, w));
        }
        System.out.println(problem.solution(bodies));
    }

    public int solution(ArrayList<Body> bodies) {
        int cnt = 0;
        Collections.sort(bodies); //내림차순 정렬
        int max = Integer.MIN_VALUE;

        for (Body body : bodies) {
            if (body.w > max) {
                max = body.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static class Body implements Comparable<Body> {
        public int h, w;

        Body(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Body o) {
            return o.h - this.h;
        }
    }

    /*
    static int N; //지원자의 수
    static int height;
    static int weight;
    static Player[] players;
    static int answer;

    시간복잡도 n₂이므로 좋은 방법이 아니다. (이중 for 문)
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    players = new Player[N];
    answer = N;

    for (int i=0; i<N; i++) {
        height = scanner.nextInt();
        weight = scanner.nextInt();
        players[i] = new Player(height, weight);
    }

    for (int i=0; i<players.length; i++) {
        for (int j=0; j<players.length; j++) {
            if (players[i].height < players[j].height && players[i].weight < players[j].weight) {
                answer--;
                break;
            }
        }
    }
    System.out.println(answer);
    */
    public static class Player {
        int height;
        int weight;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }
}
