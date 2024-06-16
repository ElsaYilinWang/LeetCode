// LeetCode 205 Isomorphic Strings
// Reference:https://leetcode.com/problems/isomorphic-strings/solutions/3121166/easy-js-sol-99-14-acceptable-understandable-approach/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {

    for (let i = 0; i < s.length; i++){

        if (s.indexOf(s[i], i + 1) !== t.indexOf(t[i], i + 1)){

            return false;
        }
    }
    return true;

    // For enquiry about what is indexOf method, go to MDN.

// (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf)
    
};