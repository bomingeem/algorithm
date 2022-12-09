package study.inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
    버블정렬: 정렬하고자 하는 배열 안에서 교환하는 방식의 제자리 정렬(in-place sorting)
    서로 인접한 두 원소의 대소를 비교하고, 조건에 맞지 않다면 자리를 교환하며 정렬하는 알고리즘
    1. 1회전에 첫 번째 원소와 두 번째 원소를, 두 번째 원소와 세 번째 원소를, 세 번째 원소와 네 번째 원소를,
       ... 이런식으로 (마지막-1)번째 원소와 마지막 원소를 비교하여 조건에 맞지 않는다면 서로 교환한다.
    2. 1회전을 수행하고 나면 가장 큰 원소가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 원소는 정렬에서 제외되고
       2회전을 수행하고 나면 끝에서 두번째 원소까지는 정렬에서 제외된다.
       이렇게 정렬을 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나씩 늘어난다.
 */
public class problem06_02 {
    public static void main(String[] args) throws IOException {
        //[인프런] 버블 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.stream(solution(array)).forEach(result -> System.out.print(result + " "));
    }

    public static int[] solution(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j);
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int j) {
        int temp;
        temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
    }
}
