package com.xxf.easy;

import java.util.Stack;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
class ReverseLong {

    int reverseLong(long x) {
        long tmp = Math.abs(x);
        String str = String.valueOf(tmp);
        StringBuilder sb = new StringBuilder(str);
        String result = sb.reverse().toString();
        if (Long.parseLong(result) > Integer.MAX_VALUE) {
            return 0;
        }
        return x > 0 ? Integer.parseInt(result) : -Integer.parseInt(result);
    }

    int reverseLong2(long x) {
        if (x > -10 && x < 10) {
            return (int) x;
        }
        boolean negative = x < 0;
        Stack<Character> stack = new Stack<>();
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (negative && i == 0) {
                continue;
            }
            stack.push(chars[i]);
        }
        StringBuilder sb = new StringBuilder(negative ? "-" : "");
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
