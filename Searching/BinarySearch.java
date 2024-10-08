package Searching;

public class BinarySearch {

    public static int BinarySearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return left = mid + 1;
            } else {
                return right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 3, 5, 13, 14, 2, 9, 11, 1 };
        int target = 9;

        int result = BinarySearch(arr, target);
        if (result != -1) {
            System.out.println("phan tu " + target + " duoc tim thay tai index= " + result);
        } else {
            System.out.println("phan tu " + target + " ko tim thay.");
        }
    }
}
