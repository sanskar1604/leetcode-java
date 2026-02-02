class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];

        for(int i = n-2; i >= 0; i--){
            st.push(nums[i]);
        }

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && nums[i] >= st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                res[i] = st.peek();
            }else{
                res[i] = -1;
            }
            st.push(nums[i]);
        }
        return res;
    }
}