class Solution {
    public void lookForCombinationSum(
        int i, int total, List<Integer> currList, 
        int[] nums, int target, List<List<Integer>> ans
    ) {
        if(total == target) {
            ans.add(List.copyOf(currList)); 
            return; 
        }
        if(i >= nums.length || total > target) {
            return; 
        }

        currList.add(nums[i]); 
        lookForCombinationSum(i, total+nums[i], currList, nums, target, ans); 
        currList.removeLast(); 
        lookForCombinationSum(i+1, total, currList, nums, target, ans); 

    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> currList = new ArrayList<>(); 
        lookForCombinationSum(0, 0, currList, nums, target, ans); 
        return ans; 
    }

}
