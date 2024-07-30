package Searching;

public class LinearSearch {
    // tìm kiếm tuyến tính
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int target = 7;

        int result = LinearSearch(arr, target);
        if (result != -1) {
            System.out.println("phan tu " + target + " duoc tim thay tai index= " + result);
        } else {
            System.out.println("phan tu " + target + " ko tim thay.");
        }
    }
}
