package com.xxf.medium;

import com.xxf.ListNode;
import com.xxf.medium.AddTwoNums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumsTest {

    private ListNode l1 = new ListNode(2);
    private ListNode l1_1 = new ListNode(4);
    private ListNode l1_2 = new ListNode(3);
    private ListNode l2 = new ListNode(5);
    private ListNode l2_1 = new ListNode(6);
    private ListNode l2_2 = new ListNode(4);
    private AddTwoNums addTwoNums = new AddTwoNums();

    @Before
    public void setUp() {
        l1.next = l1_1;
        l1_1.next = l1_2;
        l2.next = l2_1;
        l2_1.next = l2_2;
    }

    @Test
    public void addTwoNumbers() {
        ListNode result = addTwoNums.addTwoNumbers(l1, l2);
        assertEquals(807, Integer.parseInt(result.toReverseString()));
    }

    @Test
    public void addTwoNumbers2() {
        ListNode result = addTwoNums.addTwoNumbers2(l1, l2);
        assertEquals(807, Integer.parseInt(result.toReverseString()));
    }
}