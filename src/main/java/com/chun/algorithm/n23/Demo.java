package com.chun.algorithm.n23;

import java.util.List;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/23 17:44
 */
public class Demo {

    /**
     *
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        int index = smallListNodeIndex(lists);
        if(lists.length == 1){
            return lists[0];
        }

        lists[index] = lists[index].next;
        lists[index].next = mergeKLists(lists);
        return null;
    }

    private static int smallListNodeIndex(ListNode[] listNodes){
        int index = 0;
        int minVal = 0;
        for (int i = 0; i < listNodes.length; i++) {
            if(i == 0){
                minVal = listNodes[i].val;
            }

            if(listNodes[i].val < minVal){
                minVal = i;
            }
        }
        return minVal;
    }
}
