// LeetCode Zigzag Conversion
// Reference: https://leetcode.com/problems/zigzag-conversion/solutions/3403/easy-to-understand-java-solution/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();

        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];

        for (int i = 0; i < sb.length; i++){
            sb[i] = new StringBuffer();
        }

        int i = 0;
        while (i < len){
            for (int idx = 0; idx < numRows && i < len; idx++){
                // vertically down
                sb[idx].append(c[i++]);
            }
                // obliquely up
            for (int idx = numRows - 2; idx >= 1 && i < len; idx--){

                sb[idx].append(c[i++]);
            }
        }

        for (int idx = 1; idx < sb.length; idx++){
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
        
    }
}
