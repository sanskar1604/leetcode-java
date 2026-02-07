class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        for(char c: text.toCharArray()){
            have.put(c, have.getOrDefault(c, 0) + 1);
        }
        boolean isOdd = false;
        int count = Integer.MAX_VALUE;
        for(char c: need.keySet()){
            if(!have.containsKey(c)){
                return 0;
            }
            count = Math.min(count, have.get(c)/need.get(c));
        }

        return count;
    }
}