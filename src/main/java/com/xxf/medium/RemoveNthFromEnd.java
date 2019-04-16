package com.xxf.medium;

import com.xxf.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 */
class RemoveNthFromEnd {

    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int length = 0;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        if (n > length) {
            throw new IllegalArgumentException("IllegalArgument:" + n);
        }
        cur = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        int removeIndex = length - n;
        int index = 0;
        while (cur != null) {
            if (index != 0) {
                prev = prev.next;
            }
            if (index++ == removeIndex) {
                prev.next = cur.next;
                return dummy.next;
            }
            cur = cur.next;
        }
        return dummy;
    }

    ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            second = second.next;
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

}
