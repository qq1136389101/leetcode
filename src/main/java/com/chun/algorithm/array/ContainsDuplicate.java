package com.chun.algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * 存在重复元素
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 *
 * @author chun
 * @date 2021/6/18 16:42
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate2(nums));
    }

    /**
     * 暴力破解法：会超时
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * set去重
     * @param nums
     * @return
     */
    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
