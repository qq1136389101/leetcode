package com.chun.algorithm.nowcoder;

import junit.framework.TestCase;

import java.util.ArrayList;

public class Jz6Test extends TestCase {

    public void testPrintListFromTailToHead() {
        Jz6.ListNode node1 = new Jz6.ListNode(1);
        Jz6.ListNode node2 = new Jz6.ListNode(2);
        Jz6.ListNode node3 = new Jz6.ListNode(3);
        node1.next = node2;
        node2.next = node3;

//        ArrayList<Integer> integers = Jz6.printListFromTailToHead1(node1);
        ArrayList<Integer> integers = Jz6.printListFromTailToHead2(node1);
    }
}
