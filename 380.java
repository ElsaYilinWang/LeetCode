// LeetCode 380: Insert Delete GetRandom O(1)
// Reference: https://leetcode.com/problems/insert-delete-getrandom-o1/solutions/4572728/beats-99-84-users-c-java-python-javascript-explained/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean search(int val){
        return map.containsKey(val);
    }

    public boolean insert(int val) {
        if (search(val)) return false;

        list.add(val);
        map.put(val, list.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {
        if (!search(val)){ return false;}

        int index = map.get(val);
        list.set(index, list.get(list.size()-1));
        map.put(list.get(index), index);
        list.remove(list.size()-1);
        map.remove(val);

        return true;   
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */