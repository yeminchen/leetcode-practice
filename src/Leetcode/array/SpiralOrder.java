package Leetcode.array;

import java.util.LinkedList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args) {
        Solution54 s = new Solution54();
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{5,6,7,8};
        matrix[2] = new int[]{9,10,11,12};
        System.out.println(s.spiralOrder(matrix));
    }
}

class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i , j;
        // 行数
        int m = matrix.length;
        // 列数
        int n = matrix[0].length;
        List<Integer> result = new LinkedList();
        int min = Math.min(m, n);
        int start = 0;
        int loop = 0;
        while (loop ++ < min / 2) {
            // 从左往右
            for (j = start; j < n - loop; j++ ) {
                result.add(matrix[start][j]);
            }
            //从上往下
            for (i = start; i < m - loop; i++ ) {
                result.add(matrix[i][j]);
            }
            //从右到左
            for (; j > start; j --) {
                result.add(matrix[i][j]);
            }
            //从下到上
            for (; i > start; i --) {
                result.add(matrix[i][start]);
            }
            start++;
        }
        if (min % 2 == 1) {
            // 高 大于 宽 向下加
            if (m > n) {
                for (int k = start; k < m - loop; k++ ) {
                    result.add(matrix[k][start]);
                }
            } else if (m == n) {
                result.add(matrix[start][start]);
            } else {
                for (int k = start; k < n - start; k++ ) {
                    result.add(matrix[start][k]);
                }
            }
        }
        return result;
    }
}
