package com.chun.algorithm.string;

import java.util.*;

/**
 * 字符串中的第一个唯一字符
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn5z8r/
 *
 * @author chun
 * @date 2021/6/25 16:16
 */
public class FirstUniqChar {

    public static void main(String[] args) {
        String s = "aabb";
        int i = firstUniqChar(s);
    }

    public static int firstUniqChar(String s) {
        int[] dict = new int[26];
        List<Character> characters = new ArrayList<>();
        char firstChar = s.charAt(0);
        characters.add(firstChar);
        int index = firstChar - 'a';
        dict[index] = -1;

        for (int i = 1; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            if(dict[index] == 0){
                dict[index] = i;
                characters.add(s.charAt(i));
            }else{
                dict[index] = -1;
                characters.remove(new Character(s.charAt(i)));
            }
        }
        return characters.size() == 0 ? -1 : dict[characters.get(0) - 'a'] == -1 ? 0 : dict[characters.get(0) - 'a'];
    }
}
