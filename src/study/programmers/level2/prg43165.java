package study.programmers.level2;

public class prg43165 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }
        int a = dfs(numbers, target, index + 1, sum + numbers[index]);
        int b = dfs(numbers, target, index + 1, sum - numbers[index]);
        return a + b;
    }
}


