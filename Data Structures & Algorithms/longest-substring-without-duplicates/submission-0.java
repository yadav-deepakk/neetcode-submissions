class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); 
        int max = 0; 
        int j = 0; 
        for(int i=0; i<s.length(); i++) {
            if(set.add(s.charAt(i))){
                max = Math.max(max, set.size()); 
            }else {
                while(!set.add(s.charAt(i)) && set.size() > 0) {
                    set.remove(s.charAt(j)); 
                    j++; 
                }
            }
        }
        return max; 
    }
}
