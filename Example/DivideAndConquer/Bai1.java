/*Các xâu đầu tiên trong dãy G
A
B
AB
BAB
АВВАВ
BABABBAB
ABBABBABABBAB
BABABBABABBABBABABBAB
Nhận xét: Độ dài của xâu thứ i chính là F[i]
BÀI TOÁN: Cho số tự nhiên N không quá 92 và vị trí K. Xác định ký tự thứ K trong xâu G(n) */

package Example.DivideAndConquer;

public class Bai1 {
    // ta sử dụng fibonacci kết hợp với chia và trị để giải quyết bài toán
    /*
     * Để giải bài toán tìm ký tự thứ K trong xâu G(n), chúng ta có thể sử dụng
     * thuật toán chia và trị dựa trên quan sát rằng
     * mỗi xâu trong dãy G có thể được xây dựng từ hai xâu trước đó theo quy tắc:
     * 
     * G(1) = "A"
     * G(2) = "B"
     * G(n) = G(n-1) + G(n-2) (n ≥ 3)
     * Độ dài của mỗi xâu G(n) chính là dãy Fibonacci: F[n], trong đó F[1] = 1, F[2]
     * = 1 và F[n] = F[n-1] + F[n-2] với n ≥ 3.
     * 
     * Do đó, để tìm ký tự thứ K trong xâu G(n), chúng ta có thể sử dụng chiến lược
     * chia để trị. Cụ thể:
     * 
     * Nếu K <= F(n-2), ký tự thứ K nằm trong xâu G(n-2).
     * Nếu K > F(n-2), ký tự thứ K nằm trong xâu G(n-1), cụ thể là vị trí (K
     * -F(n-2)) trong G(n-1).
     */

    // Hàm tính dãy Fibonacci cho đến F[n]
    private static long[] fibonacci(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Hàm tìm ký tự thứ K trong xâu G(n)
    public static char findCharacter(int n, long k, long[] fib) {
        // Xử lý các trường hợp cơ bản
        if (n == 1)
            return 'A';
        if (n == 2)
            return 'B';

        // Sử dụng chia để trị
        if (k <= fib[n - 2]) {
            return findCharacter(n - 2, k, fib);
        } else {
            return findCharacter(n - 1, k - fib[n - 2], fib);
        }
    }

    // Hàm xây dựng và in ra xâu G(n)
    public static String buildFibonacciString(int n) {
        if (n == 1)
            return "A";
        if (n == 2)
            return "B";
        return buildFibonacciString(n - 2) + buildFibonacciString(n - 1);
    }

    public static void main(String[] args) {
        int n = 6; // ví dụ giá trị N
        long k = 4; // ví dụ giá trị K
        long[] fib = fibonacci(n);

        char result = findCharacter(n, k, fib);
        System.out.println("character " + k + " in string G(" + n + ") is: " + result);
        // Xây dựng và in ra xâu G(n)
        String fibonacciString = buildFibonacciString(n);
        System.out.println("Xâu G(" + n + ") là: " + fibonacciString);
    }
}
