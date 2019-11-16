package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/11/16 10:32
 * @Description:  旋转数组 采用翻转方法
 * @Version 1.0
 */
public class RotateArray {

    public static void rotate(int []arr,int k){
        k %= arr.length;
        reverse(arr,0,arr.length - 1);
        reverse(arr,0,k - 1);
        reverse(arr,k,arr.length - 1);
    }

    public static void reverse(int [] arr , int start ,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
