package com.chun.zuochengyun.bucketsort.code05;

import junit.framework.TestCase;

public class Code01_RecursiveTraversalBTTest extends TestCase {

    public void testPre1() {
        Code01_RecursiveTraversalBT.Node node1 = new Code01_RecursiveTraversalBT.Node(1);
        Code01_RecursiveTraversalBT.Node node2 = new Code01_RecursiveTraversalBT.Node(2);
        Code01_RecursiveTraversalBT.Node node3 = new Code01_RecursiveTraversalBT.Node(3);
        Code01_RecursiveTraversalBT.Node node4 = new Code01_RecursiveTraversalBT.Node(4);
        Code01_RecursiveTraversalBT.Node node5 = new Code01_RecursiveTraversalBT.Node(5);
        Code01_RecursiveTraversalBT.Node node6 = new Code01_RecursiveTraversalBT.Node(6);
        Code01_RecursiveTraversalBT.Node node7 = new Code01_RecursiveTraversalBT.Node(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        Code01_RecursiveTraversalBT.pre(node1);
    }

    public void testIn1() {
        Code01_RecursiveTraversalBT.Node node1 = new Code01_RecursiveTraversalBT.Node(1);
        Code01_RecursiveTraversalBT.Node node2 = new Code01_RecursiveTraversalBT.Node(2);
        Code01_RecursiveTraversalBT.Node node3 = new Code01_RecursiveTraversalBT.Node(3);
        Code01_RecursiveTraversalBT.Node node4 = new Code01_RecursiveTraversalBT.Node(4);
        Code01_RecursiveTraversalBT.Node node5 = new Code01_RecursiveTraversalBT.Node(5);
        Code01_RecursiveTraversalBT.Node node6 = new Code01_RecursiveTraversalBT.Node(6);
        Code01_RecursiveTraversalBT.Node node7 = new Code01_RecursiveTraversalBT.Node(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        Code01_RecursiveTraversalBT.in(node1);
    }

    public void testPos1() {
        Code01_RecursiveTraversalBT.Node node1 = new Code01_RecursiveTraversalBT.Node(1);
        Code01_RecursiveTraversalBT.Node node2 = new Code01_RecursiveTraversalBT.Node(2);
        Code01_RecursiveTraversalBT.Node node3 = new Code01_RecursiveTraversalBT.Node(3);
        Code01_RecursiveTraversalBT.Node node4 = new Code01_RecursiveTraversalBT.Node(4);
        Code01_RecursiveTraversalBT.Node node5 = new Code01_RecursiveTraversalBT.Node(5);
        Code01_RecursiveTraversalBT.Node node6 = new Code01_RecursiveTraversalBT.Node(6);
        Code01_RecursiveTraversalBT.Node node7 = new Code01_RecursiveTraversalBT.Node(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        Code01_RecursiveTraversalBT.pos(node1);
    }
}