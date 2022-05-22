package com.chun.zuochengyun.bucketsort.code05;

import java.util.Stack;

/**
 *  任何递归函数都可以改成非递归  压栈实现
 *      先序：头节点放到栈中
 *           while
 *            1. 弹出就打印
 *            2. 如有右孩子压入右孩子
 *            3. 如有左孩子压入左孩子
 *      后序：
 *            方法一：头 右 左 逆着看 （1.弹出 2.压入左 3.压入右）
 *            每次弹出不打印，而是放到另一个栈中，最后弹出打印辅助栈
 *            方法二：
 *            利用两个引用。h指向刚打印的节点，c指向当前节点
 *            左树没处理，先压入左树；左树刚处理完，压入右树；否则处理当前节点
 *      中序：
 *            1. 整条左边界依次入栈
 *            2. 1无法继续了，弹出就打印，然后来到右树位置继续1
 */
public class Code02_UnRecursiveTraversalBT {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int v) {
            value = v;
        }
    }

    /**
     * 先序遍历1
     *
     * @param head
     */
    public static void pre1(Code02_UnRecursiveTraversalBT.Node head){
        if(head == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null){
            System.out.println(cur.value);
            stack.push(cur);
            if(cur.left != null){
                cur = cur.left;
            }else{
                while (cur.right == null && !stack.isEmpty()){
                    cur = stack.pop();
                }
                cur = cur.right;
            }
        }
    }

    /**
     * 先序遍历2
     *
     * @param head
     */
    public static void pre2(Code02_UnRecursiveTraversalBT.Node head){
        if(head == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.value);
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
    }

    /**
     * 中序遍历
     * 1. 先遍历左节点，依次进栈
     * 2. 当左节点没有时，出栈打印，并使用右子树进行此操作
     *
     * @param head
     */
    public static void in(Code02_UnRecursiveTraversalBT.Node head){
        if(head == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node cur = head;

        while (!stack.isEmpty() || cur != null){
            // 先遍历左节点，依次进栈
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            // 当左节点没有时，出栈打印，并使用右子树进行此操作
            else{
                cur = stack.pop();
                System.out.println(cur.value);
                cur = cur.right;
            }
        }
    }

    /**
     * 后序遍历
     * @param head
     */
    public static void pos(Code02_UnRecursiveTraversalBT.Node head){
        if(head == null){
            return;
        }
    }
}
