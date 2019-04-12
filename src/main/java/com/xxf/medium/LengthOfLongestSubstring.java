package com.xxf.medium;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
class LengthOfLongestSubstring {

    int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int maxLength = 0;
        Queue<Character> queue = new LinkedBlockingQueue<>();
        char[] chars = s.toCharArray();
        int left = chars.length;
        for (char c : chars) {
            if (queue.size() + left <= maxLength) {
                return maxLength;
            }
            if (queue.contains(c)) {
                while (true) {
                    Character ch = queue.poll();
                    if (ch != null && ch.equals(c)) {
                        break;
                    }
                }
            }
            queue.add(c);
            left--;
            int currentLength = queue.size();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

}
