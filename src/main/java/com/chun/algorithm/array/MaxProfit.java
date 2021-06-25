package com.chun.algorithm.array;

/**
 * 买卖股票的最佳时机 II\
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 *
 * @author chun
 * @date 2021/6/18 11:43
 */
public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}) == 7);
        System.out.println(maxProfit(new int[]{1,2,3,4,5}) == 4);
        System.out.println(maxProfit(new int[]{7,6,4,3,1}) == 0);
    }

    public static int maxProfit(int[] prices) {
        int startIndex = -1;
        int earn = 0;
        for (int i = 0; i < prices.length-1; i++) {
            // 涨
            if(prices[i] < prices[i+1]){
                if(startIndex == -1){
                    startIndex = i;
                }
            }
            // 跌
            else{
                if(startIndex != -1){
                    earn += prices[i] - prices[startIndex];
                    startIndex = -1;
                }
            }
        }

        if(startIndex != -1){
            earn += prices[prices.length-1] - prices[startIndex];
        }
        return earn;
    }
}
