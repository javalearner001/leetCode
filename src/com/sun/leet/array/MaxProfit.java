package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/11/15 20:47
 * @Description: 买卖股票的最佳时机 easy
 * @Version 1.0
 */
public class MaxProfit {
    public static void main(String[] args) {

    }

    public static int maxProfitZhengchang(int[] prices){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i < prices.length ; i++){
            if (prices[i] < min){
                min = prices[i];
            }else if ((prices[i] - min) > max){
                max = prices[i] - max;
            }
        }

        return max;
    }

    public static int maxProfitBAOLI(int[] prices) {
        int max = 0;

        for(int i = 0 ; i < prices.length ; i++){

            for(int j = i+1 ; j < prices.length ; j++){
                if(prices[j] > prices[i]){
                    max = Math.max(max,prices[j] - prices[i]);
                }
            }
        }
        return max;
    }
}
