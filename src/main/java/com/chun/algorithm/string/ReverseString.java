package com.chun.algorithm.string;

/**
 * 反转字符串
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhbqj/
 *
 * @author chun
 * @date 2021/6/25 15:28
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
