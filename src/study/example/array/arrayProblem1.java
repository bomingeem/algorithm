package study.example.array;

public class arrayProblem1 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 40, 30, 70, 20, 0, 0, 0, 0};
        int len = 6;
        insert(3, 60, arr, len);
        erase(4, arr, len);
    }

    static void insert(int idx, int num, int arr[], int len) {
        for (int i=len; i>idx; i--) {
            arr[i] = arr[i-1];
        }
        arr[idx] = num;
        len++;
        printArr(arr, len);
    }

    static void erase(int idx, int arr[], int len) {
        len--;
        for (int i=idx; i<len; i++) {
            arr[i] = arr[i+1];
        }
        printArr(arr, len);
    }

    static void printArr(int[] arr, int len) {
        for (int i=0; i<len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
