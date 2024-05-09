// Leetcode 204 Count Primes
// Reference:https://leetcode.com/problems/count-primes/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
    let seen = new Uint8Array(n), ans = 0
    for (let num = 2; num < n; num++){
        if (seen[num]) continue
        ans++
        for (let mult = num * num; mult < n ; mult += num){
            seen[mult] = 1
        }
    }
    return ans
    
};