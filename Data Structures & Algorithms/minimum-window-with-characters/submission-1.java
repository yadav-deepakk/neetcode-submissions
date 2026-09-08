class Solution {
    public boolean isValidWindow(int[] tChars, int[] window){
        for(int i=0; i<52; i++){
            if(tChars[i]>window[i]) return false; 
        }
        return true; 
    }

    public String minWindow(String s, String t) {
        if(s.length() < t.length())
            return ""; 

        int[] tChars = new int[52]; 
        for(char c: t.toCharArray()) {
            if('A'<=c && c<='Z' )
                tChars[c-'A']++; 
            else tChars[26+c-'a']++;
        }
 
        int[] window = new int[52];
        int l=0, minLen=Integer.MAX_VALUE, minStart=0; 
        for(int r=0; r<s.length(); r++){
            if('A'<=s.charAt(r) && s.charAt(r)<='Z' )
                window[s.charAt(r) - 'A']++; 
            else window[s.charAt(r)+26 - 'a']++;
            
            while(l<=r && isValidWindow(tChars, window)) { 
                int len = r-l +1;
                if(len<minLen){
                    minLen = Math.min(minLen, len); 
                    minStart = l; 
                } 

                if('A'<=s.charAt(l) && s.charAt(l)<='Z' )
                    window[s.charAt(l) - 'A']--; 
                else window[s.charAt(l)+26 - 'a']--;
                l++; 
            }
        }
        
        return (minLen==Integer.MAX_VALUE) ? "":s.substring(minStart, minStart + minLen); 
    }
}
