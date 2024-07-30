package Sorting;

public class MergeSort {
    // Hàm chính để thực hiện sắp xếp hợp nhất
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Tìm chỉ số giữa
            int mid = (left + right) / 2;

            // Gọi đệ quy cho nửa bên trái và nửa bên phải
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Hợp nhất hai nửa
            merge(arr, left, mid, right);
        }
    }

    // Hàm để hợp nhất hai nửa đã sắp xếp
    private static void merge(int[] arr, int left, int mid, int right) {
        // Tính kích thước của hai nửa
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo các mảng tạm thời
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Sao chép dữ liệu vào các mảng tạm thời
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Hợp nhất các mảng tạm thời trở lại arr
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
