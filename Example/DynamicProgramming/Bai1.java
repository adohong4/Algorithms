package Example.DynamicProgramming;

/*
Tính số tổ hợp chập k của n theo công thức truy hồi:
kCn =          1                        nếu k = 0 hoặc k=n 
kCn =    (k-1)C(n-1)+kC(n-1)
 */

public class Bai1 {
    public static int Combination(int n, int k) {
        int[][] C = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            C[i][0] = 1;
            C[i][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                C[i][j] = C[i - 1][j - 1] + C[i - i][j];
            }
        }
        return C[n][k];
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("C(" + n + ", " + k + ") = " + Combination(n, k));
    }
}
