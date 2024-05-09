// Leetcode 204 Count Primes
// Reference: https://leetcode.com/problems/count-primes/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int countPrimes(int n) {
        boolean[] seen = new boolean[n];
        int ans = 0;
        for (int num = 2; num < n; num ++){
            if (seen[num]) continue;
            ans += 1;
            for (long mult = (long) num * num; mult < n; mult += num){
                seen[(int) mult] = true;
            }
        }
        return ans;
        
    }
}

