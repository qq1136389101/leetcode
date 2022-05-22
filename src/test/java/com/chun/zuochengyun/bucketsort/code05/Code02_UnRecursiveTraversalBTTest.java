package com.chun.zuochengyun.bucketsort.code05;

import junit.framework.TestCase;

public class Code02_UnRecursiveTraversalBTTest extends TestCase {

    public void testPre() {
        Code02_UnRecursiveTraversalBT.Node node1 = new Code02_UnRecursiveTraversalBT.Node(1);
        Code02_UnRecursiveTraversalBT.Node node2 = new Code02_UnRecursiveTraversalBT.Node(2);
        Code02_UnRecursiveTraversalBT.Node node3 = new Code02_UnRecursiveTraversalBT.Node(3);
        Code02_UnRecursiveTraversalBT.Node node4 = new Code02_UnRecursiveTraversalBT.Node(4);
        Code02_UnRecursiveTraversalBT.Node node5 = new Code02_UnRecursiveTraversalBT.Node(5);
        Code02_UnRecursiveTraversalBT.Node node6 = new Code02_UnRecursiveTraversalBT.Node(6);
        Code02_UnRecursiveTraversalBT.Node node7 = new Code02_UnRecursiveTraversalBT.Node(7);
        Code02_UnRecursiveTraversalBT.Node node8 = new Code02_UnRecursiveTraversalBT.Node(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.left = node8;

//        Code02_UnRecursiveTraversalBT.pre1(node1);
        Code02_UnRecursiveTraversalBT.pre2(node1);
    }

    public void testIn() {
        Code02_UnRecursiveTraversalBT.Node node1 = new Code02_UnRecursiveTraversalBT.Node(1);
        Code02_UnRecursiveTraversalBT.Node node2 = new Code02_UnRecursiveTraversalBT.Node(2);
        Code02_UnRecursiveTraversalBT.Node node3 = new Code02_UnRecursiveTraversalBT.Node(3);
        Code02_UnRecursiveTraversalBT.Node node4 = new Code02_UnRecursiveTraversalBT.Node(4);
        Code02_UnRecursiveTraversalBT.Node node5 = new Code02_UnRecursiveTraversalBT.Node(5);
        Code02_UnRecursiveTraversalBT.Node node6 = new Code02_UnRecursiveTraversalBT.Node(6);
        Code02_UnRecursiveTraversalBT.Node node7 = new Code02_UnRecursiveTraversalBT.Node(7);
        Code02_UnRecursiveTraversalBT.Node node8 = new Code02_UnRecursiveTraversalBT.Node(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.left = node8;
        Code02_UnRecursiveTraversalBT.in(node1);
    }

    public void testPos() {
    }
}