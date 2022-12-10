package study.inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
    삽입정렬: 정렬하고자 하는 배열 안에서 교환하는 방식의 제자리 정렬(in-place sorting)
    2번째 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후,
    원소를 뒤로 옮기고 지정된 자리에 자료를 삽입하여 정렬하는 알고리즘
    1. 정렬은 2번째 위치(index)의 값을 temp 에 저장한다.
    2. temp 와 이전에 있는 원소들과 비교하며 삽입해 나간다.
    3. '1'번으로 돌아가 다음 위치(index)의 값을 temp 에 저장하고, 반복한다.
 */
public class problem06_03 {
    public static void main(String[] args) throws IOException {
        //[인프런] 삽입 정렬
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
        for (int i=1; i<array.length; i++) {
            int temp = array[i], j;
            for (j=i-1; j>=0; j--) {
                if (array[j] > temp) {
                    swap(array, j);
                } else {
                    break;
                }
            }
            array[j+1] = temp;
        }
        return array;
    }

    private static void swap(int[] array, int j) {
        array[j+1] = array[j];
    }
}
