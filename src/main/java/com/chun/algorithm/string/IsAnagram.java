package com.chun.algorithm.string;

import java.util.Arrays;

/**
 * 有效的字母异位词
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn96us/
 *
 * @author chun
 * @date 2021/6/28 10:19
 */
public class IsAnagram {

    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        boolean anagram = isAnagram(s, t);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        for (int i = 0; i < sChars.length; i++) {
            if(tChars[i] != sChars[i]){
                return false;
            }
        }
        return true;
    }
}
