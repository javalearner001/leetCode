package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/11/15 21:51
 * @Description:  翻转图像
 * @Version 1.0
 */
public class FlipAndInvertImage {
    public static void main(String[] args) {

    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int [][] result = new int[A.length][];
        for(int i = 0 ; i < A.length ; i++){
            int []arr = A[i];
            for(int j = 0 ; j < arr.length ; j++){
                if(j < arr.length/2){
                    int temp = arr[j];
                    arr[j] = arr[arr.length - j - 1];
                    arr[arr.length - j - 1] = temp;
                }
                if(arr[j] == 0){
                    arr[j] = 1;
                }else{
                    arr[j] = 0;
                }
            }
            result[i] = arr;
        }
        return result;
    }
}
