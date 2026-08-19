class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(); 
        int minLen = Integer.MAX_VALUE; 

        for(String s : strs) {
            minLen = Math.min(minLen, s.length()); 
        }

        for(int i=0; i<minLen; i++) {
            char c = strs[0].charAt(i); 
            for(String s:strs) {
                if(c != s.charAt(i)) return sb.toString();
            }
            sb.append(c);   
        }

        return sb.toString(); 
    }
}