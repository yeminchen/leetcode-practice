package Leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {

    public static void main(String[] args) {
        Solution76 s = new Solution76();
        System.out.println(s.minWindow("ADOBECODEBANC", "CD"));

    }
}

class Solution76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        HashMap<Character, Integer> newMap = new HashMap<>();
        int result = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        for (int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            if (countMap.containsKey(a)) {
                int count = countMap.get(a);
                countMap.put(a, ++count);
            } else {
                countMap.put(a, 1);
            }
        }
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char a = s.charAt(j);
            newMap.put(a, newMap.getOrDefault(a, 0) + 1);
            while (containAll(countMap, newMap)) {
                int gap = j - i + 1;
                if (gap < result) {
                    result = gap;
                    ansL = i;
                    ansR = i + result;
                }
                char b = s.charAt(i);
                if (newMap.containsKey(b)) {
                    newMap.put(b, newMap.get(b) - 1);
                }
                i++;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);

    }

    private boolean containAll(HashMap<Character, Integer> countMap, HashMap<Character, Integer> newMap) {
        for (Map.Entry<Character, Integer> characterIntegerEntry : countMap.entrySet()) {
            if (!newMap.containsKey(characterIntegerEntry.getKey())) {
                return false;
            } else {
                int value = characterIntegerEntry.getValue();
                if (newMap.get(characterIntegerEntry.getKey()) < value) {
                    return false;
                }
            }
        }
        return true;
    }
}