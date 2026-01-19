class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int res_sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n-2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                int d = Math.abs(target-sum);
                if(d < diff){
                    diff = d;
                    res_sum = sum;
                }
                if(sum == target){
                    return res_sum;
                }else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res_sum;
    }
}