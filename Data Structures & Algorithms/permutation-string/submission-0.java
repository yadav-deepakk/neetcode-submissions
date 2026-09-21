class Solution {
    public boolean checkPermutation(int[] arr1, int[] arr2) {
        for(int i=0; i<arr1.length; i++) 
            if(arr1[i] != arr2[i]) 
                return false; 
        
        return true; 
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false; 
        int[] arr1, arr2; 
        arr1 = new int[26];  
        arr2 = new int[26]; 
        int i=0, j=0; 
        while(j<s1.length()) {
            arr1[s1.charAt(j) - 'a']++; 
            arr2[s2.charAt(j) - 'a']++; 
            j++; 
        }
        if(checkPermutation(arr1, arr2)) return true;
        for(j=s1.length(); j<s2.length(); j++){
            arr2[s2.charAt(i++) - 'a']--; 
            arr2[s2.charAt(j) - 'a']++;
            if(checkPermutation(arr1, arr2)) return true;  
        }
        return false; 
    }
}
