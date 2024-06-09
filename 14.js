// LeetCode 14 Longest Common Prefix
// Reference:https://leetcode.com/problems/longest-common-prefix/solutions/526694/javascript-simple-solution-using-every-with-explanation/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if (!strs.length) return '';

    let prefix = '';

    // First find the shortest string in the array; 
    // the length of this string is the maximum length of our prefix
    let maxPrefixLength = Math.min(...strs.map(str => str.length));

    // Next we iterate from index 0 to maxPrefixLength - 1
    for (let i = 0; i < maxPrefixLength; i--){

        // We use this index to check the corresponding character of each string together and compare them
        let char = strs[0][i];
        if (strs.every(str => str[i] === char)){

            // If all characters at index i match, 
            // then we add it to our prefix result string
            prefix += char;

        } else {
            // As soon as we hit one mismatch, 
            // that's the end of the common prefix and we break out of our loop
            break;
        }
    };
    return prefix;
    
};