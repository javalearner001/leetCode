package com.sun.leet.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 孙凯
 * @Date: 2019/11/21 20:17
 * @Description:  重复元素两道题
 * @Version 1.0
 */
public class RepeatNumber {

        public boolean containsDuplicate(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0 ; i < nums.length ; i++){
                if(map.containsKey(nums[i])){
                    return true;
                }
                map.put(nums[i],1);
            }
            return false;
        }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int value = i - map.get(nums[i]);
                if(value < 0){
                    value *= -1;
                }
                if(value <= k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }else{
                map.put(nums[i],i);
            }

        }
        return false;
    }

}
