# LeetCode 49 Group Anagrams
# Reference: https://www.youtube.com/watch?v=vzdNOK2oB2E

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) # mapping char count to list of Anagrams

        for s in strs:
            count = [0] * 26 # a ... z

            for c in s:
                count[ord(c) - ord("a")] += 1
            
            res[tuple(count)].append(s)
        
        return res.values()
    
    # Time: O(m * n)