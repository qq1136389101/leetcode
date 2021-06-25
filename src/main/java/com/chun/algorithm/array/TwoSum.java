package com.chun.algorithm.array;

import java.util.HashMap;

/**
 * 两数之和
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2jrse/
 *
 * @author chun
 * @date 2021/6/23 15:09
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] res = twoSum2(nums, 6);

        int[] nums2 = {2,7,11,15};
        int[] res2 = twoSum2(nums2, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{i, hashMap.get(target - nums[i])};
            }else{
                hashMap.put(nums[i], i);
            }
        }

        return null;
    }
}
