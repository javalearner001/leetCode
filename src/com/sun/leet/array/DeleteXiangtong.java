package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/10/19 17:04
 * @Description: 删除排序数组中的重复项
 * @Version 1.0
 */
public class DeleteXiangtong {
    public int removeDuplicates(int[] nums) {
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
        return nums.length;
    }
}
