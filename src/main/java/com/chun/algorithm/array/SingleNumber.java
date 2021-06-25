package com.chun.algorithm.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 只出现一次的数字
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x21ib6/
 *
 * @author chun
 * @date 2021/6/18 17:02
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber2(nums));
    }

    /**
     * 效率低下
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }
        return (int) set.toArray()[0];
    }

    /**
     * 使用异或运算符 高效
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {
        int var = 0;
        for (int i = 0; i < nums.length; i++) {
            var = var ^ nums[i];
        }
        return var;
    }
}
