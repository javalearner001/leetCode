package com.sun.leet.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 孙凯
 * @Date: 2019/10/30 20:43
 * @Description: 构建杨辉三角
 * @Version 1.0
 */
public class GenerateTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ;i <numRows; i++){
            List<Integer> numList = new ArrayList<>();
            for(int j = 0;j < i + 1;j++){
                if(j == 0 || j == i){
                    numList.add(1);
                }else{
                    numList.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(numList);
        }
        return result;
    }
}
