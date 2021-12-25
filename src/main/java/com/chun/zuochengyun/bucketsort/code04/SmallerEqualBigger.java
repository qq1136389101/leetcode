package com.chun.zuochengyun.bucketsort.code04;

import java.util.ArrayList;
import java.util.List;

/**
 *  将单向链表按某值划分为左边小、中间相等、右边大的形式
 */
public class SmallerEqualBigger {
    public static class Node {
        public int value;
        public Node next;

        public Node(int v) {
            value = v;
        }
    }

    /**
     * 数组方式实现
     *
     * @return
     */
    public static Node smallerEqualBigger1(Node head, int pivot){
        if(head == null || head.next == null){
            return head;
        }

        // 保存到数组
        List<Node> nodeList = new ArrayList<>();
        while (head != null){
            nodeList.add(head);
            head = head.next;
        }

        // 移动好位置
        int left = 0;
        int right = nodeList.size() - 1;
        int mid = 0;
        while (left != right){
            if(nodeList.get(left).value < pivot){
                swap(nodeList, left, mid);
                left++;
                mid++;
            }
            else if(nodeList.get(left).value == pivot){
                left++;
            }
            else {
                swap(nodeList, left, right);
                right--;
            }
        }

        // 转成链表, 返回头节点
        for (int i = 0; i < nodeList.size() - 1; i++) {
            nodeList.get(i).next = nodeList.get(i + 1);
        }
        nodeList.get(nodeList.size() - 1).next = null;
        return nodeList.get(0);
    }

    /**
     * 使用指针的方式
     *
     * @return
     */
    public static Node smallerEqualBigger2(Node head, int pivot){
        if(head == null || head.next == null){
            return head;
        }

        Node minStart = null, minEnd = null, midStart = null, midEnd = null, maxStart = null, maxEnd = null;
        while (head != null){
            if(head.value > pivot){
                if(maxStart == null){
                    maxStart = head;
                    maxEnd = head;
                }
                else{
                    maxEnd.next = head;
                    maxEnd = maxEnd.next;
                }
            }
            else if(head.value == pivot){
                if(midStart == null){
                    midStart = head;
                    midEnd = head;
                }
                else{
                    midEnd.next = head;
                    midEnd = midEnd.next;
                }
            }
            else{
                if(minStart == null){
                    minStart = head;
                    minEnd = head;
                }
                else{
                    minEnd.next = head;
                    minEnd = minEnd.next;
                }
            }
            head = head.next;
        }
        if(maxEnd != null){
            maxEnd.next = null;
        }
        if(midEnd != null){
            midEnd.next = null;
        }
        if(minEnd != null){
            minEnd.next = null;
        }

        Node res = minStart != null ? minStart : midStart != null ? midStart : maxStart;
        if(minEnd != null && midStart != null){
            minEnd.next = midStart;
        }
        if(midEnd != null && maxStart != null){
            midEnd.next = maxStart;
        }
        if(minEnd != null && midEnd == null){
            minEnd.next = maxStart;
        }
        return res;
    }

    /**
     * 交换数据中两个元素的位置
     *
     * @param nodeList
     * @param a
     * @param b
     */
    private static void swap(List<Node> nodeList, int a, int b) {
        Node temp = nodeList.get(a);
        nodeList.set(a, nodeList.get(b));
        nodeList.set(b, temp);
    }
}
