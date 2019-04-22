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
        StringBuilder sb = new StringBuilder(s);
        String revStr = sb.reverse().toString();
        return getLCS(s, revStr);
    }

    private String getLCS(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1][len2];
        int max = 0, startIndex = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = (i >= 1 && j >= 1) ? dp[i - 1][j - 1] + 1 : 1;
                if (dp[i][j] > max) {
                    max = dp[i][j];
                    startIndex = i - max + 1;
                }
            }
        }
        return str1.substring(startIndex, startIndex + max);
    }

}
