class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(i = 0; i < k; i++){
            pq.add(nums[i]);
        }

        for(i = k; i < nums.length; i++){
            if(pq.peek() >= nums[i]){
                continue;
            }
            pq.poll();
            pq.add(nums[i]);
        }

        return pq.peek();
    }
}