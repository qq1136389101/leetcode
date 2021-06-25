package com.chun.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 两个数组的交集 II
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2y0c2/
 *
 * @author chun
 * @date 2021/6/18 17:57
 */
public class Intersect {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] res = intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res = getRes(nums1, nums2);

        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    /**
     * 获取合并后的结果
     * @param nums1
     * @param nums2
     * @return
     */
    public static List<Integer> getRes(int[] nums1, int[] nums2){
        List<Integer> res = new ArrayList();
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int i1 = index; i1 < nums2.length; i1++) {
                if(nums1[i] == nums2[i1]){
                    res.add(nums1[i]);
                    index = i1 + 1;
                    break;
                }
            }
        }
        return res;
    }
}
