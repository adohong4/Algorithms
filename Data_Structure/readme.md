# Độ phức tạp của các cấu trúc dữ liệu

## Queue (Hàng đợi)
- Enqueue: O(1)
- Dequeue: O(1)
- Peek: O(1)
**Tình huống sử dụng: Quản lý các tác vụ chờ xử lý.** 
Ví dụ:
- Hệ thống in ấn: Các tài liệu được đưa vào hàng đợi in, và sẽ được in theo thứ tự mà chúng được gửi đến.
- Xử lý tác vụ trong một ứng dụng web, nơi các yêu cầu từ người dùng được xử lý theo thứ tự đến.

## Map (Bản đồ, thường sử dụng HashMap)
- Thêm (Insert): O(1) trung bình, O(n) trong trường hợp xấu
- Tìm kiếm (Search): O(1) trung bình, O(n) trong trường hợp xấu
- Xóa (Delete): O(1) trung bình, O(n) trong trường hợp xấu
**Tình huống sử dụng: Lưu trữ và truy xuất dữ liệu theo khóa.**
Ví dụ:
- Lưu trữ thông tin người dùng với ID người dùng làm khóa và thông tin cá nhân làm giá trị.
- Tạo một từ điển, trong đó từ khóa là từ cần tra cứu và giá trị là định nghĩa của từ đó.

## Heap (Đống)
- Thêm (Insert): O(log n)
- Xóa (Delete): O(log n)
- Tìm kiếm phần tử tối thiểu/tối đa: O(1)
**Tình huống sử dụng: Quản lý các phần tử với thứ tự ưu tiên.**
Ví dụ:
- Thuật toán tìm kiếm đường đi ngắn nhất (Dijkstra) sử dụng heap để lấy phần tử có độ ưu tiên cao nhất.
- Quản lý các tác vụ trong một hệ thống điều phối, nơi các tác vụ có độ ưu tiên khác nhau.

## Tree (Cây)
- Thêm (Insert): O(n) (trong trường hợp cây không cân bằng), O(log n) (trong trường hợp cây cân bằng)
- Tìm kiếm (Search): O(n) (trong trường hợp cây không cân bằng), O(log n) (trong trường hợp cây cân bằng)
- Xóa (Delete): O(n) (trong trường hợp cây không cân bằng), O(log n) (trong trường hợp cây cân bằng)
**Tình huống sử dụng: Quản lý dữ liệu có cấu trúc phân cấp.**
Ví dụ:
- Cấu trúc thư mục trên hệ thống tệp, nơi mỗi thư mục có thể chứa các tệp và thư mục con.
- Cây quyết định trong các bài toán phân loại, nơi mỗi nhánh đại diện cho một quyết định.

## Balanced Tree (Cây cân bằng, ví dụ: AVL Tree)
- Thêm (Insert): O(log n)
- Tìm kiếm (Search): O(log n)
- Xóa (Delete): O(log n)
**Tình huống sử dụng: Cần duy trì thứ tự và hiệu suất tìm kiếm.**
Ví dụ:
- Cây AVL hoặc cây Red-Black cho phép thêm, xóa, và tìm kiếm hiệu quả trong các ứng dụng yêu cầu truy cập dữ liệu nhanh.
- Cấu trúc dữ liệu cho cơ sở dữ liệu, nơi cần thực hiện nhiều thao tác tìm kiếm và cập nhật.

## Stack (Ngăn xếp)
- Push: O(1)
- Pop: O(1)
- Peek: O(1)
**Tình huống sử dụng: Quản lý các tác vụ theo thứ tự LIFO.**
Ví dụ:
- Xử lý các biểu thức toán học, như trong việc đánh giá biểu thức hoặc chuyển đổi giữa các hệ thống số.
- Quản lý các thao tác "quay lại" trong ứng dụng, như trong trình duyệt web (nút "Quay lại").

## Trie (Cây tìm kiếm tiền tố)
- Thêm (Insert): O(m), với m là độ dài của chuỗi
- Tìm kiếm (Search): O(m)
- Xóa (Delete): O(m)
**Tình huống sử dụng: Tìm kiếm chuỗi hoặc tiền tố.**
Ví dụ:
- Tìm kiếm từ trong từ điển, nơi người dùng có thể nhập một phần của từ và nhận lại danh sách các từ phù hợp.
- Tự động hoàn thành trong các ứng dụng nhập liệu, nơi người dùng nhập một vài ký tự và ứng dụng gợi ý các từ hoàn chỉnh.


# Phân tích và xác định các yếu tố cho một bài toán cấu trúc dữ liệu
**Yêu cầu của bài toán:**
- Bạn cần thực hiện các thao tác nào? (thêm, xóa, tìm kiếm, truy cập, v.v.)
- Có yêu cầu về thứ tự không? (FIFO, LIFO, v.v.)

**Đặc điểm dữ liệu:**
- Dữ liệu có được sắp xếp không?
- Kích thước của dữ liệu là bao nhiêu? (n lớn hay nhỏ)

**Độ phức tạp thời gian và không gian:**
- Bạn cần tối ưu hóa độ phức tạp thời gian hay không gian?
- Có cần đảm bảo thời gian thực không?

**Tính chất của cấu trúc dữ liệu:**
- Cấu trúc dữ liệu có cần phải cân bằng không? (như cây AVL)
- Có cần truy cập nhanh đến các phần tử không? (như trong HashMap)

**Tình huống sử dụng:**
- Bạn có cần xử lý các tình huống đặc biệt không? (như giá trị trùng lặp, giá trị null, v.v.)

**Thao tác đồng thời:**
- Có cần xử lý đa luồng không? (nếu có, cần xem xét các cấu trúc dữ liệu an toàn cho đa luồng)