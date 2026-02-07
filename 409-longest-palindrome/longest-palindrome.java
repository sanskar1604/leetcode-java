class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> m1 = new HashMap<>();

        for(char c: s.toCharArray()){
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        boolean isOdd = false;
        int res = 0;
        for(char c: m1.keySet()){
            int count = m1.get(c);
            if(count % 2 == 0){
                res += m1.get(c);
            }else{
                res += count - 1;
                isOdd = true;
            }
        }

        if(isOdd){
            res += 1;
        }

        return res;
    }
}