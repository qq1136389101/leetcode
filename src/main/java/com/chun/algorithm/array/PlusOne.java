package com.chun.algorithm.array;

import java.util.Arrays;

/**
 * 加一
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/
 *
 * @author chun
 * @date 2021/6/23 11:40
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9};
        int[] ints = plusOne2(digits);
    }

    /**
     * 复杂版：递归：空间复杂度高
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        if(digits.length == 0){
            return digits;
        }
        int lastDigit = digits[digits.length - 1];
        if(lastDigit == 9){
            if(digits.length == 1){
                return new int[]{1, 0};
            }
            else{
                int[] pre = plusOne(Arrays.copyOf(digits, digits.length - 1));
                digits = Arrays.copyOf(pre, pre.length + 1);
                digits[digits.length - 1] = 0;
            }
        }
        else{
            digits[digits.length - 1] ++;
        }
        return digits;
    }

    /**
     * 简单版
     * @param digits
     * @return
     */
    public static int[] plusOne2(int[] digits){
        // 从最后一个元素开始，如果元素为9则变为0，继续找前一个元素， 否则加一，结束方法
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] ++;
                return digits;
            }
        }

        // 如果循环完了，则表示全部是9， 数组长度加一，并将第一位设置为1，后面全部设置为0
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
