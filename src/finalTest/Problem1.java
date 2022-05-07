package src.finalTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Question1: Given a string s containing
 *
 * just the characters '(', ')', '{', '}', '[' and ']',
 *
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 *
 * Open brackets must be closed in the correct order.
 *
 * Input: s = "()[]{}"
 * Output: true
 */
public class Problem1 {
    public static void main(String[] args) {
        String s = "()[]{}";
        String s1 =  "(]";
        System.out.println(new SolutionOne().isValid(s));
        System.out.println(new SolutionOne().isValid(s1));
    }
}

class SolutionOne{
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty() || map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }else if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == stack.peek()){
                stack.pop();
            }else if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != stack.peek()){
                return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
