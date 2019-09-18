package com.chun.algorithm.n10;

/**
 *
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 *
 * 说明:
 *
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 * 示例 1:
 *
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 *
 * 输入:
 * s = "aa"
 * p = "a*"
 * 输出: true
 * 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 * 示例 3:
 *
 * 输入:
 * s = "ab"
 * p = ".*"
 * 输出: true
 * 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 * 示例 4:
 *
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 * 示例 5:
 *
 * 输入:
 * s = "mississippi"
 * p = "mis*is*p*."
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/16 17:36
 */
public class Demo {

    public static void main(String[] args) {
        String s = "mississippi";
        String p = "*mis*is*ippi";
        System.out.println(isMatch(s, p));
    }

//    /**
//     * 通过使用 * 将字符串分隔成多个子字符串，
//     * 每个子字符串的最后一个字符是 0 到 多个的，
//     * 其余的字符串需要按顺序一一对应，如果有 . 则匹配任意字符
//     * @param s
//     * @param p
//     * @return
//     */
//    public static boolean isMatch(String s, String p) {
//        String[] strings = p.split("\\*");
//        String subStrHead;
//        char preCycleChar;
//        for (int i = 0; i < strings.length; i++) {
//
//            if(isEmpty(strings[i])){
//                continue;
//            }
//
//            if(i == strings.length - 1){
//                subStrHead = strings[i];
//            }else{
//                subStrHead = strings[i].substring(0, strings[i].length()-1);
//            }
//
//            preCycleChar = (i > 0 && strings[i-1].length() > 0) ? strings[i-1].charAt(strings[i-1].length() - 1) : ' ';
//
//            s = isMatchSubStr(s, subStrHead, preCycleChar);
//            if(s == null){
//                return false;
//            }
//        }
//        if(!s.equals("")){
//            return false;
//        }else{
//            return true;
//        }
//    }
//
//    /**
//     * 判断是否符合子字符串，将符合的部分截取掉，
//     * 保留剩余的字符用作下一次匹配
//     *
//     * @param s         要比较的字段
//     * @param subStrHead 子字符串（不包含 * 前面的字符）
//     * @param preCycleChar 上一个子字符串的 * 前面的一个字符
//     * @return
//     */
//    private static String isMatchSubStr(String s, String subStrHead, char preCycleChar){
//
//        // 跳过上一个字符串通配符 * 匹配的字符
//        while (s.charAt(0) == preCycleChar){
//            s = s.substring(1);
//            continue;
//        }
//
//        // 判断是否包含当前子字符串的头部
//        for (int i = 0; i < subStrHead.length(); i++) {
//            char first = subStrHead.charAt(i);
//            if(first == s.charAt(0) || first == '.'){
//                s = s.substring(1);
//                continue;
//            }else{
//                return null;
//            }
//        }
//        return s;
//    }
//
    public static boolean isEmpty(String str){
        if(str == null || str.equals("")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 回溯算法
     *
     * @param text
     * @param pattern
     * @return
     */
    public static boolean isMatch(String text, String pattern) {
        if(pattern.isEmpty()){
            return text.isEmpty();
        }
        boolean firstMatch = !text.isEmpty() && (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.');

        if(pattern.length() > 1 && pattern.charAt(1) == '*'){
            return isMatch(text, pattern.substring(2)) || (firstMatch && isMatch(text.substring(1), pattern));
        }else{
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }

}
