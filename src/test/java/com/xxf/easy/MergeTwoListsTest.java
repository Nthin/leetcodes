package com.xxf.easy;

import com.xxf.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoListsTest {

    private MergeTwoLists mergeTwoLists = new MergeTwoLists();

    @Test
    public void mergeTwoLists() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        l1.next = l2;
        l2.next = l3;
        ListNode result = mergeTwoLists.mergeTwoLists(n1, l1);
        Assert.assertEquals("112334", result.toString());
    }
}