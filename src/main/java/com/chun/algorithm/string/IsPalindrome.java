package com.chun.algorithm.string;

/**
 * 验证回文串
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xne8id/
 *
 * @author chun
 * @date 2021/6/28 10:38
 */
public class IsPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            // 过滤字符
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
