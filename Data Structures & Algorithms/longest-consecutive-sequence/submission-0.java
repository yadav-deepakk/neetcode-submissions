class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        for(int n: nums) set.add(n); 
        int longest=0; 
        for(int n: set) {
            if(!set.contains(n-1)){
                int current=n+1, count=1; 
                while(set.contains(current)) {
                    count++;
                    current++; 
                }
                longest= Math.max(longest, count); 
            }
        }
        return longest; 
    }
}
