package com.chun.algorithm.array;

/**
 * 删除排序数组中的重复项
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 *
 * @author chun
 * @date 2021/6/18 9:46
 *
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,3,3,3,3,3,4,5};
        int i = removeDuplicates2(nums);
        System.out.println(i);
    }

    /**
     * 复杂版
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int finalLength = 1;
        int index = 1;
        int maxValue = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= maxValue){
                while (i+index <= nums.length-1 && maxValue == nums[i+index]){
                    index++;
                }

                if(i+index > nums.length-1){
                    return finalLength;
                }else{
                    nums[i] = nums[i+index];
                    maxValue = nums[i];
                    finalLength ++;
                }
            }else{
                maxValue = nums[i];
                finalLength ++;
            }
        }
        return finalLength;
    }

    /**
     * 简化版
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[index] < nums[i]){
                nums[index + 1] = nums[i];
                index ++;
            }
        }
        return index + 1;
    }
}
