package com.chun.algorithm.n5;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/13 16:53
 */
public class Demo {

    public static void main(String[] args) {
        String str = "\"\"";
        System.out.println(longestPalindrome(str));
    }

    /**
     * 循环字符串依次判断他的
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if(s == null || s.equals("") || s.length() == 1){
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = getLenOfPalindrome(s, i, i);
            int len2 = getLenOfPalindrome(s, i, i+1);
            int maxLength = Math.max(len, len2);
            if(end - start + 1 < maxLength){
                start = i - (maxLength-1) / 2;
                end = i + (maxLength / 2);
            }
        }

        return s.substring(start, end+1);
    }

    /**
     * 获取最大回文数的长度
     * @param str
     * @param left
     * @param right
     * @return
     */
    private static int getLenOfPalindrome(String str, int left, int right){
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
