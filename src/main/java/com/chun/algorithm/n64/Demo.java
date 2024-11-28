package com.chun.algorithm.n64;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/29 15:00
 */
public class Demo {

    /**
     * 动态转移方程
     * f(m, n) = min(f(m-1, n), f(n, m-1)) + grid[m][n]
     *
     * @param grid
     * @return
     */
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int arr[][] = new int[m][n];

        int res1 = 0;
        for (int i = 0; i < m; i++) {
            res1 = res1 + grid[i][0];
            arr[i][0] = res1;
        }

        int res2 = 0;
        for (int i = 0; i < n; i++) {
            res2 = res2 + grid[0][i];
            arr[0][i] = res2;
        }

        for (int i = 1; i < m; i++) {
            for (int i1 = 1; i1 < n; i1++) {
                arr[i][i1] = Math.min(arr[i-1][i1], arr[i][i1-1]) + grid[i][i1];
            }
        }
        return arr[m-1][n-1];
    }

    public static int minPathSum2(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i == 0 && j == 0){
                    dp[i][j] = grid[i][j];
                }else if(i == 0 && j > 0){
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                }else if(i > 0 && j == 0){
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
