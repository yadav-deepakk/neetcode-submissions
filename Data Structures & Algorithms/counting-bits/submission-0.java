class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1]; 
        Arrays.fill(ans, -1); 
        for(int i=0; i<=n; i++){
            if(i==0) ans[i] = 0;
            else if(i==1 || i==2) ans[i] = 1;
            else{
                int j=i;
                while(j>0) {
                    if(ans[j]!=-1){
                        ans[i] += ans[j]; 
                        break; 
                    }
                    if(j%2 == 1) {
                        ans[i] += 1;
                    }
                    j/=2; 
                }
                ans[i]++; 
            }
        }
        return ans;
    }
}
