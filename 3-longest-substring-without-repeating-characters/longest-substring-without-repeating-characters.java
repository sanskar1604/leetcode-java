class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            if(map.size() < right-left+1){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }

                left++;
            }else if (map.size() == right-left+1){
                maxLen = Math.max(maxLen, right-left+1);
            }
        }
        return maxLen;
    }
}