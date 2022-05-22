package com.chun.zuochengyun.bucketsort.code05;

/**
 * 递归序每个节点都会到达3次
 *      先序：第一次到达的时候打印
 *      中序：第二次到达的时候打印
 *      后序：第三次到达的时候打印
 */
public class Code01_RecursiveTraversalBT {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int v) {
            value = v;
        }
    }

    /**
     * 先序遍历-递归
     * @param head
     */
    public static void pre(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.value);
        pre(head.left);
        pre(head.right);
    }

    /**
     * 中序遍历-递归
     * @param head
     */
    public static void in(Node head){
        if(head == null){
            return;
        }
        in(head.left);
        System.out.println(head.value);
        in(head.right);
    }

    /**
     * 后序遍历-递归
     * @param head
     */
    public static void pos(Node head){
        if(head == null){
            return;
        }
        pos(head.left);
        pos(head.right);
        System.out.println(head.value);
    }
}
