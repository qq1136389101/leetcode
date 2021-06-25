package com.chun.algorithm.array;

import java.util.LinkedList;

/**
 * 移动零
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2ba4i/
 *
 * @author chun
 * @date 2021/6/23 14:41
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        int[] nums = {0};
        moveZeroes2(nums);
    }

    /**
     * 复杂版
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        LinkedList<Integer> zeroIndexs = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroIndexs.add(i);
            }else{
                if(zeroIndexs.size() != 0){
                    nums[zeroIndexs.poll()] = nums[i];
                    nums[i] = 0;
                    zeroIndexs.add(i);
                }
            }
        }
    }

    /**
     * 简化版
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
