package com.chun.zuochengyun.bucketsort.code04;

import junit.framework.TestCase;

public class CopyListWithRandomTest extends TestCase {

    public void testCopyListWithRand1() {
        CopyListWithRandom.Node node1 = new CopyListWithRandom.Node(1);
        CopyListWithRandom.Node node2 = new CopyListWithRandom.Node(2);
        CopyListWithRandom.Node node3 = new CopyListWithRandom.Node(3);
        CopyListWithRandom.Node node4 = new CopyListWithRandom.Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.rand = node3;
        node2.rand = node1;
        node3.rand = node1;

        test(node1, CopyListWithRandom.copyListWithRand1(node1));
    }

    public void testCopyListWithRand2() {
        CopyListWithRandom.Node node1 = new CopyListWithRandom.Node(1);
        CopyListWithRandom.Node node2 = new CopyListWithRandom.Node(2);
        CopyListWithRandom.Node node3 = new CopyListWithRandom.Node(3);
        CopyListWithRandom.Node node4 = new CopyListWithRandom.Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.rand = node3;
        node2.rand = node1;
        node3.rand = node1;

        test(node1, CopyListWithRandom.copyListWithRand2(node1));
    }

    private void test(CopyListWithRandom.Node oldNode, CopyListWithRandom.Node newNode){
        if(oldNode == null && newNode == null){
            assert true;
            return;
        }
        while (oldNode != null && oldNode.value == newNode.value && oldNode.rand != newNode.rand && oldNode.rand.value == newNode.rand.value){
            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        if(oldNode != newNode && oldNode.value == newNode.value){
            assert true;
        }
        else{
            assert false;
        }
    }
}