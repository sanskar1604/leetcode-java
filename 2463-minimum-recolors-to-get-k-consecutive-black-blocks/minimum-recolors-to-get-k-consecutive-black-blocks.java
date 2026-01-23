class Solution {
    public int minimumRecolors(String blocks, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0, minSwap = Integer.MAX_VALUE;

        for(int right = 0; right < blocks.length(); right++){
            map.put(blocks.charAt(right), map.getOrDefault(blocks.charAt(right), 0) + 1);

            while(right - left + 1 > k){
                map.put(blocks.charAt(left), map.get(blocks.charAt(left)) - 1);

                if(map.get(blocks.charAt(left)) == 0){
                    map.remove(blocks.charAt(left));
                }
                left++;
            }

            if(right - left + 1 == k){
                int whites = map.getOrDefault('W', 0);
                minSwap = Math.min(minSwap, whites);
            }
        }

        return minSwap;
    }
}