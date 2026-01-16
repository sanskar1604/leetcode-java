class Solution {
    public int removeDuplicates(int[] nums) {
        
        int start = 0, end = 1, count = 1;
        
        while(end < nums.length){
            if(nums[end] == nums[end - 1]){
                end++;
                continue;
            }
            nums[start + 1] = nums[end];
            start++;
            end++;
            count++;
        }
        return count;
    }
}