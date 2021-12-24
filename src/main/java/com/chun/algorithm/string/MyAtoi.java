package com.chun.algorithm.string;

/**
 * 字符串转换整数 (atoi)
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnoilh/
 *
 * @author chun
 * @date 2021/6/28 11:13
 */
public class MyAtoi {

    public static void main(String[] args) {
        String s = "-2147483648";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        boolean isPositive = true;
        int res = 0;
        boolean isStart = false;

        for (int i = 0; i < s.length(); i++) {
            if(!isStart && s.charAt(i) == ' '){
                continue;
            }
            if(!isStart && s.charAt(i) == '+'){
                isStart = true;
                continue;
            }
            if(!isStart && s.charAt(i) == '-'){
                isStart = true;
                isPositive = false;
                continue;
            }

            if(Character.isDigit(s.charAt(i))){
                isStart = true;
                int digit = s.charAt(i) - '0';
                if(isPositive && (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))){
                    return Integer.MAX_VALUE;
                }
                if(!isPositive && (-res < Integer.MIN_VALUE / 10 || (-res == Integer.MIN_VALUE / 10 && -digit < Integer.MIN_VALUE % 10))){
                    return Integer.MIN_VALUE;
                }
                res = res * 10 + digit;
            }else{
                return isPositive ? res : -res;
            }
        }
        return isPositive ? res : -res;
    }
}
