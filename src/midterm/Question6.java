package src.midterm;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
    public static void main(String[] args) {
        String s = "abcdabda";
        System.out.println(new Solution6().lengthOfLongest(s));
    }
}

class Solution6 {
    public int lengthOfLongest(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length();

        int head = -1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            } else {
                while (!set.contains(s.charAt(head + 1)) && head + 1 < n) {
                    set.add(s.charAt(head + 1));
                    head = head + 1;
                }

                result = (head - i + 1 > result) ? (head - i + 1) : result;
            }
        }
        return result;
    }
}
