package study.inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
    선택정렬: 제자리(in-place sorting) 알고리즘의 하나
    해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘
     1. 주어진 배열 중에서 최소값을 찾는다
     2. 그 값을 맨 앞에 위치한 값과 교체한다
     3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다
     4. 하나의 원소만 남을 때 까지 위의 1~3 과정을 반복한다
 */
public class problem06_01 {
    public static void main(String[] args) throws IOException {
        //[인프런] 선택 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.stream(solution(array)).forEach(item -> System.out.print(item + " "));
    }

    public static int[] solution(int[] array) {
        int index;

        for (int i=0; i<array.length-1; i++) {
            index = i;
            for (int j=i+1; j<array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            swap(array, index, i);
        }
        return array;
    }

    private static void swap(int[] array, int index, int i) {
        int temp;
        temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }
}
