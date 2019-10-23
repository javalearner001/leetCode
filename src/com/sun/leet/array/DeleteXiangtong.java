package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/10/19 17:04
 * @Description: 删除排序数组中的重复项
 *  结题思路，快指针和慢指针的双重指针
 * @Version 1.0
 */
public class DeleteXiangtong {
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1;j< nums.length ; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
