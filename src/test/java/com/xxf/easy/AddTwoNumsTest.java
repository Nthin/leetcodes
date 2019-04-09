package com.xxf.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumsTest {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        ListNode l1_1 = new ListNode(4);
        ListNode l1_2 = new ListNode(3);
        l1.next = l1_1;
        l1_1.next = l1_2;
        ListNode l2 = new ListNode(5);
        ListNode l2_1 = new ListNode(6);
        ListNode l2_2 = new ListNode(4);
        l2.next = l2_1;
        l2_1.next = l2_2;
        AddTwoNums addTwoNums = new AddTwoNums();
        ListNode result = addTwoNums.addTwoNumbers(l1, l2);
        StringBuilder sb = new StringBuilder();
        while (result != null) {
            sb.append(result.val);
            result = result.next;
        }
        assertEquals(807, Integer.parseInt(sb.reverse().toString()));
    }
}