// LeetCode 125 Valid Palindrom
// Reference: https://leetcode.com/problems/valid-palindrome/solutions/40238/128ms-100-javascript-solution-super-easy-to-understand/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    // Initialize 2 pointers
    var start = 0;
    var end = input.length - 1;

    while (start < end){
        var s = input.charCodeAt(start)
        var e = input.charCodeAt(end)

        if (!isLetter(s)){
            start++
            continue
        }

        if (!isLetter(e)){
            end--
            continue
        }

        if (toLowerCase(s) != toLowerCase(e)){
            return false
        }

        start++
        end--
    }
    return true
};

var isLetter = function(code){
    if ( (code >= 48 && code <= 57) // numbers
        || (code >= 65 && code <= 90) // uppercase
        || (code >= 97 && code <= 122) // lowercase
    ) {
        return true

    } else {

        return false

    }
};

var toLowerCase = function(code){
    if (code >= 65 && code <= 90){

        return code + 32
    } else {
        return code;
    }
}


// Reference:https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150

const isPalindrome2 = s => {
    s = s.toLowerCase().replace(/[^a-z0-9]/gi, '');

    for (let i = 0, j = s.length - 1; i <= j; i++, j--){
        if (s.charAt(i) !== s.charAt(j)) return false;
    }

    return true;
}