class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxFreq = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

            while((right-left+1) - maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            if((right-left+1) - maxFreq <= k){
                maxLen = Math.max(maxLen, (right-left+1));
            }
        }

        return maxLen;
    }
}