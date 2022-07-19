package Leetcode.array;

public class GenerateMatrix {

    public static void main(String[] args) {

        Solution59 s = new Solution59();
    }
}

class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int start = 0;  // 每次循环的开始点(start, start)
        int count = 1;  // 定义填充数字
        int i, j;
        int loop = 0;
        while (loop < n / 2) {
            loop++;
            // 从左到右
            for (j = start; j < n - loop; j ++) {
                result[start][j] = count++;
            }
            //从上到下
            for (i = start; i < n - loop; i ++) {
                result[i][j] = count++;
            }
            //从右到左
            for (; j > start; j --) {
                result[i][j] = count++;
            }
            //从下到上
            for (; i > start; i --) {
                result[i][start] = count++;
            }
            start++;
        }
        if (n % 2 == 1) {
            result[start][start] = count;
        }
        return result;
    }
}
