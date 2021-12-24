package com.chun.zuochengyun.bucketsort.code04;

import java.util.Stack;

/**
 * 判断一个链表是否是回文数
 */
public class IsPalindromeList {

    /**
     * 链表的节点
     */
    public static class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * <p>使用栈的方式实现1</p>
     * 将链表的所有数据依次入栈，然后判断栈里依次取出数据，再判断是否与链表的顺序一致
     *
     * @param node 链表
     * @return boolean
     */
    public static boolean isPalindrome1(Node node){
        if(node.next == null){
            return true;
        }
        Node rootNode = node;
        Stack<Integer> stack = new Stack<>();
        while (node != null){
            stack.push(node.value);
            node = node.next;
        }

        while (rootNode != null && !stack.isEmpty()){
            if(rootNode.value != stack.pop()){
                return false;
            }
            rootNode = rootNode.next;
        }
        return true;
    }

    /**
     * <p>使用栈的方式实现2</p>
     * 将链表的后面一半的数据依次入栈，然后判断栈里依次取出数据，与链表对比，直至栈数据为空
     * ，则表示是回文数
     *
     * @param node 链表
     * @return boolean
     */
    public static boolean isPalindrome2(Node node){
        if(node.next == null){
            return true;
        }
        Node fast = node;
        Node slow = node;


        // 找到中点
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // 将后一半数据放入栈
        Stack<Integer> stack = new Stack<>();
        while (slow.next != null){
            stack.push(slow.next.value);
            slow = slow.next;
        }

        // 依次出栈与原链表开始对比,直到栈为空则表示是回文数
        while (!stack.isEmpty()){
            if(node.value != stack.pop()){
                return false;
            }
            node = node.next;
        }
        return true;
    }

    /**
     * 使用指针的方式实现，空间复杂度 O(1)
     *
     * @param node 链表
     * @return boolean
     */
    public static boolean isPalindrome3(Node node){
        if(node.next == null){
            return true;
        }

        // 找到中点
        Node fast = node;
        Node flow = node;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            flow = flow.next;
        }
        if(fast.next != null){
            flow = flow.next;
        }

        // 将后面一半的链表的指针方向交换
        fast = flow.next;
        flow.next = null;
        Node temp = fast.next;
        while (fast != null){
            fast.next = flow;
            flow = fast;
            fast = temp;
            if(temp != null) {
                temp = temp.next;
            }
        }

        Node last = flow;
        // 双指针前后同时往中间开始移动对比
        boolean res = true;
        while (node != null && flow != null){
            if(node.value != flow.value){
                res = false;
            }
            node = node.next;
            flow = flow.next;
        }

        // 链表还原
        fast = last.next;
        last.next = null;
        while (fast != null){
            temp = fast.next;
            fast.next = last;
            last = fast;
            fast = temp;
        }

        return res;
    }
}
