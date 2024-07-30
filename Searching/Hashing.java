package Searching;
//Hash là functions đưa các dữ liệu đầu vào, với độ dài bất kì chuyển đổi thành các dữ liệu đầu ra (có thể là kiểu chuỗi hay bất kì giá trị nào) có độ dài tiêu chuẩn - hash value

// Bảng băm (Hash Table): Là một cấu trúc dữ liệu lưu trữ các cặp khóa-giá trị. Mỗi khóa được chuyển đổi thành một chỉ số (index) bằng cách sử dụng hàm băm, 
// cho phép truy cập nhanh đến giá trị tương ứng.
// Xung đột (Collision): Xảy ra khi hai khóa khác nhau được chuyển đổi thành cùng một chỉ số trong bảng băm. Các phương pháp giải quyết xung đột 
// bao gồm chaining (liên kết) và open addressing (địa chỉ mở).

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        // Tạo một HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Thêm các cặp khóa-giá trị
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);

        // Truy xuất giá trị theo khóa
        System.out.println("age of Aalice: " + map.get("Alice")); // Kết quả: 25

        // Kiểm tra sự tồn tại của một khóa
        if (map.containsKey("Bob")) {
            System.out.println("Bob exists in hash table.");
        }

        // Xóa một phần tử
        map.remove("Charlie");

        // Duyệt qua các cặp khóa-giá trị
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
