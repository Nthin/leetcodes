package com.xxf.easy;

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
        StringBuilder sb = new StringBuilder();
        while (result != null) {
            sb.append(result.val);
            result = result.next;
        }
        assertEquals(807, Integer.parseInt(sb.reverse().toString()));
    }

    @Test
    public void addTwoNumbers2() {
        ListNode result = addTwoNums.addTwoNumbers2(l1, l2);
        StringBuilder sb = new StringBuilder();
        while (result != null) {
            sb.append(result.val);
            result = result.next;
        }
        assertEquals(807, Integer.parseInt(sb.reverse().toString()));
    }
}