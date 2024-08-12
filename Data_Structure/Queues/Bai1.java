// In this challenge, you must first implement a QUEUE using two STACKS. Then process q queries, where each query is one of the following 3 types:
// 1 x: Enqueue element x into the end of the queue.
// 2: Dequeue the element at the front of the queue.
// 3: Print the element at the front of the queue.

// Input Format
// The first line contains a single integer, q, denoting the number of queries.
// Each line i of the q subsequent lines contains a single query in the form described in the problem statement above. 
// All three queries start with an integer denoting the query type, but only query 1 is followed by an additional space-separated value, x, denoting the value to be enqueued.

// Constraints:
// 1<=q <= 10^5
// 1<=type<=3
// 1<= |x| <= 10^9
// It is guaranteed that a valid answer always exists for each query of type 3.

// Output Format
// For each query of type 3, print the value of the element at the front of the queue on a new line.

// Sample Input:::
// STDIN   Function
// -----   --------
// 10      q = 10 (number of queries)
// 1 42    1st query, enqueue 42
// 2       dequeue front element
// 1 14    enqueue 42
// 3       print the front element
// 1 28    enqueue 28
// 3       print the front element
// 1 60    enqueue 60
// 1 78    enqueue 78
// 2       dequeue front element
// 2       dequeue front element

// Sample Output
// 14
// 14

// Explanation
// Perform the following sequence of actions:
// 1. Enqueue 42; queue = {42}.
// 2. Dequeue the value at the head of the queue, 42; queue = {}. 3. Enqueue 14; queue = {14}.
// 4. Print the value at the head of the queue, 14; queue = {14}.
// 5. Enqueue 28; queue = {14, 28}.
// 6. Print the value at the head of the queue, 14; queue = {14, 28}.
// 7. Enqueue 60; queue = {14, 28, 60}.
// 8. Enqueue 78; queue = {14, 28, 60, 78}.
// 9. Dequeue the value at the head of the queue, 14; queue={28, 60, 78}.
// 10. Dequeue the value at the head of the queue, 28; queue={60, 78}.

package Data_Structure.Queues;

import java.io.*;
import java.util.*;

public class Bai1 {
    static class QueueUsingStacks {
        private Stack<Integer> stackIn;
        private Stack<Integer> stackOut;

        public QueueUsingStacks() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void enqueue(int x) {
            stackIn.push(x);
        }

        public void dequeue() {
            if (stackOut.isEmpty()) {
                while (!stackIn.isEmpty()) {
                    stackOut.push(stackIn.pop());
                }
            }
            if (!stackOut.isEmpty()) {
                stackOut.pop();
            }
        }

        public int front() {
            if (stackOut.isEmpty()) {
                while (!stackIn.isEmpty()) {
                    stackOut.push(stackIn.pop());
                }
            }
            return stackOut.peek(); // Peek at the top of stackOut
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Read number of queries
        QueueUsingStacks queue = new QueueUsingStacks();

        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                int value = scanner.nextInt();
                queue.enqueue(value);
            } else if (queryType == 2) {
                queue.dequeue();
            } else if (queryType == 3) {
                System.out.println(queue.front());
            }
        }
        scanner.close();
    }
}
