package StringSearchingAlgorithms;

import java.util.HashMap;

public class RabinKarp {

    // Hàm băm cho chuỗi
    private static int hash(String str, int end) {
        int hashValue = 0;
        for (int i = 0; i < end; i++) {
            hashValue += str.charAt(i) * Math.pow(256, i);
        }
        return hashValue;
    }

    // Hàm tìm kiếm chuỗi con
    public static void rabinKarp(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int patternHash = hash(pattern, m);
        int textHash = hash(text, m);

        for (int i = 0; i <= n - m; i++) {
            // Nếu giá trị băm khớp, so sánh chuỗi
            if (patternHash == textHash) {
                if (text.substring(i, i + m).equals(pattern)) {
                    System.out.println("SubString '" + pattern + "' found index at: " + i);
                }
            }
            // Cập nhật giá trị băm cho chuỗi tiếp theo
            if (i < n - m) {
                textHash = (textHash - text.charAt(i)) / 256;
                textHash += text.charAt(i + m) * Math.pow(256, m - 1);
            }
        }
    }

    public static void main(String[] args) {
        String text = "abcabcabcd";
        String pattern = "abc";
        rabinKarp(text, pattern);
    }
}
