package com.chun.algorithm.array;

/**
 * 旋转数组
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 *
 * @author chun
 * @date 2021/6/18 14:15
 */
public class Rotate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

    /**
     * 复杂版：创建临时数组，循环排序后再覆盖旧数组
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if(k == 0){
            return;
        }
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = i + k;
            if(index > nums.length - 1){
                index = index % nums.length;
            }
            newNums[index] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
           nums[i] = newNums[i];
        }
    }
}
