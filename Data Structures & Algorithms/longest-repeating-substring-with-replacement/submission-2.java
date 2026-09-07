class Solution {
    public int characterReplacement(String s, int k) { 
        int[] charFreq = new int[26]; 
        int left = 0, longest = 0, count = 0; 
        for(int right = 0; right<s.length(); right++) {
            charFreq[s.charAt(right) - 'A']++; 
            count++; 
            int max = 0; 
            for(int i = 0; i<26; i++) 
                max = Math.max(max, charFreq[i]); 
            if(count - max <= k) {
                longest = Math.max(count, longest); 
            } else {
                while(left<=right && count-max > k) {
                    charFreq[s.charAt(left) - 'A']--;
                    left++;
                    count--; 
                }
            }
        }
        return longest; 
    }
} 
