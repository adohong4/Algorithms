<!-- Queues - First In First Out: là cấu trúc dữ liệu để lưu trữ theo cơ chế FIFO
    PriorityQueue: Hàng đợi ưu tiên
    Deque: Hàng đợi 2 đầu

Một số phương thức thường được sử dụng của Queue Interface là:
• add( ) - Chèn phần tử đã chỉ định vào hàng đợi. Nếu tác vụ thành công, add() trả về true, nếu không nó sẽ ném ra một ngoại lệ.
• offer ( ) - Chèn phần tử đã chỉ định vào hàng đợi. Nếu tác vụ thành công, offer() trả về true, nếu không nó sẽ trả về false.
• element( ) - Trả về phần đầu của hàng đợi. Ném một ngoại lệ nếu hàng đợi trống.
• peek ( ) - Trả về đầu của hàng đợi. Trả về null nếu hàng đợi trống.
• emove() - Trả về và xóa phần đầu của hàng đợi. Ném một ngoại lệ nếu hàng đợi trống.
• poll() - Trả về và loại bỏ phần đầu của hàng đợi. Trả về null nếu hàng đợi trống.


Cách làm việc của cấu trúc dữ liệu Deque: https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html
Bổ sung các hàm:
-------------------------------------------------------------------------------------------------      
First Element (Head)  |  Last Element (Tail)
-------------------------------------------------------------------------------------------------      
          |  Throws exception   |    Special value   |  Throws exception    |    Special value
-------------------------------------------------------------------------------------------------            
Insert    |  addFirst(e)        |    offerFirst(e)   |   addLast(e)         |      offerLast(e)
-------------------------------------------------------------------------------------------------   
Remove    | removeFirst()       |    pollFirst()     |    removeLast()      |     pollLast()
-------------------------------------------------------------------------------------------------   
Examine   |  getFirst()         |    peekFirst()     |    getLast()         |      peekLast()


                    Collection
                    (interface)
                        ^
                        |
                      Queue <----------------------------
                    (interface)                         |
                        ^                               |
                        |                               |
                      Deque                         PriorityQueue
                    (interface)                       (class)
                        ^
                        |
        ---------------------------------
        ^                               ^
        |                               |
    LinkedList                      ArrayDeque
     (class)                           (class)


Hoạt động 
  enqueue(): thêm (hay lưu trữ) một phần tử vào trong hàng đợi.
  dequeue(): xóa một phần tử từ hàng đợi.
  peek(): lấy phần tử ở đầu hàng đợi, mà không xóa phần tử này.
  isFull(): kiểm tra xem hàng đợi là đầy hay không.
  isEmpty(): kiểm tra xem hàng đợi là trống hay hay không. -->