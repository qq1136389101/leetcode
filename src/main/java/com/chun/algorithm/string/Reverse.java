package com.chun.algorithm.string;

/**
 * 整数反转
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnx13t/
 *
 * @author chun
 * @date 2021/6/25 15:34
 */
public class Reverse {

    public static void main(String[] args) {
        int x = 123;
        int reverse = reverse(x);
    }

    public static int reverse(int x) {

        long res = 0;
        while (x / 10 != 0){
            res = res * 10 +  x % 10;
            x = x / 10;
        }
        res = res * 10 + x % 10;
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
            return 0;
        }
        return res < Integer.MIN_VALUE || res > Integer.MAX_VALUE ? 0 : (int)res;
    }
}
