package com.chun.zuochengyun.bucketsort.code04;

import junit.framework.TestCase;

public class IsPalindromeListTest extends TestCase {

    public void testIsPalindrome1() {
        IsPalindromeList.Node node1 = new IsPalindromeList.Node(1);
        IsPalindromeList.Node node2 = new IsPalindromeList.Node(2);
        IsPalindromeList.Node node3 = new IsPalindromeList.Node(3);
        IsPalindromeList.Node node4 = new IsPalindromeList.Node(2);
        IsPalindromeList.Node node5 = new IsPalindromeList.Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        assertTrue(IsPalindromeList.isPalindrome1(node1));
        assertTrue(IsPalindromeList.isPalindrome2(node1));
        assertTrue(IsPalindromeList.isPalindrome3(node1));
    }

    public void testIsPalindrome2() {
        IsPalindromeList.Node node1 = new IsPalindromeList.Node(1);
        IsPalindromeList.Node node2 = new IsPalindromeList.Node(2);
        IsPalindromeList.Node node3 = new IsPalindromeList.Node(3);
        IsPalindromeList.Node node4 = new IsPalindromeList.Node(2);
        IsPalindromeList.Node node5 = new IsPalindromeList.Node(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        assertFalse(IsPalindromeList.isPalindrome1(node1));
        assertFalse(IsPalindromeList.isPalindrome2(node1));
        assertFalse(IsPalindromeList.isPalindrome3(node1));
    }

    public void testIsPalindrome3() {
        IsPalindromeList.Node node1 = new IsPalindromeList.Node(1);

        assertTrue(IsPalindromeList.isPalindrome1(node1));
        assertTrue(IsPalindromeList.isPalindrome2(node1));
        assertTrue(IsPalindromeList.isPalindrome3(node1));
    }

    public void testIsPalindrome4() {
        IsPalindromeList.Node node1 = new IsPalindromeList.Node(1);
        IsPalindromeList.Node node2 = new IsPalindromeList.Node(2);
        IsPalindromeList.Node node3 = new IsPalindromeList.Node(3);
        IsPalindromeList.Node node4 = new IsPalindromeList.Node(3);
        IsPalindromeList.Node node5 = new IsPalindromeList.Node(3);
        IsPalindromeList.Node node6 = new IsPalindromeList.Node(2);
        IsPalindromeList.Node node7 = new IsPalindromeList.Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        assertTrue(IsPalindromeList.isPalindrome1(node1));
        assertTrue(IsPalindromeList.isPalindrome2(node1));
        assertTrue(IsPalindromeList.isPalindrome3(node1));
    }
}