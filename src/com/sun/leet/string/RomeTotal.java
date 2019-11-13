package com.sun.leet.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 孙凯
 * @Date: 2019/10/30 20:10
 * @Description: 罗马数字求和
 *
 * @Version 1.0
 */
public class RomeTotal {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        int total = 0;
        for(int i =0;i<s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if(i > 0 && ( c.equals("X") || c.equals("V") ) && String.valueOf(s.charAt(i - 1)).equals("I")){
                total -= 1;
                total += map.get(s.substring(i-1,i+1));
            }else if(i > 0 && ( c.equals("L") || c.equals("C") ) && String.valueOf(s.charAt(i - 1)).equals("X")){
                total -= 10;
                total += map.get(s.substring(i-1,i+1));
            }else if(i > 0 && ( c.equals("D") || c.equals("M") ) && String.valueOf(s.charAt(i - 1)).equals("C")){
                total -= 100;
                total += map.get(s.substring(i-1,i+1));
            }else{
                total += map.get(c);
            }

        }
        return total;
    }
}
