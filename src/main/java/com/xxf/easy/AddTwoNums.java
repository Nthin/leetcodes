package com.xxf.easy;

import java.math.BigInteger;
import java.util.Stack;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
class AddTwoNums {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = dummy;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        BigInteger num1 = trans2Num(l1);
        BigInteger num2 = trans2Num(l2);
        BigInteger result = num1.add(num2);
        String resultStr = result.toString();
        ListNode head = new ListNode(0);
        ListNode cur = head;
        char[] chars = resultStr.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            cur.next = new ListNode(Integer.parseInt(chars[i] + ""));
            cur = cur.next;
        }
        return head.next;
    }

    private static BigInteger trans2Num(ListNode l) {
        Stack<Integer> stack = new Stack<>();
        ListNode tmp = l;
        while (tmp != null) {
            stack.push(tmp.val);
            tmp = tmp.next;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return new BigInteger(sb.toString());
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
