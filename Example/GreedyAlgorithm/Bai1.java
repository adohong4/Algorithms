package Example.GreedyAlgorithm;

import java.util.Arrays;

// Bạn có các đồng tiền có giá trị khác nhau (ví dụ: 1, 5, 10, 25) và bạn cần đổi một số tiền nhất định (ví dụ: 30). 
// Mục tiêu là sử dụng ít đồng tiền nhất có thể.

public class Bai1 {
    public static int GreedyCoinChange(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            while (n >= arr[i]) {
                n -= arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 10, 5, 1 };
        int n = 100;
        int result = GreedyCoinChange(arr, n);
        System.out.println("number of money need: " + result);
    }
}
