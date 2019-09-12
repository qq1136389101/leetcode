package com.chun.algorithm.n1;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/12 10:32
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(nums, target);
        if(res != null){
            System.out.println(res[0] + "  " + res[1]);
        }else{
            System.out.println("未找到合适的数据");
        }
    }

    /**
     * 思路：要在数组中找到两个数的和是目标值的话，
     * 首先需要确定第一个数，直接使用数组的第一个数，
     * 然后依次用它后面的数与它相加，如果等于目标值，
     * 则直接返回它们的坐标，如果一直找到数组的最后
     * 一个数都没有合适的数，则表示当前的这个数没有
     * 与之匹配的数，放弃它，将它后面的一个数作为第
     * 一个数，再重复之前的操作，直接找完整个数组，
     * 如果都没有合适的数，则表示该数组没有两数之和
     * 与目标值匹配。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int startIndex;
        int endIndex;
        for (int i = 0; i < nums.length - 1; i++) {
            startIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[startIndex] + nums[j] == target){
                    endIndex = j;
                    return new int[]{startIndex, endIndex};
                }
            }
        }
        return null;
    }
}
