package com.algorithms.array;

/**
 * @author itjunjun  2021/8/20 10:25
 */
//笔记：arr[0].length表示arr数组第0列的长度，也就是数组的高度   arr.length表示数组的长度，一行的长度
public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        Offer04 offer04 = new Offer04();
        System.out.println(offer04.findNumberIn2DArray(arr, 5));
    }
}
