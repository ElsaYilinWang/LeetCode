// Leetcode 150 Evaluate Reverse olish Notation
// Reference: https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/47430/java-accepted-code-stack-implementation/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int a, b;
        Stack<Integer> S = new Stack<Integer>();
        for (String s : tokens){
            if (s.equals("+")){
                
                S.add(S.pop()+S.pop());

            } else if(s.equals("/")) {
				b = S.pop();
				a = S.pop();
				S.add(a / b);
            
            } else if(s.equals("*")) {
				S.add(S.pop() * S.pop());
			
            } else if(s.equals("-")) {
				b = S.pop();
				a = S.pop();
				S.add(a - b);

			} else {
                S.add(Integer.parseInt(s));
            }
        }
        return S.pop();

        
    }
}
