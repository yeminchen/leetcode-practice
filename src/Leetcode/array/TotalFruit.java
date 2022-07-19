package Leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TotalFruit {
}

class Solution904 {
    public int totalFruit(int[] fruits) {
        int result = Integer.MIN_VALUE;

        // 题目限定大于等于1
        if (fruits.length <= 2) {
            return fruits.length;
        }

        int fastIndex = 0;
        // slowIndex为起始位置
        int slowIndex = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();
        for (; fastIndex < fruits.length; fastIndex++) {
            basket.put(fruits[fastIndex], basket.getOrDefault(fruits[fastIndex], 0) + 1);
            while (basket.size() > 2) {
                // 删除slowIndex所在位置的元素
                if (basket.containsKey(fruits[slowIndex])) {
                    int num = basket.get(fruits[slowIndex]);
                    if (num > 1) {
                        basket.put(fruits[slowIndex], num - 1);
                    } else {
                        basket.remove(fruits[slowIndex]);
                    }
                }
                slowIndex++;
            }
            int len = fastIndex - slowIndex + 1;
            if (len > result) {
                result = len;
            }

        }
        return result;
    }
}
