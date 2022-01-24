package study.baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj1620 {
    static int N;
    static int M;
    static Map<String, String> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        //[백준] 나는야 포켓몬 마스터 이다솜
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stringToInt(st.nextToken());
        M = stringToInt(st.nextToken());

        for (int i=0; i<N; i++) {
            String pokemon = br.readLine();
            String number = Integer.toString(i+1);
            map.put(pokemon, number);
            map.put(number, pokemon);
        }

        for (int i=0; i<M; i++) {
            System.out.println(map.get(br.readLine()));
        }
    }

    static int stringToInt(String string) {
        return Integer.parseInt(string);
    }
}
