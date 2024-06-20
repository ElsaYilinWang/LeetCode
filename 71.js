// LeetCode 71 Simplify Path
// Reference:https://leetcode.com/problems/simplify-path/solutions/3407361/easy-solutions-in-java-python-and-c-look-at-once-with-exaplanation/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {string} path
 * @return {string}
 */
var simplifyPath = function(path) {
    const stack = [];
    const directories = path.split("/");

    for (const dir of directories){
        if (dir === "." || !dir){
            continue;

        } else if (dir === ".."){

            if (stack.length > 0){
                stack.pop();
            }

        } else {
            stack.push(dir);
        }
    }
    return "/" + stack.join("/");
    
};