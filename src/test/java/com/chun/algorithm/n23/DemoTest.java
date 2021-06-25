package com.chun.algorithm.n23;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DemoTest {

    ListNode result;
    ListNode[] listNodes;

    public DemoTest(ListNode result, ListNode[] listNodes) {
        this.result = result;
        this.listNodes = listNodes;
    }

    @Parameterized.Parameters
    public static Collection<Object> t(){

        return Arrays.asList(new Object[][]{
                {
                        createNode(new int[]{1, 1, 1, 2, 3, 4, 4, 9}),
                        new ListNode[]{
                                createNode(new int[]{1, 2, 4}),
                                createNode(new int[]{1, 3, 4}),
                                createNode(new int[]{1, 9})
                        },
                },
        });
    }

    @Test
    public void mergeKLists() {

        ListNode res = Demo.mergeKLists(listNodes);
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