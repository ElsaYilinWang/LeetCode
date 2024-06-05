// LeetCode 274 H-index
// Reference: https://leetcode.com/problems/h-index/solutions/70768/java-bucket-sort-o-n-solution-with-detail-explanation/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int hIndex(int[] citations) {

        int n = citations.length;
        int[] buckets = new int[n + 1];

        for(int c : citations){

            if (c >= n){
                buckets[n]++;

            } else {
                buckets[c]++;
            }
        }   
        int count = 0;
        for (int i = n; i >= 0; i--){
            count += buckets[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}
