package com.sun.leet.array;

/**
 * @Author: 孙凯
 * @Date: 2019/10/23 19:06
 * @Description:
 * @Version 1.0
 */
public class PlusOne {
    public static void main(String[] args) {
        int []nums={9,9,9,9,9,9};
        int []result = plusOne(nums);
        for (int i = 0 ; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
    public static int[] plusOne(int[] digits) {

        for (int j = digits.length - 1; j >=0 ; j--){
            digits[j]++;
            digits[j] = digits[j]%10;
            if (digits[j] != 0){
                return digits;
            }
        }

        int []result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
