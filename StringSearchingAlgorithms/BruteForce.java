package StringSearchingAlgorithms;
/*Brute Force (tìm kiếm toàn bộ) là một phương pháp giải quyết vấn đề bằng cách thử tất cả các khả năng có thể cho đến khi tìm được giải pháp đúng. 
Đây là cách tiếp cận đơn giản nhưng có thể rất tốn kém về thời gian và tài nguyên, đặc biệt với các bài toán có không gian tìm kiếm lớn. */

public class BruteForce {
    // Phương thức tìm kiếm chuỗi con
    public static int bruteForceSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Duyệt qua từng vị trí trong chuỗi lớn
        for (int i = 0; i <= n - m; i++) {
            int j;

            // Kiểm tra từng ký tự của chuỗi con
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Nếu không khớp, thoát vòng lặp
                }
            }

            // Nếu j == m, có nghĩa là đã tìm thấy chuỗi con
            if (j == m) {
                return i; // Trả về chỉ số bắt đầu của chuỗi con
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy chuỗi con
    }

    public static void main(String[] args) {
        String text = "Hello, this is a simple example.";
        String pattern = "an";

        int index = bruteForceSearch(text, pattern);

        if (index != -1) {
            System.out.println("Substring \"" + pattern + "\"is founded at index: " + index);
        } else {
            System.out.println("Substring \"" + pattern + "\" not found.");
        }
    }
}

// Nhược điểm của Brute Force
// + Thời gian: Thời gian thực hiện có thể tăng nhanh chóng với kích thước đầu
// vào lớn.
// + Tài nguyên: Có thể tiêu tốn nhiều bộ nhớ và tài nguyên hệ thống.
// Khi nào nên sử dụng Brute Force?
// + Khi không có giải pháp tối ưu hơn.
// + Khi kích thước của bài toán nhỏ và có thể xử lý được.
// + Khi cần một giải pháp đơn giản và nhanh chóng để triển khai.