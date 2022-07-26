package study.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2108 {
    public static void main(String[] args) throws IOException {
        //[백준] 통계학
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[8001];

        /**
         * sum: 합계
         * max: 최대값
         * min: 최소값
         * median: 중앙값
         * mode: 최빈값
         */

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;

        for (int i=0; i<N; i++) {
            int number = Integer.parseInt(br.readLine());
            sum += number;
            array[number + 4000]++;

            if (max < number) {
                max = number;
            }

            if (min > number) {
                min = number;
            }
        }

        int count = 0; //중앙값 빈도 누적 수
        int mode_max = 0; //최빈값의 최대값

        boolean flag = false; //이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아닐경우 false

        for (int i=min+4000; i<=max+4000; i++) {
            if (array[i] > 0) {

                /**
                 * 중앙값 찾기
                 */
                if (count < (N+1) / 2) {
                    count += array[i];
                    median = i - 4000;
                }

                /**
                 * 최빈값 찾기
                 */
                if(mode_max < array[i]) {
                    mode_max = array[i];
                    mode = i - 4000;
                    flag = true;
                } else if (mode_max == array[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int)Math.round((double) sum/N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
