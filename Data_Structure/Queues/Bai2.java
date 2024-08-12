package Data_Structure.Queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bai2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Nhập số lượng phần tử n
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Khởi tạo queue
        Queue<Integer> queue = new LinkedList<>();

        // Nhập n số nguyên
        String[] inputNumbers = bufferedReader.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(inputNumbers[i]));
        }

        // Nhập số k
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        // Thực hiện phép biến đổi k lần
        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty()) {
                int firstElement = queue.poll(); // Lấy phần tử đầu tiên
                queue.offer(firstElement); // Đưa phần tử đó ra sau cùng
            }
        }

        // In kết quả
        for (Integer num : queue) {
            System.out.print(num + " ");
        }

        bufferedReader.close();
    }
}
