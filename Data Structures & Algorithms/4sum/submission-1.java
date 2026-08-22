class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>(); 
        Arrays.sort(nums); 

        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue; 
            for(int j=i+1; j<nums.length; j++) {
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int l=j+1, h=nums.length-1; 
                while(l<h) {
                    if((long) nums[i] + nums[j] + nums[l] + nums[h] == target) {
                        ans.add(List.of(nums[i], nums[j], nums[l], nums[h])); 
                        l++;
                        h--;
                        while(l<h && nums[l] == nums[l-1]) l++; 
                        while(l<h && nums[h] == nums[h+1]) h--; 
                    } else if(nums[i] + nums[j] + nums[l] + nums[h] < target){
                        l++; 
                    } else h--; 
                } 
            }
        }

        return ans; 
    }
}