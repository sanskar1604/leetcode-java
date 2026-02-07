class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        for(int i = 0; i < list1.length; i++){
            m1.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < list2.length ; i++){
            if(m1.containsKey(list2[i])){
                int sum = m1.get(list2[i]) + i;

                if(sum < minSum){
                    result.clear();
                    result.add(list2[i]);
                    minSum = sum;
                }else if(sum == minSum){
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}