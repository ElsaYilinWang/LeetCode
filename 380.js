// LeetCode 380: Insert Delete GetRandom O(1)
// Reference: https://leetcode.com/problems/insert-delete-getrandom-o1/solutions/4572728/beats-99-84-users-c-java-python-javascript-explained/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions


var RandomizedSet = function() {
    constructor(){
        this.list = [];
        this.map = new Map();
    }
    
};

/** 
 * @param {number} val
 * @return {boolean}
 */
RandomizedSet.prototype.search = function(val){
    return this.map.has(val);
}


RandomizedSet.prototype.insert = function(val) {
    if(this.search(val)) return false;

    this.list.push(val);
    this.map.set(val, this.list.length-1);
    return true;
    
};

/** 
 * @param {number} val
 * @return {boolean}
 */
RandomizedSet.prototype.remove = function(val) {
    if (!this.search(val)) return false;

    const index = this.map.get(val);
    this.list[index] = this.list[this.list.length-1];
    this.map.set(this.list[index], index);
    this.list.pop();
    this.map.delete(val);
    return true;
    
};

/**
 * @return {number}
 */
RandomizedSet.prototype.getRandom = function() {
    const randomIndex = Math.floor(Math.random()*this.list.length);
    return this.list[randomIndex];
    
};

/** 
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = new RandomizedSet()
 * var param_1 = obj.insert(val)
 * var param_2 = obj.remove(val)
 * var param_3 = obj.getRandom()
 */