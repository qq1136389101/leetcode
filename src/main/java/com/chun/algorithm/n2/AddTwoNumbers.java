package com.chun.algorithm.n2;

import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author chun
 * @Date 2019/9/12 11:05
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;

        ListNode res = addTwoNumbers(l1, l2);
    }

    /**
     * 思路：
     * 由低到高同位数的值与进位的值进行相加，通过除法得出进位的数值，
     * 再通过取余得到当前位的最终值，创建一个临时节点变量 temp 用来
     * 保存每一位计算后的值。
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);
        ListNode temp = res;
        int addVal = 0;

        do{
            int l1Val = 0;
            if(l1 != null){
                l1Val = l1.val;
                l1 = l1.next;
            }
            int l2Val = 0;
            if(l2 != null){
                l2Val = l2.val;
                l2 = l2.next;
            }
            int sumVal = l1Val + l2Val + addVal;
            addVal = sumVal / 10;   // 进位的值
            int newVal = sumVal % 10;   // 保留的值

            ListNode child = new ListNode(newVal);
            temp.next = child;
            temp = temp.next;

        }while(l1 != null || l2 != null || addVal != 0);


        return res.next;
    }

}
