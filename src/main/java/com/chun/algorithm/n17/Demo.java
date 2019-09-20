package com.chun.algorithm.n17;

import java.util.*;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/20 14:46
 */
public class Demo {


    /**
     * 简历映射关系
     * 2 abc
     * 3 def
     * 3 gih
     * 5 jkl
     * 6 mno
     * 7 pqrs
     * 8 tuv
     * 9 wxyz
     *
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {

        // 建立映射关系
        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', Arrays.asList(new String[]{"a", "b", "c"}));
        map.put('3', Arrays.asList(new String[]{"d", "e", "f"}));
        map.put('4', Arrays.asList(new String[]{"g", "i", "h"}));
        map.put('5', Arrays.asList(new String[]{"j", "k", "l"}));
        map.put('6', Arrays.asList(new String[]{"m", "n", "o"}));
        map.put('7', Arrays.asList(new String[]{"p", "q", "r", "s"}));
        map.put('8', Arrays.asList(new String[]{"t", "u", "v"}));
        map.put('9', Arrays.asList(new String[]{"w", "x", "y", "z"}));


        List<String> list = new ArrayList<>();
        if(digits.length() == 1){
            return map.get(digits.charAt(0));
        }
        for (int i = 0; i < digits.length(); i++) {
            if(i == 0){
                list = map.get(digits.charAt(i));
            }
            if(i < digits.length() - 1){
                list = addNewList(list, map.get(digits.charAt(i+1)));
            }
        }
        return list;
    }

    private static List<String> addNewList(List<String> oldList, List<String> newList){
        List<String> res = new ArrayList<>();
        for (int i = 0; i < oldList.size(); i++) {
            for (int i1 = 0; i1 < newList.size(); i1++) {
                res.add(oldList.get(i) + newList.get(i1));
            }
        }
        return res;
    }
}
