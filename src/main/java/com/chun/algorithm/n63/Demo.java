package com.chun.algorithm.n63;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 *
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/27 15:52
 */
public class Demo {

    /**
     * 动态规划
     *
     * @param obstacleGrid
     * @return
     */
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] arr = new int[m][n];

        int flag = 1;
        for (int i = 0; i < m; i++) {
            if(obstacleGrid[i][0] == 1){
                flag = 0;
            }
            arr[i][0] = flag;
        }
        flag = 1;
        for (int i = 0; i < n; i++) {
            if(obstacleGrid[0][i] == 1){
                flag = 0;
            }
            arr[0][i] = flag;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 1){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        return arr[m-1][n-1];
    }

    /**
     * 数据太大会超时
     * @param obstacleGrid
     * @return
     */
//    public static int uniquePathsWithObstacles2(int[][] obstacleGrid) {
//        int m = obstacleGrid.length;
//        int n = obstacleGrid[0].length;
//        return getLen(obstacleGrid, m, n);
//    }
//
//    private static int getLen(int[][] obstacleGrid, int m, int n){
//        if(obstacleGrid[m-1][n-1] == 1){
//            return 0;
//        }
//        if(m==1 && n==1){
//            return 1;
//        }
//        if(m==1 && n>1){
//            return getLen(obstacleGrid, m, n-1);
//        }
//        if(m>1 && n==1){
//            return getLen(obstacleGrid, m-1, n);
//        }
//        while(m > 1 && n > 1){
//            return getLen(obstacleGrid, m-1, n) + getLen(obstacleGrid, m, n-1);
//        }
//        return 0;
//    }
}
