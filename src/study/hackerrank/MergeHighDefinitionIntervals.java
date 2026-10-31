package study.hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeHighDefinitionIntervals {
    public static void main(String[] args) {
        List<List<Integer>> intervals = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 6),
                Arrays.asList(8, 10),
                Arrays.asList(15, 18)
        );
        mergeHighDefinitionIntervals(intervals);
    }

    public static List<List<Integer>> mergeHighDefinitionIntervals(List<List<Integer>> intervals) {
        List<List<Integer>> result = new ArrayList<>();
        if (intervals.isEmpty()) {
            return result;
        }
        intervals.sort((a, b) -> a.get(0) - b.get(0));
        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);

        for (int i = 1; i < intervals.size(); i++) {
            int startNumber = intervals.get(i).get(0);
            int endNumber = intervals.get(i).get(1);

            if (startNumber <= end) {
                end = Math.max(endNumber, end);
            } else {
                result.add(Arrays.asList(start, end));
                start = startNumber;
                end = endNumber;
            }
        }
        result.add(Arrays.asList(start, end));
        return result;
    }
}
