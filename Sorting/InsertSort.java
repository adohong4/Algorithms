package Sorting;

public class InsertSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr[0..i-1], lớn hơn key,
            // đến một vị trí phía sau vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
