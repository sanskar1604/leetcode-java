class Solution {
    public int totalFruit(int[] fruits) {
        
        int left = 0, right = 0, maxLen = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int n = fruits.length;
        for(right = 0; right < n; right++){
            freq.put(fruits[right], freq.getOrDefault(fruits[right],0)+1);

            while(freq.size() > 2){
                freq.put(fruits[left], freq.get(fruits[left])-1);

                if(freq.get(fruits[left]) == 0){
                    freq.remove(fruits[left]);
                }
                left++;
            }
            if(freq.size() == 2 || freq.size() < 2){
                maxLen = Math.max(maxLen, right-left+1);
            }
        }
        return maxLen;
    }
}