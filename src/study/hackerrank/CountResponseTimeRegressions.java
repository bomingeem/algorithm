package study.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountResponseTimeRegressions {
    public static void main(String[] args) {
        List<Integer> responseTimes = Arrays.asList(100, 200, 150, 300);
        int answer = countResponseTimeRegressions(responseTimes);
        System.out.println("answer : " + answer);

    }

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        long sum = 0;
        int count = 0;
        for (int i=0; i<responseTimes.size(); i++) {
            Integer currentNumber = responseTimes.get(i);
            if (i > 0) {
                double average = (double) sum / i;
                if (currentNumber > average) count++;
            }
            sum += currentNumber;
        }
        return count;
    }
}
