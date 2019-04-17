package com.xxf.easy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
class LongestCommonPrefix {

    String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int index = 0;
        StringBuilder sb = new StringBuilder();
        boolean notDone = true;
        try {
            while (notDone) {
                char last = strs[0].charAt(index);
                for (int i = 1; i < strs.length; i++) {
                    if (index >= strs[i].length()) {
                        notDone = false;
                        break;
                    }
                    char c = strs[i].charAt(index);
                    if (last != c) {
                        notDone = false;
                        break;
                    }
                    if (i == strs.length - 1) {
                        sb.append(c);
                    }
                }
                index++;
            }
        } catch (Exception e) {

        }
        return sb.toString();
    }

    String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = lcp(result, strs[i]);
            if ("".equals(result)) {
                return "";
            }
        }
        return result;
    }

    private String lcp(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, length);
    }

}
