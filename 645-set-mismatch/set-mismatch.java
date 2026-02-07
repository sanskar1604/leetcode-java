class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int exp = n * (n + 1) / 2;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int sum = 0;
        for(int i: map.keySet()){
            sum += i;
            if(map.get(i) > 1){
                result[0] = i; 
            }
        }
        result[1] = exp - sum;

        return result;
        
    }
}