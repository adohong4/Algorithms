package Data_Structure.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Dequeues {
    public static void main(String[] args) {
        Deque<String> danhsachSV = new ArrayDeque<String>();

        danhsachSV.offer("TITV 1"); // add to list
        danhsachSV.offer("Nguyen Van A");
        danhsachSV.offer("Nguyen Van B");
        danhsachSV.offer("TITV 2");

        danhsachSV.offerLast("TITV 4"); // add last queue
        danhsachSV.offerFirst("TITV 0"); // add first queue

        while (true) {
            String ten = danhsachSV.pollLast();
            if (ten == null) {
                break;
            }

            System.out.println(ten);
        }
    }
}
