// LeetCode 274 H-index
// Reference: https://leetcode.com/problems/h-index/solutions/4908801/clean-and-well-explained-solution-beats-100-runtime/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} citations
 * @return {number}
 */
var hIndex = function(citations) {
    let n = citations.length;

    //sort citations array in ascending order
    citations.sort((a, b) => a - b);

    for (let i = 0; i < n; i++){

        if (citations[i] >= n - i){
            return n - i;
        }
    }
    
    return 0;
    
};