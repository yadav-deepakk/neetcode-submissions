class Solution {
    public void sortColors(int[] nums) {
        int zeros=0, ones=0, twos=0;
        for(int n : nums) {
            if(n == 0) zeros++;
            if(n == 1) ones++; 
            if(n == 2) twos++; 
        } 
        int i = 0; 
        while(zeros-->0) nums[i++] = 0;
        while(ones-->0) nums[i++] = 1;
        while(twos-->0) nums[i++] = 2;
    }
}