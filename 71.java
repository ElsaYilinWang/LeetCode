// LeetCode 71 Simplify Path
// Reference:https://leetcode.com/problems/simplify-path/solutions/3407361/easy-solutions-in-java-python-and-c-look-at-once-with-exaplanation/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();// create a stack to keep track of directories
        String[] directories = path.split("/");// split the path by slash '/'
        for (String dir : directories){// iterate over the directories
            if (dir.equals(".") || dir.isEmpty()){// ignore the current directory '.' and empty directories
                continue;   
            } else if (dir.equals("..")){// go one level up for double period '..'
                if (!stack.isEmpty()) { // if stack is not empty, pop the top element
                    stack.pop();
                }
            } else { // for any other directory, push it to the stack
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack); // join the directories in the stack with slash '/' and add a slash at the beginning
    }
}