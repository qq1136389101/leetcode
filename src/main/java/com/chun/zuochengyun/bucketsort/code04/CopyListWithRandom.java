package com.chun.zuochengyun.bucketsort.code04;

import java.util.HashMap;

/**
 * 一种特殊的单链表节点类型（含rand指针，指向表中任一节点，也可以指向null）
 *  给定一个无环单链表的头节点head，请完成这个链表的复制
 *  要求：时间复杂度O(N) 额外空间复杂度O(1)
 */
public class CopyListWithRandom {

    public static class Node {
        public int value;
        public Node next;
        public Node rand;

        public Node(int v) {
            value = v;
        }
    }

    /**
     * 使用哈希表
     * 遍历旧链表创建新节点，并将以旧节点为 key,新节点作为 value 保存到哈希表中。
     * 最后通过哈希表设置<code>rand</code>节点
     *
     * @param head 链表
     * @return 复制后的新链表
     */
    public static Node copyListWithRand1(Node head) {
        if(head == null){
            return null;
        }

        // 根据链表创建新节点，并建立旧节点和新节点的映射
        HashMap<Node, Node> map = new HashMap();
        Node cur = head;
        while (cur != null){
            map.put(cur, new Node(cur.value));
            cur = cur.next;
        }

        // 根据哈希表设置 rand
        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }

    /**
     * <p>不适用哈希表</p>
     *
     * <p>1. 先遍历链表。创建新节点，将旧节点指向对应的新节点</p>
     * <p>2. 绑定 rand 节点</p>
     * <p>3. 绑定 next 节点</p>
     *
     * @param head 链表
     * @return 复制后的新链表
     */
    public static Node copyListWithRand2(Node head) {
        if(head == null){
            return null;
        }

        // 复制旧节点，将旧节点指向对应的新节点
        Node cur = head;
        Node next;
        while (cur != null){
            next = cur.next;
            cur.next = new Node(cur.value);
            cur.next.next = next;
            cur = next;
        }

        // 绑定 rand 节点
        cur = head;
        Node newCur = cur.next;
        while (cur != null){
            newCur.rand = cur.rand != null ? cur.rand.next : null;
            cur = cur.next.next;
            newCur = cur != null ? cur.next : null;
        }

        // 绑定 next
        cur = head;
        newCur = head.next;
        Node newHead = newCur;
        while (newCur.next != null){
            cur.next = newCur.next;
            newCur.next = newCur.next.next;
            cur = cur.next;
            newCur = cur.next;
        }

        return newHead;
    }
}
