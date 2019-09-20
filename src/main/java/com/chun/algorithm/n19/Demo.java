package com.chun.algorithm.n19;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/20 18:07
 */
public class Demo {

    /**
     * 将链表保存为数组
     * 然后通过数组长度找到要删除的节点
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(head);
        while (head.next != null){
            listNodes.add(head.next);
            head = head.next;
        }
        if(n > listNodes.size()){
            return head;
        }
        if(n == listNodes.size()){
            return listNodes.size() > 1 ? listNodes.get(1) : null;
        }
        if(n == 1){
            listNodes.get(listNodes.size() - n - 1).next = null;
        }else{
            listNodes.get(listNodes.size() - n - 1).next = listNodes.get(listNodes.size() - n + 1);
        }
        return listNodes.get(0);
    }
}
