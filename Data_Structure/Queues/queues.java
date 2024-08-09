package Data_Structure.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        Queue<String> danhsachSV = new LinkedList<String>();

        danhsachSV.offer("TITV 1"); // add to list
        danhsachSV.offer("Nguyen Van A");
        danhsachSV.offer("Nguyen Van B");
        danhsachSV.offer("TITV 2");

        while (true) {
            String ten = danhsachSV.poll(); // poll => get then delete
                                            // peek => get but don't delete
            if (ten == null) {
                break;
            }
            System.out.println(ten);
            System.out.println(danhsachSV.isEmpty());
        }
    }
}
