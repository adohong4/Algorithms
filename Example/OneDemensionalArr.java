
// Cho dãy n số nguyên a1,a2,a3,...,an
// Hãy tính và in ra những thông tin sau:
//      Tổng các số của dãy.
//      Số lượng số chẵn có trong dãy.
//      Phần tử nguyên dương có chỉ số lớn nhất trong dãy, nếu không có số nào thỏa mãn trong dãy thì in ra số 0.
// Input
//      Dòng đầu chứa số nguyên dương n (n<100)
//      Dòng thứ hai chứa a1,a2,a3,...,an (-1000< an < 1000)
// Output
//      Một dòng chứa ba số nguyên tương tứng với câu trả lời cho ba yêu cầu của bài toán.
// Sample
// Input #1
// 5
// 3 2 6 8 5
// Output #1
// 24 3 5

// Input #2
// 6
// 5 -3 6 8 7 -13
// Output #2
// 10 2 7

package Example;

import java.util.Scanner;

public class OneDemensionalArr {

    public static void SumArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.err.println(sum);
    }

    public static void CountEvenNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count += 1;
        }
        System.err.println(count);
        System.err.println(arr.length);
    }

    public static void MaxElement(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.err.println(max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element in the array: ");
        int n = scanner.nextInt(); // the number of element in the array

        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Enter element
        }

        System.out.println("Sum:");
        SumArray(arr);
        System.out.println("Count Even Element:");
        CountEvenNumber(arr);
        System.out.println("Max Element:");
        MaxElement(arr);

        scanner.close();
    }
}