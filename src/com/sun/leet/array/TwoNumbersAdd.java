package com.sun.leet.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 孙凯
 * @Date: 2019/10/19 10:30
 * @Description: 两数之和
 * @Version 1.0
 */
public class TwoNumbersAdd {
    public static void main(String[] args) {
        int[] nums = {2, 7, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11, 15};
        int target = 26 ;
        int[] result = twoSum(nums, target);
        fastNum(nums, target);
        hashNum(nums, target);
        /*System.out.println(result[0]);
        System.out.println(result[1]);*/
    }

    public static int[] twoSum(int[] nums, int target) {
        long t1 = System.nanoTime();

        int [] result = new int[2];
        for (int i = 0 ;i < nums.length ; i++){
            for (int j = i+1;j <nums.length;j++){
                if (nums[i] + nums[j] == target){
                    result[0]= i;
                    result[1]= j;
                }
            }
        }
        long t2 = System.nanoTime();
        System.out.println("自己的方法消耗时间："+ (t2-t1));
        return result;
    }

    public static int[] fastNum(int[] nums, int target) {
        long t1 = System.nanoTime();
        int max = 2047;
        int[] res = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            int ldiff = (target - nums[i]) & max;
            if (res[ldiff] != 0) {
                long t2 = System.nanoTime();
                System.out.println("leet最快的时间："+ (t2-t1));
                return new int[]{res[ldiff] - 1, i};
            }
            res[nums[i] & max] = i + 1;
        }

        return new int[2];
    }

    public static int[] hashNum(int[] nums, int target) {
        int []indexs = new int[2];
        long t1 = System.nanoTime();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = map.get(nums[i]);
                long t2 = System.nanoTime();
                System.out.println("hash的时间："+ (t2-t1));
                return indexs;
            }else {
                map.put(target - nums[i],i);
            }
        }

        return new int[2];
    }
}
