package Sorting;

public class SelectionSort {

    public static void SelectionSort(int[] arr) {
        int n = arr.length;

        // Di chuyển ranh giới của mảng đã sắp xếp
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của mảng chưa được sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        System.out.println("Mang ban dau:");
        printArray(arr);

        SelectionSort(arr);
        System.out.println("Mang sau khi sap xep:");
        printArray(arr);

    }
}
