// LeetCode 13 Roman to Integer
// Refeerence: https://leetcode.com/problems/roman-to-integer/solutions/2706813/js-hash-table-with-exlanation/?envType=study-plan-v2&envId=top-interview-150

// largest to smalles: add them up
// smaller before larger: subtract smaller

/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const sym = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }

    let result = 0;

    for (let i = 0; i < s.length; i++){
        const cur = sym[s[i]];
        const next = sym[s[i+1]];

        if (cur < next){
            result += next - cur;
            i++;
        } else {
            result += cur;
        }
    }
    return result;
};