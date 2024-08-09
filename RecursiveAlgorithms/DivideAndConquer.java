package RecursiveAlgorithms;

/*Thuật toán chia để trị (Divide and Conquer) là một kỹ thuật thiết kế thuật toán mạnh mẽ, giúp giải quyết nhiều bài toán phức tạp bằng cách chia bài toán lớn thành các bài toán nhỏ hơn, giải quyết các bài toán nhỏ hơn một cách độc lập và sau đó kết hợp các kết quả để có được giải pháp cho bài toán gốc.

Nguyên Tắc Cơ Bản
Chia (Divide): Chia bài toán lớn thành các bài toán con nhỏ hơn, mà thường có cấu trúc tương tự bài toán gốc.
Chinh phục (Conquer): Giải quyết các bài toán con. Nếu bài toán con đủ nhỏ, giải quyết trực tiếp. Nếu không, áp dụng thuật toán chia để trị cho các bài toán con này.
Kết hợp (Combine): Kết hợp các giải pháp của các bài toán con để tạo ra giải pháp cho bài toán gốc.
Cấu Trúc Thuật Toán
Chia: Xác định cách chia bài toán gốc thành các bài toán nhỏ hơn.
Chinh phục: Đệ quy giải quyết các bài toán nhỏ hơn. Nếu bài toán con đủ nhỏ, giải quyết trực tiếp.
Kết hợp: Kết hợp các kết quả từ các bài toán nhỏ hơn để tạo ra giải pháp cho bài toán gốc. 

Ví dụ: Merge Sort, Binary Search, fibonacci*/

public class DivideAndConquer {
    // Hàm chính để sắp xếp mảng
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Mảng đã nhỏ hơn hoặc bằng 1 phần tử, không cần sắp xếp
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Chia mảng thành hai nửa
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Đệ quy sắp xếp từng nửa
        mergeSort(left);
        mergeSort(right);

        // Kết hợp các nửa đã sắp xếp
        merge(array, left, right);
    }

    // Hàm để kết hợp hai nửa đã sắp xếp
    private static void merge(int[] result, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        // So sánh các phần tử của hai nửa và gộp chúng vào mảng kết quả
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        // Sao chép phần tử còn lại từ nửa bên trái (nếu có)
        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        // Sao chép phần tử còn lại từ nửa bên phải (nếu có)
        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }
    }

    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Array before arrange: ");
        printArray(array);

        mergeSort(array);

        System.out.println("Array after arrange : ");
        printArray(array);
    }

    // Hàm để in mảng
    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
