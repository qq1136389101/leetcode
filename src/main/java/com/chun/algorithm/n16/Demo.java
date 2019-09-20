package com.chun.algorithm.n16;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/19 18:38
 */
public class Demo {

    /**
     * 排序加双指针法
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        // 过滤掉长度小于三的数组
        if(nums.length < 3){
            return 0;
        }
        if(nums.length == 3){
            return nums[0] + nums[1] + nums[2];
        }

        // 排序
        Arrays.sort(nums);

        int res = nums[0] + nums[1] + nums[2];
        // 最外层循环的i 表示第一个数的下标, start 表示第二个数的下标, end 表示第三个数的下标
        for (int i = 0; i < nums.length; i++) {
            // 如果第一个就与目标相同的话，直接返回
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end){
                // 找出最接近 target 的数
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(target - sum) < Math.abs(target - res)){
                    res = sum;
                }
                if(sum > target){
                    end --;
                }else if(sum < target){
                    start ++;
                }else{
                    return sum;
                }
            }
        }

        return res;
    }


}
