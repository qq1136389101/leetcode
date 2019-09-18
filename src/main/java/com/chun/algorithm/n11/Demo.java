package com.chun.algorithm.n11;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 *
 *
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，
 * 容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *
 *  
 *
 * 示例:
 *
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/18 15:57
 */
public class Demo {

    /**
     * 解法- ： 暴力破解法（不推荐）
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     *
     * 其实就是求最大面积
     *
     * 左点 left
     * 右点 right
     *
     * 宽 x = right - left
     * 高 y = min(height[left], height[right])
     * 面积 s = x * y
     *
     * 先从最大宽计算起
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length-1; j > i ; j--) {
                int x = j - i;
                int y = Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, x * y);
            }
        }
        return maxArea;
    }

    /**
     * 解法二: 双指针法（推荐）
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * 左点 left
     * 右点 right
     *
     * 1. 计算面积并保存
     * 2. 判断 left 与 right 大小，小的指针进行移动，
     * 3. 然后再次计算面积，判断与之前的面积的大小，大的保存， 继续第 2 步，直到得出最总结过
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height){
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right){
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
    }
}
