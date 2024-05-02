// Leetcode 150 Evaluate Reverse olish Notation
// Reference: https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/486566/javascript-stack-solution/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {
    let stack = [];
    let ops = {
        '+': (a, b) => a + b,
        '-': (a, b) => a - b,
        '*': (a, b) => a * b,
        '/': (a, b) => a / b >= 0 ? Math.floor(a/b): Math.ceil(a/b)
    };

    for (let t of tokens){
        if (ops[t]){
            let top = stack.pop();
            let second = stack.pop();
            stack.push(ops[t](second, top));
        } else {
            stack.push(Number(t));
        }
    }
    return stack.pop();
    
};