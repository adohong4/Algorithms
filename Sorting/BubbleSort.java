// Tên tệp: BubbleSort.java

package Sorting; // Khai báo package tương ứng với thư mục

import java.util.Scanner; // Import lớp Scanner để nhập dữ liệu từ bàn phím

public class BubbleSort { // Tên lớp phải trùng với tên tệp

    // Phương thức sắp xếp nổi bọt
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Lặp qua tất cả các phần tử trong mảng
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // So sánh các phần tử kế tiếp
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi arr[j] và arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Nếu không có phần tử nào được hoán đổi, mảng đã được sắp xếp
            if (!swapped)
                break;
        }
    }

    // Phương thức in mảng
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " "); // In từng phần tử
        }
        System.out.println(); // Xuống dòng sau khi in xong mảng
    }

    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo Scanner để nhập dữ liệu
        System.out.print("Enter the number of element in the array: ");
        int n = scanner.nextInt(); // Nhập số lượng phần tử

        int[] arr = new int[n]; // Khởi tạo mảng với kích thước n
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Nhập từng phần tử
        }

        System.out.println("original array:"); // In ra thông báo
        printArray(arr); // Gọi phương thức để in mảng

        bubbleSort(arr); // Gọi phương thức sắp xếp

        System.out.println("array after sorting:"); // In ra thông báo
        printArray(arr); // Gọi phương thức để in mảng đã sắp xếp

        scanner.close(); // Đóng Scanner
    }
}
