import java.io.*;
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0;
        int end = 0;
        int n = s.length();
        int curr = 0;
        while(end<n) {
            curr+=(int)Math.abs(s.charAt(end)-t.charAt(end));
            if(curr>maxCost) {
                curr-=(int)Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            end++;
        }
        return end - start;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.equalSubstring("abcd", "bcdf", 3)); // 3
        System.out.println(solution.equalSubstring("abcd", "cdef", 3)); // 1
    }
}