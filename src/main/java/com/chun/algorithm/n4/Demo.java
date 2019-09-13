package com.chun.algorithm.n4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/12 11:05
 */
class Demo {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }


    /**
     * 不考虑时间复杂度的解法，
     * 将两个数组合并，最后取中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }

        Collections.sort(list);
        if(list.size() % 2 == 0){
            return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2.0;
        }else{
            return list.get(list.size() / 2);
        }
    }
}