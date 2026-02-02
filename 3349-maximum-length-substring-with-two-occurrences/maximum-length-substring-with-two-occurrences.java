class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),  0) + 1);

            while(map.get(s.charAt(right)) > 2){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}