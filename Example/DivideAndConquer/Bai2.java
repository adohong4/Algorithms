package Example.DivideAndConquer;

//tìm Max-Array
public class Bai2 {
    public static int findMax(int[] arr, int left, int right) {

        if (left == right) {
            return arr[left];
        }
        int mid = (right + left) / 2;

        int leftMax = findMax(arr, left, mid);
        int rightMax = findMax(arr, mid + 1, right);

        return Math.max(leftMax, rightMax);

    }

    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };

        // Tìm giá trị lớn nhất trong mảng
        int max = findMax(array, 0, array.length - 1);

        System.out.println("Max element in array: " + max);
    }
}
