package com.chun.algorithm.n15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/19 17:02
 */
public class Demo {

    /**
     * 暴力枚举法（太费时间）
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3){
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.sort(Integer::compareTo);
                        if(!result.contains(list)){
                            result.add(list);
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }

    /**
     * 双指针法
     *
     * 先排序数组，设置
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3){
            return result;
        }

        // 1. 先排序数组
        Arrays.sort(nums);



        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            // 最小的数是正数，那就不可能有结果了
            if(nums[0] > 0){
                return result;
            }
            left = i + 1;
            right = nums.length - 1;

            if(i > 0 && nums[i] == nums[i-1])continue; // 去重

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(new Integer[]{nums[i], nums[left], nums[right]});
                    result.add(list);

                    // 去重
                    while (left < right && nums[left] == nums[left+1])left++;
                    while (left < right && nums[right] == nums[right-1])right--;

                    left ++;
                    right--;
                }else if(sum > 0) {
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
