class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0, element = nums[0]; 
        for (int n: nums) { 
            if(freq == 0) { 
                element = n; 
                freq = 1; 
            } else if(n == element) { 
                freq++; 
            } else { 
                freq--; 
            } 
        } 
        return element;  
    } 
} 