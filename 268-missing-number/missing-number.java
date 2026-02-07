class Solution {
    public int missingNumber(int[] nums) {
        int actual_sum = 0;
        int n = nums.length;
        int expected_sum = n * (n + 1)/2;

        for(int num: nums){
            actual_sum += num;
        }

        return expected_sum - actual_sum;
    }
}