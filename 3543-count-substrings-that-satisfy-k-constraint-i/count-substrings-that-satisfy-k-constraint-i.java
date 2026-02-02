class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0, right  = 0, count = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('1', 0);
        map.put('0', 0);
        for(right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while(map.get('0') > k && map.get('1') > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            count += right-left+1;
        }
        return count;
    }
}