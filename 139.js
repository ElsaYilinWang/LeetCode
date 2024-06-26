// Leetcode 139 Word Break
// Reference: https://leetcode.com/problems/word-break/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {string} s
 * @param {string[]} wordDict
 * @return {boolean}
 */
var wordBreak = function(s, wordDict) {
    if(wordDict == null || wordDict.length === 0) return false;

    const set = new Set(wordDict);
    const dp = Array(s.length + 1).fill(false);
    dp[0] = true;

    for(let end = 1; end <= s.length; end++){
        for (let start = 0; start < end; start ++){
            const w = s.slice(start, end);
            if (dp[start] === true && set.has(w)){
                dp[end] = true;
                break;
            }
        }
    }
    return dp[s.length];
};