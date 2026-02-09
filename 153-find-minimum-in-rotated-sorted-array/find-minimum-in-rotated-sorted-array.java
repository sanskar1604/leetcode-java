class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int res = 0;
        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[n - 1] >= nums[mid]){
                res = nums[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return res;
    }
}