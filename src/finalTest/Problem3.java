package src.finalTest;

import java.util.HashSet;
import java.util.Set;

/**
 * Question 3: Given a string s,
 * find the length of the longest substring without repeating characters.
 */

public class Problem3 {
    public static void main(String[] args) {
        String s = "bbbbb";
        String s1 = "pwwkew";
        System.out.println(new SolutionThree().lengthOfLongestSubstring(s));
        System.out.println(new SolutionThree().lengthOfLongestSubstring(s1));
    }
}

class SolutionThree {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        int len = 0;
        int maxLen = 0;
        while(right <= s.length() - 1){
            if(set.isEmpty()){
                set.add(s.charAt(right));
                right++;
                len++;
            }else if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                len++;
            }else if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    len--;
                    left++;
                }
                set.add(s.charAt(right));
                right++;
                len++;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
