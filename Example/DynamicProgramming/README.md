
<h1>PHƯƠNG PHÁP GIẢI QUY HOẠCH ĐỘNG</h1>

Trong giải thuật đệ quy, một số bài toán con nào đó bị giải **nhiều lần**, do đó tốn rất nhiều thời gian.

**Giải pháp**: Lưu trữ kết quả bài toán con, khi cần thì sử dụng kết quả đó mà **không cần phải giải lại bài toán con.**

Do có nhiều bài toán con nên cần sử dụng một **bảng để lưu trữ** kết quả của các bài toán con.

Tạo bảng bằng cách:
- Gán giá trị cho một số ô nào đó.
- Gán trị cho các ô khác nhờ vào giá trị của các ô trước đó.

Kết quả của bài toán ban đầu cũng nằm trong bảng này, do đó chỉ cần tra bảng để xác định kết quả của bài toán ban đầu.