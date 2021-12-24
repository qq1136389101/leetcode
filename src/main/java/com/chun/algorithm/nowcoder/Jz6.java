package com.chun.algorithm.nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <p>JZ6 从尾到头打印链表</p>
 *
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 *
 * @author chun
 * @date 2021/12/24 14:42
 */
public class Jz6 {


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 使用栈的方式
     *
     * @param listNode 链表
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode == null){
            return res;
        }

        // 入栈
        Stack<Integer> stack = new Stack<>();
        stack.push(listNode.val);
        while (listNode.next != null){
            listNode = listNode.next;
            stack.push(listNode.val);
        }

        // 出栈
        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }

    /**
     * 反转链表
     *
     * @param listNode 链表
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode == null){
            return res;
        }
        if(listNode.next == null){
            res.add(listNode.val);
            return res;
        }

        // 反转链表
        ListNode node1 = listNode;
        ListNode node2 = listNode.next;
        ListNode node3 = listNode.next.next;
        node1.next = null;
        while (node2 != null){
            node2.next = node1;
            node1 = node2;
            node2 = node3;
            if(node3 != null){
                node3 = node3.next;
            }
        }

        // 遍历
        res.add(node1.val);
        while (node1.next != null){
            node1 = node1.next;
            res.add(node1.val);
        }
        return res;
    }
}
