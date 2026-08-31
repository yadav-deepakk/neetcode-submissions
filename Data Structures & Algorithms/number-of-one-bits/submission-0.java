class Solution {
    public int hammingWeight(int n) {
        int bit = 0;
        while(n>0){
            if(n%2 != 0) bit++; 
            n /= 2;
        }
        return bit; 
    }
}
