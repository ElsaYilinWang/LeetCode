// LeetCode 48 Rotate imgae
// Reference: https://leetcode.com/problems/rotate-image/solutions/1175496/js-python-java-c-easy-4-way-swap-solution-w-explanation/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    
    let n = matrix.length, depth = ~~(n / 2)
    for (let i = 0; i < depth; i++){

        let len = n - 2 * i - 1, opp = n - 1 - i

        for (let j = 0; j < len; j++){
            let temp = matrix[i][i + j]
            matrix[i][i + j] = matrix[opp - j][i]
            matrix[opp - j][i] = matrix[opp][opp - j]
            matrix[opp][opp - j] = matrix[i + j][opp]
            matrix[i + j][opp] = temp
        }
    }
};