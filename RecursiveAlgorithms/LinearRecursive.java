package RecursiveAlgorithms;

public class LinearRecursive {
    // giai thừa
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    // fibonacci
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String[] args) {
        int number = 4; // số để tính giai thừa
        long result = factorial(number); // gọi hàm đệ quy
        System.out.println("factorial of " + number + " is: " + result);
        long result2 = fibonacci(number);
        System.out.println("fibonacci of " + number + " is: " + result2);

    }
}
