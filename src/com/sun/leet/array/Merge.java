package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/10/26 19:02
 * @Description: 两个有序数组组合
 * @Version 1.0
 */
public class Merge {
    public static void main(String[] args) {
        int []nums1 = {4,5,6,7,8,9,11,13};
        int []nums2 = {1,3,6,7};
        int []result = merge2(nums1,4,nums2,4);
        for (int i = 0 ;  i<result.length ; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Copy[] = new int[m];
        System.arraycopy(nums1,0,nums1Copy,0,m);

        //two 指针 with nums1Copy and nums2
        int p1_c = 0;
        int p2 = 0;

        //num1 指针
        int p = 0;
        while ((p1_c < nums1Copy.length) && (p2 < nums2.length)){
             nums1[p++] = nums1Copy[p1_c] < nums2[p2] ? nums1Copy[p1_c++] : nums2[p2++];
        }

        if (p1_c < m){
            System.arraycopy(nums1Copy, p1_c, nums1, p1_c + p2, m + n - p1_c - p2);
        }
        if (p2 < n){
            System.arraycopy(nums2, p2, nums1, p1_c + p2, m + n - p1_c - p2);
        }

        return nums1;
    }

    public static int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p = m + n -1;
        while ((p1 >= 0) && (p2 >= 0)){
            nums1[p--] = nums1[p1] < nums2[p2] ? nums2[p2--]:nums1[p1--];
        }
        System.arraycopy(nums2,0,nums1,0,p2+1);
        return nums1;
    }
}
