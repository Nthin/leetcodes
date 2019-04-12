package com.xxf;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public String toReverseString() {
        return parse().reverse().toString();
    }

    @Override
    public String toString() {
        return parse().toString();
    }

    private StringBuilder parse() {
        ListNode tmp = this;
        StringBuilder sb = new StringBuilder();
        while (tmp != null) {
            sb.append(tmp.val);
            tmp = tmp.next;
        }
        return sb;
    }
}
