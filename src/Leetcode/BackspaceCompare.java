package Leetcode;

public class BackspaceCompare {

    public static void main(String[] args) {
        Solution844 solution844 = new Solution844();
        System.out.println(solution844.backspaceCompare("abc#", "ab#c"));
    }
}

class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        int sl = s.length(); int tl = t.length();
        int i = sl - 1; int j = tl - 1;
        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS ++;
                    i --;
                } else if (skipS > 0) {
                    i --;
                    skipS --;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT ++;
                    j --;
                } else if (skipT > 0) {
                    j --;
                    skipT --;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else if (i >= 0 || j >= 0) {
                return false;
            }
            i--;
            j--;

        }
        return true;
    }
}