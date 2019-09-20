package com.chun.algorithm.n19;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DemoTest {

    ListNode result;
    ListNode listNode;
    int n;

    public DemoTest(ListNode result, ListNode listNode, int n) {
        this.result = result;
        this.listNode = listNode;
        this.n = n;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){
        ListNode listNode1 = createNode(new int[]{1, 2, 3, 4, 5});
        ListNode res1 = createNode(new int[]{1, 2, 3, 5});

        ListNode listNode2 = createNode(new int[]{1, 2, 3, 4, 5});
        ListNode res2 = createNode(new int[]{1, 2, 3, 4});

        ListNode listNode3 = createNode(new int[]{1, 2, 3});
        ListNode res3 = createNode(new int[]{2, 3});

        return Arrays.asList(new Object[][]{
                {res1, listNode1, 2},
                {res2, listNode2, 1},
                {res3, listNode3, 3},
        });
    }

    @Test
    public void removeNthFromEnd() {
        assertEquals(result, Demo.removeNthFromEnd(listNode, n));
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