class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> have = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        boolean canCreate = true;
        for(char c: ransomNote.toCharArray()){
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        for(char c: magazine.toCharArray()){
            have.put(c, have.getOrDefault(c, 0) + 1);
        }

        for(char c: ransomNote.toCharArray()){
            if(!have.containsKey(c) || have.get(c) < need.get(c)){
                return false;
            }
        }

        return true;
    }
}