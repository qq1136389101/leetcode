package com.chun.algorithm.n22;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/23 15:32
 */
public class Demo {

    /**
     *
     * (())
     * ()()
     *
     * ()
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
//        List<String> ans = new ArrayList();
//        backtrack(ans, "", 0, 0, n);
//        return ans;

//        List<String> ans = new ArrayList();
//        if (n == 0) {
//            ans.add("");
//        } else {
//            for (int c = 0; c < n; ++c)
//                for (String left: generateParenthesis(c))
//                    for (String right: generateParenthesis(n-1-c))
//                        ans.add("(" + left + ")" + right);
//        }
//        return ans;

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < i; i1++) {
            }
        }
        return null;
    }

    public static void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }
}
