package RecursiveAlgorithms;

public class BackTracking {
    private int n; // Số lượng thành phố
    private int[][] c; // Ma trận chi phí
    private boolean[] visited; // Mảng đánh dấu các thành phố đã thăm
    private int[] X; // Lộ trình hiện tại
    private int ans = Integer.MAX_VALUE; // Chi phí tối thiểu
    private int d = 0; // Chi phí hiện tại
    private int callCount = 0; // Biến đếm số lần gọi hàm Try

    public BackTracking(int[][] costMatrix) {
        n = costMatrix.length;
        c = costMatrix;
        visited = new boolean[n];
        X = new int[n + 1];
    }

    // // Phương thức Try để thực hiện quay lui chưa dùng đánh giá cận
    // public void Try(int i) {
    // callCount++;
    // for (int j = 1; j < n; j++) { // Thành phố 1 là thành phố xuất phát (index 0)
    // if (!visited[j]) {
    // visited[j] = true;
    // X[i] = j;
    // d += c[X[i - 1]][X[i]];

    // if (i == n - 1) { // Đã đi qua tất cả các thành phố
    // ans = Math.min(ans, d + c[X[n - 1]][0]); // Quay lại thành phố đầu
    // } else {
    // Try(i + 1); // Thử thành phố tiếp theo
    // }

    // // Quay lui
    // visited[j] = false;
    // d -= c[X[i - 1]][X[i]];
    // }
    // }
    // }

    // Phương thức Try để thực hiện quay lui
    public void Try(int i) {
        callCount++; // Tăng biến đếm mỗi lần hàm Try được gọi
        for (int j = 1; j < n; j++) { // Thành phố 1 là thành phố xuất phát (index 0)
            if (!visited[j]) {
                int currentCost = d + c[X[i - 1]][X[i]];
                int lowerBound = currentCost + calculateLowerBound();

                // Kiểm tra đánh giá cận
                if (lowerBound < ans) {
                    visited[j] = true;
                    X[i] = j;
                    d = currentCost;

                    if (i == n - 1) { // Đã đi qua tất cả các thành phố
                        ans = Math.min(ans, d + c[X[n - 1]][0]); // Quay lại thành phố đầu
                    } else {
                        Try(i + 1); // Thử thành phố tiếp theo
                    }

                    // Quay lui
                    visited[j] = false;
                    d -= c[X[i - 1]][X[i]];
                }
            }
        }
    }

    private int calculateLowerBound() {
        // Ước tính chi phí tối thiểu để hoàn thành hành trình từ trạng thái hiện tại
        return 0; // Đây là một ví dụ đơn giản, cần thay đổi để phù hợp
    }

    // Phương thức để bắt đầu từ thành phố đầu tiên
    public int solve() {
        visited[0] = true; // Bắt đầu từ thành phố đầu tiên (index 0)
        X[0] = 0;
        Try(1);
        return ans;
    }

    // Phương thức trả về số lần gọi hàm Try
    public int getCallCount() {
        return callCount;
    }

    public static void main(String[] args) {
        int[][] costMatrix = {
                { 0, 29, 20, 21, 16, 31, 100, 12, 4, 31 },
                { 29, 0, 15, 29, 28, 40, 72, 21, 29, 41 },
                { 20, 15, 0, 15, 14, 25, 81, 9, 23, 27 },
                { 21, 29, 15, 0, 4, 12, 92, 12, 25, 13 },
                { 16, 28, 14, 4, 0, 16, 94, 9, 20, 16 },
                { 31, 40, 25, 12, 16, 0, 95, 24, 36, 3 },
                { 100, 72, 81, 92, 94, 95, 0, 90, 101, 99 },
                { 12, 21, 9, 12, 9, 24, 90, 0, 15, 25 },
                { 4, 29, 23, 25, 20, 36, 101, 15, 0, 35 },
                { 31, 41, 27, 13, 16, 3, 99, 25, 35, 0 }
        };

        BackTracking tsp = new BackTracking(costMatrix);
        int minCost = tsp.solve();
        System.out.println("min cost: " + minCost);
        System.out.println("call Try: " + tsp.getCallCount());
    }
}
