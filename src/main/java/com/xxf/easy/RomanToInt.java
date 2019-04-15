package com.xxf.easy;

import java.util.HashMap;
import java.util.Map;

class RomanToInt {

    int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        char[] chars = s.toCharArray();
        int index = 0;
        int sum = 0;
        while (index < chars.length) {
            String k1 = String.valueOf(chars[index]);
            int v1 = map.get(k1);
            if (index == chars.length - 1) {
                sum += v1;
                break;
            }
            String k2 = String.valueOf(chars[index + 1]);
            String newKey = k1 + k2;
            Integer num = map.get(newKey);
            if (num == null) {
                sum += v1;
                index++;
            } else {
                sum += num;
                index += 2;
            }
        }
        return sum;
    }

}
