package com.xxf.medium;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
class LongestPalindrome {

    String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        if (length == 2) {
            return s.charAt(0) == s.charAt(1) ? s : String.valueOf(s.charAt(0));
        }
        int longest = 1;
        int start = 0;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = 1;
            if (i < length - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = 1;
                    start = i;
                    longest = 2;
                }
            }
        }
        for (int l = 3; l <= length; l++) {
            for (int i = 0; i + l - 1 < length; i++) {
                int j = l + i - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                    start = i;
                    longest = l;
                }
            }
        }
        return s.substring(start, start + longest);
    }

    String longestPalindrome2(String s) {
        if (s.length() <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        String revStr = sb.reverse().toString();
        return getLCS(s, revStr);
    }

    private boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        }
        int first = 0, last = s.length() - 1;
        char[] chars = s.toCharArray();
        while (chars[first++] == chars[last--]) {
            if (first >= last) {
                return true;
            }
        }
        return false;
    }

    private String getLCS(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1][len2];
        int max = 0;
        String result = String.valueOf(str1.charAt(0));
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = (i >= 1 && j >= 1) ? dp[i - 1][j - 1] + 1 : 1;
                if (dp[i][j] >= max) {
                    String tmp = str1.substring(i - dp[i][j] + 1, i + 1);
                    if (isPalindrome(tmp)) {
                        max = dp[i][j];
                        result = tmp;
                    }
                }
            }
        }
        return result;
    }

}
