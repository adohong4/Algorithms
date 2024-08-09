package Example.DynamicProgramming;

/*
Cho một cái ba lô có thể đựng một trọng lượng W và n loại đồ vật, mỗi đồ vật i có một trọng lượng Gi và một giá trị Vi. 
Tất cả các loại đồ vật đều có số lượng không hạn chế. Tìm một cách lựa chọn các đỗ vật đựng vào ba lỗ, chọn các loại đồ vật nào, 
mỗi loại lấy bao nhiêu sạo cho tổng trọng lượng không vượt quá W và tổng giá trị là lớn nhất. 

Ví dụ bài toán cái ba lô với trọng lượng W=9, và 5 loại đồ vật được cho trong bảng sau
Đồ vật    Trọng lượng (gi)    Giá trị (vi)
1              3                   4
2              4                   5
3              5                   6
4              2                   3
5              1                   1


Chọn một đồ vật:
Khi ta quyết định thêm một đồ vật vào ba lô, có hai khả năng:
    Ta không chọn đồ vật đó.
    Ta chọn đồ vật đó ít nhất một lần.
Trường hợp không chọn đồ vật:
    Nếu ta không chọn đồ vật i, giá trị tối đa mà ta có thể đạt được với trọng lượng 
    j sẽ là giá trị tối đa mà ta đã tính toán trước đó cho trọng lượng j, tức là dp[j].
Trường hợp chọn đồ vật:
    Nếu ta chọn đồ vật i, ta sẽ sử dụng trọng lượng của nó (weights[i]) và thêm giá trị của nó (values[i]) vào giá trị tối đa 
    mà ta có thể đạt được với trọng lượng còn lại (j−weights[i]).
    Giá trị này được tính là dp[j - weights[i]] + values[i].

Vì vậy, công thức truy hồi cho bài toán này được xây dựng như sau:
dp[j]=max(dp[j],dp[j−weights[i]]+values[i])

Giải thích:
dp[j]: Giá trị tối đa hiện tại cho trọng lượng 
dp[j - weights[i]] + values[i]: Giá trị tối đa nếu ta chọn đồ vật i và thêm nó vào ba lô.

Giả sử ta có:
Trọng lượng tối đa W=9
Đồ vật 1: Trọng lượng 3, Giá trị 4
Khi ta đang tính toán cho j=5:
    Nếu ta không chọn đồ vật 1, giá trị tối đa là dp[5].
    Nếu ta chọn đồ vật 1 (trọng lượng 3), ta còn lại 5−3=2 trọng lượng, và giá trị sẽ là dp[2] + 4.
Vì vậy, ta sẽ cập nhật giá trị tối đa cho dp[5] bằng cách so sánh giữa hai trường hợp trên:
dp[5]=max(dp[5],dp[2]+4)
*/

public class bai2 {
    public static int unboundedKnapsack(int W, int[] weights, int n, int[] values) {
        int[] dp = new int[W + 1];

        for (int i = 0; i < n; i++) {
            for (int j = weights[i]; j <= W; j++) {
                dp[j] = Math.max(dp[j], dp[j] - weights[i] + values[i]);
            }
        }

        return dp[W];
    }

    public static void main(String[] args) {
        int W = 9;
        int[] weights = { 3, 4, 5, 2, 1 };
        int[] values = { 4, 5, 6, 3, 1 };
        int n = weights.length;

        int maxValue = unboundedKnapsack(W, weights, n, values);
        System.out.println("max: " + maxValue);
    }
}
