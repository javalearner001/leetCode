package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/11/15 21:34
 * @Description:  买卖股票的最佳时机II
 * @Version 1.0
 */
public class MaxProfitII {
    public static void main(String[] args) {

    }
    public static int getmax(int [] arr){
        int max = 0;

        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] > arr[i - 1]){
                max += arr[i] - arr[i - 1];
            }
        }
        return max;
    }
}
