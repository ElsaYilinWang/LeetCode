// LeetCode 155 Min Stack
// References:https://leetcode.com/problems/min-stack/solutions/49031/share-my-java-solution-with-only-one-stack/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

class MinStack {

    long min;
    Stack<Long> stack;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
        
    
    public void push(int val) {

        if (stack.isEmpty()){

            stack.push(0L);
            min = val;

        } else {
            stack.push(val - min);

            if (val < min) min = val;

        }
        
    }
    
    public void pop() {

        if (stack.isEmpty()) return;
        long pop = stack.pop();

        if (pop < 0) 
            min = min - pop;
    // if (p < 0), the popped value is the min
            // Recall p is added by this statement: stack.push(x - min);
            // So, p = x - old_min
            // old_min = x - p
            // again, if (p < 0), x is the min so:
            // old_min = min - p
        
    }
    
    public int top() {
        long top = stack.peek();
        if (top > 0){
            return (int) (top + min);
        } else {
            return (int) (min);
        }
        
    }
    
    public int getMin() {
        return (int) min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */