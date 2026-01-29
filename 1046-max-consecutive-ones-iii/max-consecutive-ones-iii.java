class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxLen = 0, zeros = 0;
        for(right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            if(zeros <= k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
}