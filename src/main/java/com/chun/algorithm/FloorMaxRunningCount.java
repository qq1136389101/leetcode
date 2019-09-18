package com.chun.algorithm;

import java.util.Map;

/**
 * @Author chun
 * @Date 2019/9/18 11:06
 */
public class FloorMaxRunningCount {

    public static void main(String[] args) {
        System.out.println(fromBottom2Top(4));
    }

    /**
     * 自顶向下，加上备忘录模式
     *
     * @param floor
     * @param map
     * @return
     */
    public static int fromTop2Bottom(int floor, Map<Integer, Integer> map){
        if(floor == 1){
            return 1;
        }
        if(floor == 2){
            return 2;
        }
        if(floor > 2){
            if(map.containsKey(floor)){
                return map.get(floor);
            }else{
                int value = fromTop2Bottom(floor - 1, map) + fromTop2Bottom(floor - 2, map);
                map.put(floor, value);
                return value;
            }
        }
        return 0;
    }


    /**
     * 自底向上
     *
     * @param floor
     * @return
     */
    public static int fromBottom2Top(int floor){
        if(floor < 0){
            return 0;
        }
        if(floor == 1){
            return 1;
        }
        if(floor == 2){
            return 2;
        }
        int a = 1;
        int b = 2;
        int temp = 0;
        for (int i = 0; i < floor - 2; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
