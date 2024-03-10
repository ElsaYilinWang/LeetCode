// LeetCode 20 Valid Parentases
// Referece: https://www.youtube.com/watch?v=TaWs8tIrnoA

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '('){

                stack.push(')');

            }else if (c == '['){

                stack.push(']');

            } else if (c == '{'){

                stack.push('}');

            } else if (stack.isEmpty() || stack.pop() != c){

                return false;
            }

            }
            return stack.isEmpty();
        }
        
    }
}