package com.chun.algorithm.string;

/**
 * 实现 strStr()
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnr003/
 *
 * @author chun
 * @date 2021/6/28 14:10
 */
public class StrStr {

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        int i = strStr(haystack, needle);
    }

    public static int strStr(String haystack, String needle) {
        if(needle.equals("") || haystack.equals(needle)){
            return 0;
        }
        int startIndex = -1;
        int matchLength = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(matchLength)){
                if(matchLength == 0){
                    startIndex = i;
                }
                matchLength ++;
                if(matchLength == needle.length()){
                    return startIndex;
                }
            }else{
                startIndex = -1;
                matchLength = 0;
            }
        }
        return -1;
    }
}
