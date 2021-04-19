package study.example.permutation;

public class swapExample {
    //순서없이 n 개중에서 r 개를 뽑는 경우
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];

        permutation(arr, 0, n, 3);
    }

    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    static void print(int[] arr, int r) {
        for (int i=0; i<r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
