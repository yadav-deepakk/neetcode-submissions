class Solution {

    public boolean isAlphanumeric(char c) {
        return (c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9'); 
    }

    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() -1; 
        while(start <= end) {
            if(!isAlphanumeric(s.charAt(start))) {
                start++; 
            } else if(!isAlphanumeric(s.charAt(end))){
                end--; 
            } else {
                // System.out.println("start: " + s.charAt(start) + ", end: " + s.charAt(end)); 
                if(s.toLowerCase().charAt(end) != s.toLowerCase().charAt(start)) 
                    return false; 
                start++; 
                end--; 
            }
        }
        return true; 
    }
}
