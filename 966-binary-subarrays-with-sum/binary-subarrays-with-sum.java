class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return (binarySum(nums, goal) - binarySum(nums, goal-1));
    }

    public int binarySum(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }
        
        int l = 0, r = 0, sum = 0, count = 0;
        for(r = 0; r < nums.length; r++){
            sum = sum + nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }

            count = count + (r-l+1);
        }

        return count;
    }
}