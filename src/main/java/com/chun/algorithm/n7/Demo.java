package com.chun.algorithm.n7;

import java.util.Stack;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/16 15:22
 */
public class Demo {

    public static void main(String[] args) {
        int i = -2147483412;
        System.out.println(reverse2(i));
    }

    /**
     * 转换为字符串解法 -- 复杂低效
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int sign = 1;
        if(x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE){
            return 0;
        }
        if(x < 0){
            sign = -1;
        }

        x = Math.abs(x);
        char[] chars = String.valueOf(x).toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        long longRes = Long.parseLong(stringBuilder.toString());
        if(longRes < Integer.MIN_VALUE || longRes > Integer.MAX_VALUE){
            return 0;
        }
        int res = Integer.parseInt(stringBuilder.toString());
        return sign == -1 ? -res : res;
    }

    public static int reverse2(int x) {
        int temp = x;
        int res = 0;
        while (temp != 0){
            int prop = temp % 10;
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && prop > 7)){
                return 0;
            }
            if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && prop < -8)){
                return 0;
            }
            res = res * 10 + prop;
            temp = temp / 10;
        }
        return res;

    }
}
