class Solution {
    public int missingNumber(int[] nums) {
        int sum=0, SUM=0; 
        sum = ((nums.length) * (nums.length +1))/2; 
        for(int n:nums) {
            SUM+=n; 
        }
        return sum - SUM; 
    }
}
