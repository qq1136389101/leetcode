package com.chun.algorithm.array;

/**
 * 旋转图像
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhhkv/
 *
 * @author chun
 * @date 2021/6/23 16:24
 */
public class RotateImg {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {

        int startIndex = (matrix.length - 1) / 2;
        int x, y;
        Integer lastElement;
        boolean start;
        // 从中心以四边形往外延伸
        for (int i = startIndex; i >= 0; i--) {
            // 从第一个格子直到倒数第二个格子（最后一个格子就是四边形下一条边的第一个格子，所以跳过）
            for (int j = i; j < matrix.length - 1 - i; j++) {
                // 旋转的公式是： 新点的横坐标 = 旧点的纵坐标，新点的纵坐标 = 数组的长度 - 1 - 旧点的横坐标
                x = i;
                y = j;
                start = false;
                lastElement = null; // 前一个元素值的缓存
                while (x != i || y != j || !start){
                    start = true;
                    if(lastElement == null){
                        lastElement = matrix[matrix.length-1-y][x];
                    }

                    int tempElement = matrix[x][y];
                    matrix[x][y] = lastElement;
                    lastElement = tempElement;

                    int tempIndex = x;
                    x = y;
                    y = matrix.length-1-tempIndex;
                }
            }
        }
    }
}
