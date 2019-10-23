package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/10/23 10:38
 * @Description: 二分查找数字位置，不存在的话返回left，即 插入位置
 * @Version 1.0
 */
public class SearchInsert {
    public static void main(String[] args) {
        int []nums = {0,0,1,3,3,4,5,5,6,7,8,8,8,9,9};
        System.out.println(searchInsert(nums,2));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length ;
        while (left < right){
            int mid = (left + right)/2;
            if (nums[mid] == target){
                return mid;
            }else if (target < nums[mid]){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;

    }
}
