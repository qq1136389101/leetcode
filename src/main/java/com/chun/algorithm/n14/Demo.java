package com.chun.algorithm.n14;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/19 16:29
 */
public class Demo {

    /**
     * 找出其中最短的字符串
     *
     * 循环该字符串的长度，然后再循环数组的长度判断
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        int index = 0;
        while (true){
            if(strs.length == 0){
                return res;
            }
            char commonStr = ' ';
            for (int i1 = 0; i1 < strs.length; i1++) {
                if(index > strs[i1].length() - 1){
                    return res;
                }
                if(i1 == 0){
                    commonStr = strs[i1].charAt(index);
                }else{
                    if(strs[i1].charAt(index) != commonStr){
                        return res;
                    }
                }
            }

            res += String.valueOf(commonStr);
            index ++;
        }
    }
}
