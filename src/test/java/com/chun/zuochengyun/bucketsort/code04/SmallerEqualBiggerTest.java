package com.chun.zuochengyun.bucketsort.code04;

import junit.framework.TestCase;

public class SmallerEqualBiggerTest extends TestCase {

    public void testSmallerEqualBigger1() {
        SmallerEqualBigger.Node node1 = new SmallerEqualBigger.Node(8);
        SmallerEqualBigger.Node node2 = new SmallerEqualBigger.Node(4);
        SmallerEqualBigger.Node node3 = new SmallerEqualBigger.Node(3);
        SmallerEqualBigger.Node node4 = new SmallerEqualBigger.Node(1);
        SmallerEqualBigger.Node node5 = new SmallerEqualBigger.Node(5);
        SmallerEqualBigger.Node node6 = new SmallerEqualBigger.Node(3);
        SmallerEqualBigger.Node node7 = new SmallerEqualBigger.Node(1);
        SmallerEqualBigger.Node node8 = new SmallerEqualBigger.Node(7);
        SmallerEqualBigger.Node node9 = new SmallerEqualBigger.Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        test(SmallerEqualBigger.smallerEqualBigger2(node1, 3), 3);
    }

    public void testSmallerEqualBigger2() {
        SmallerEqualBigger.Node node1 = new SmallerEqualBigger.Node(8);
        SmallerEqualBigger.Node node2 = new SmallerEqualBigger.Node(4);
        SmallerEqualBigger.Node node3 = new SmallerEqualBigger.Node(3);
        SmallerEqualBigger.Node node4 = new SmallerEqualBigger.Node(1);
        SmallerEqualBigger.Node node5 = new SmallerEqualBigger.Node(5);
        SmallerEqualBigger.Node node6 = new SmallerEqualBigger.Node(3);
        SmallerEqualBigger.Node node7 = new SmallerEqualBigger.Node(1);
        SmallerEqualBigger.Node node8 = new SmallerEqualBigger.Node(7);
        SmallerEqualBigger.Node node9 = new SmallerEqualBigger.Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        test(SmallerEqualBigger.smallerEqualBigger2(node1, 3), 3);
    }

    /**
     * 测试链表的值小的是否在前面，等于的是否在中间，大于的是否在右边
     *
     * @param head
     * @param i
     */
    private void test(SmallerEqualBigger.Node head, int i) {
        int type = -1;
        while (head != null){
            int compare = Integer.compare(head.value, i);
            if(compare < type){
                assert false;
            }
            if(compare > type){
                type = compare;
            }
            head = head.next;
        }
        assert true;
    }
}