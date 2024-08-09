package Data_Structure.Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<String> danhsachSV = new PriorityQueue<String>(); // arrange elements

        danhsachSV.offer("TITV 1"); // add to list
        danhsachSV.offer("Nguyen Van A");
        danhsachSV.offer("Nguyen Van B");
        danhsachSV.offer("TITV 2");

        while (true) {
            String ten = danhsachSV.poll();
            if (ten == null) {
                break;
            }

            System.out.println(ten);

        }
    }
}
// Nguyen Van A
// Nguyen Van B
// TITV 1
// TITV 2