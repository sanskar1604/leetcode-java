class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        // 1️⃣ Find pivot (index of smallest element)
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int pivot = low; // smallest element index

        // 2️⃣ Binary search in correct half
        if (binarySearch(nums, 0, pivot - 1, target) != -1) {
            return binarySearch(nums, 0, pivot - 1, target);
        }
        return binarySearch(nums, pivot, n - 1, target);
    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
