package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/10/23 19:14
 * @Description:
 * @Version 1.0
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int []nums = {0,0,1,-20,3,3,4,5,-1,-2,100,2,3,4,-5,-7,-8,5,5,6,7,8,-15,8,8,-20,9,9};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];

        for (int i = 1 ; i < nums.length ; i++){
            if (dp[i - 1] >= 0){
                dp[i] = dp[i - 1] + nums[i];
            }else {
                dp[i] = nums[i];
            }
            res = Math.max(res,dp[i]);
        }

        System.out.println("");
        return res;
    }
}
