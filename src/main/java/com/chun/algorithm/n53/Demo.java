package com.chun.algorithm.n53;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * sum[i] = max(sum(i), sum[i-1]+sum(i))
 *
 * @Author chun
 * @Date 2019/9/25 11:40
 */
public class Demo {

    /**
     * 动态规划
     *
     * 动态转移方程
     * dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int res = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            res = Math.max(sum, res);
        }
        return res;
    }
}
