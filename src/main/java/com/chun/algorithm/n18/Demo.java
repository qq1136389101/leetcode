package com.chun.algorithm.n18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/20 15:50
 */
public class Demo {

    /**
     * 先排序
     * 然后确定两个数的所有情况
     * 最后根据双指针找出4数和与目标值相等情况
     *
     * @param nums
     * @param target
     * @return
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4){
            return res;
        }

        // 排序
        Arrays.sort(nums);

        // i 表示第一个数
        // j 表示第二个数
        for (int i = 0; i < nums.length-3; i++) {
            // 去重
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length-2; j++) {
                // 去重, 这里 j 必须不是第一个 j 才能跳过
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = nums.length - 1;
                while (left < right){
                    int num = nums[i] + nums[j] + nums[left] + nums[right];
                    if(num == target){
                        res.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[left], nums[right]}));
                        left ++;
                        right --;

                        // 去重
                        while (left <= right && nums[left] == nums[left-1]){
                            left ++;
                        }
                        while (left <= right && nums[right] == nums[right+1]){
                            right --;
                        }
                    }else if(num > target){
                        right --;
                    }else{
                        left ++;
                    }
                }
            }
        }
        return res;
    }
}
