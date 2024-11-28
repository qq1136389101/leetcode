package com.chun.algorithm.n931;

import java.util.Arrays;

/**
 * 931. 下降路径最小和
 * 中等
 * 相关标签
 * 相关企业
 * 给你一个 n x n 的 方形 整数数组 matrix ，请你找出并返回通过 matrix 的下降路径 的 最小和 。
 *
 * 下降路径 可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列（即位于正下方或者沿对角线向左或者向右的第一个元素）。具体来说，位置 (row, col) 的下一个元素应当是 (row + 1, col - 1)、(row + 1, col) 或者 (row + 1, col + 1) 。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：matrix = [[2,1,3],[6,5,4],[7,8,9]]
 * 输出：13
 * 解释：如图所示，为和最小的两条下降路径
 * 示例 2：
 *
 *
 *
 * 输入：matrix = [[-19,57],[-40,-5]]
 * 输出：-59
 * 解释：如图所示，为和最小的下降路径
 *
 * @Author chun
 * @Date 2019/9/29 15:00
 */
public class Demo {


    /**
     * 从上到下计算，需要浪费一个同matrix一样的二位数组空间，非最优解
     * @param matrix
     * @return
     */
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        // 第一行：值等于自己的值
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        // 第二行到最后一行
        for (int i = 1; i < n; i++) {
            // 第一列：值等于 自己的值 + 上一行的第一列的值和第二列的值中的最小值
            dp[i][0] = matrix[i][0] + Math.min(dp[i-1][0], dp[i-1][1]);

            // 第二列到倒数第二列: 值等于 自己的值 + 上一行的前一列的值、同列值、下一列值中的最小值
            for (int j = 1; j < n-1; j++) {
                dp[i][j] = matrix[i][j] + Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i-1][j+1]);
            }

            // 最后一列: 值等于 自己的值 + 上一行的倒数第二列的值、最后一列值中的最小值
            dp[i][n-1] = matrix[i][n-1] + Math.min(dp[i-1][n-2], dp[i-1][n-1]);
        }

        // 遍历最后一行的值，返回最小值
        int min = dp[n-1][0];
        for (int j = 1; j < n; j++) {
            min = Math.min(min, dp[n-1][j]);
        }
        return min;
    }

    public static int minFallingPathSum2(int[][] matrix) {
        int n = matrix.length;
        // 第一行的值就是自己本身
        int[] pre = Arrays.copyOf(matrix[0], n);
        int[] cur = Arrays.copyOf(matrix[0], n);

        // 使用两个数组，pre用户保存上一列的值，cur用于计算当前行的值
        for (int i = 1; i < n; i++) {
            cur[0] = matrix[i][0] + Math.min(cur[0], cur[1]);
            for (int j = 1; j < n - 1; j++) {
                cur[j] = matrix[i][j] + Math.min(Math.min(pre[j-1], pre[j]), pre[j+1]);
            }
            cur[n-1] = matrix[i][n-1] + Math.min(pre[n-2], pre[n-1]);
            pre = Arrays.copyOf(cur, cur.length);
        }

        // 遍历最后一行的值，返回最小值
        int min = cur[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, cur[i]);
        }

        return min;
    }

}
