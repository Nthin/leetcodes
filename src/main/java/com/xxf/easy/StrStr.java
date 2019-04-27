package com.xxf.easy;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从 0 开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 */
class StrStr {

    int strStr(String haystack, String needle) {
        int hlength = haystack.length();
        int nlength = needle.length();
        if (nlength == 0) {
            return 0;
        }
        if (hlength == 0 || hlength < nlength) {
            return -1;
        }
        if (hlength == nlength) {
            return haystack.equals(needle) ? 0 : -1;
        }
        char[] hs = haystack.toCharArray();
        char[] ns = needle.toCharArray();
        int i = 0, j = 0;
        while (i < hlength && j < nlength) {
            if (hs[i] == ns[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == nlength) {
            return i - j;
        } else {
            return -1;
        }
    }

}
