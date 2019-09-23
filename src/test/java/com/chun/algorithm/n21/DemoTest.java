package com.chun.algorithm.n21;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    ListNode result;
    ListNode listNode1;
    ListNode listNode2;

    public DemoTest(ListNode result, ListNode listNode1, ListNode listNode2) {
        this.result = result;
        this.listNode1 = listNode1;
        this.listNode2 = listNode2;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){

        return Arrays.asList(new Object[][]{
                {
                    createNode(new int[]{1, 1, 2, 3, 4, 4}),
                    createNode(new int[]{1, 2, 4}),
                    createNode(new int[]{1, 3, 4}),
                },
                {
                        null,
                        createNode(new int[]{}),
                        createNode(new int[]{}),
                },
                {
                        createNode(new int[]{1, 2, 4}),
                        createNode(new int[]{1, 2, 4}),
                        createNode(new int[]{}),
                },
        });
    }

    @Test
    public void mergeTwoLists() {
        ListNode res = Demo.mergeTwoLists(listNode1, listNode2);
        assertEquals(result, res);
    }

    private static ListNode createNode(int[] nums){
        ListNode head = null;
        ListNode prev = new ListNode(0);
        for (int i = 0; i < nums.length; i++) {
            ListNode listNode = new ListNode(nums[i]);
            if(i == 0){
                head = listNode;
            }
            prev.next = listNode;
            prev = prev.next;
        }
        return head;
    }
}