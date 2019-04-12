package com.xxf.easy;

import com.xxf.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveNthFromEndTest {

    private ListNode node1 = new ListNode(1);
    private ListNode node2 = new ListNode(2);
    private ListNode node3 = new ListNode(3);
    private ListNode node4 = new ListNode(4);
    private ListNode node5 = new ListNode(5);
    private RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();

    @Before
    public void setUp() {
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }

    @Test
    public void removeNthFromEnd() {
        ListNode result = removeNthFromEnd.removeNthFromEnd(node1, 4);
        Assert.assertEquals("1345", result.toString());
    }

    @Test
    public void removeNthFromEnd2() {
        ListNode result = removeNthFromEnd.removeNthFromEnd2(node1, 4);
        Assert.assertEquals("1345", result.toString());
    }
}