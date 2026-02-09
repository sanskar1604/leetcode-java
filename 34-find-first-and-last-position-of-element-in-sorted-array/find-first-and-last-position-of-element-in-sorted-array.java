class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {findFirst(nums, target), findLast(nums, target)};
    }

    public int findFirst(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                res = mid;
                high = mid - 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }

    public int findLast(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                res = mid;
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
}