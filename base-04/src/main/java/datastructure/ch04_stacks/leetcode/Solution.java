package datastructure.ch04_stacks.leetcode;

import java.util.Stack;

/**
 * 案例匹配成对的括号（undo操作/程序调用系统栈/括号匹配）
 *
 * @author guodd
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{()}"));
        System.out.println(new Solution().isValid("{)"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(')
                    return false;
                if (c == ']' && topChar != '[')
                    return false;
                if (c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}