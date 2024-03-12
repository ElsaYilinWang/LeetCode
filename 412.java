// LeetCode 412 Fizz Buzz
// Reference: https://leetcode.com/problems/fizz-buzz/solutions/2628136/java-3-approaches-easy/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.ArrayList;

class Solution {
    public List<String> fizzBuzz(int n) {

        // No % method
        List<String> res = new ArrayList<>();

        int i = 1, fizz = 0, buzz = 0;

        while(i <= n){
            fizz++;
            buzz++;

            if (fizz == 3 && buzz == 5){

                res.add("FizzBuzz");
                fizz = buzz = 0;

            } else if (fizz == 3){

                res.add("Fizz");
                fizz = 0;

            } else if (buzz == 5){

                res.add ("Buzz");
                buzz = 0;
            } else {

                res.add(String.valueOf(i));
            }
            
            i++;
        }
        
        return res;
    }
}