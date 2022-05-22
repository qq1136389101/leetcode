package com.chun.algorithm.n605;

class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }
        int maxCount = 0;
        int index = 0;
        while (index < flowerbed.length){
            if(flowerbed[index] == 0){
                if(index == flowerbed.length - 1 || flowerbed[index + 1] == 0){
                    maxCount++;
                    if(maxCount >= n){
                        return true;
                    }
                }else{
                    index++;
                }
            }
            index += 2;
        }
        return false;
    }
}