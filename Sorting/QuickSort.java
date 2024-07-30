package Sorting;

public class QuickSort {
    // Hàm để thực hiện sắp xếp nhanh
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Tìm chỉ số phân hoạch
            int pi = partition(arr, low, high);

            // Gọi đệ quy cho các phần tử bên trái và bên phải
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Hàm phân hoạch
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Chọn phần tử cuối làm pivot
        int i = (low - 1); // Chỉ số của phần tử nhỏ hơn

        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
            if (arr[j] <= pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Hoán đổi arr[i + 1] và arr[high] (hoán đổi pivot)

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Trả về chỉ số của pivot
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

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Mang sau khi sap xep:");
        printArray(arr);

    }
}
