// LeetCode 383 Ransom Note
// Reference: https://leetcode.com/problems/ransom-note/solutions/385887/javascript-solution/?envType=study-plan-v2&envId=top-interview-150


/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {

    const map = {};
    for (let letter of magazine){
        if (!map[letter]){
            map[letter] = 0;
        }
        map[letter]++;
    }

    for (let letter of ransomNote){
        if(!map[letter]){
            return false;
        }
        map[letter]--;
    }
    return true;
    
};