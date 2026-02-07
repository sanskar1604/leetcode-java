class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for(char c: s.toCharArray()){
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()){
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }
        for(char c: m2.keySet()){
            if(!m1.containsKey(c) || m2.get(c) > m1.get(c)){
                return c;
            }
        }

        return ' ';
    }
}