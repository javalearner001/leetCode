package com.sun.leet.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 孙凯
 * @Date: 2019/11/12 19:25
 * @Description: 杨辉三角进阶，两个list实现
 * @Version 1.0
 */
public class GenerateTriangleHard {
    public static void main(String[] args) {
        System.out.println(getRow(11));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> resultList = new ArrayList<>(rowIndex);
        List<Integer> lastList = new ArrayList<>(rowIndex - 1);
        for(int i = 0 ; i < rowIndex; i++){
            resultList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    resultList.add(1);
                } else {
                    resultList.add(lastList.get(j - 1) + lastList.get(j));
                }
            }
            if(i == rowIndex - 1){
                return resultList;
            }
            lastList = resultList;

        }
        return null;
    }
}
