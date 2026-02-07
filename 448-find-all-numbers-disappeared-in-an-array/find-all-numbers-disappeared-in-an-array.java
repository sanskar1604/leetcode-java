class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int i: nums){
            s.add(i);
        }

        for(int i = 1; i <= n; i++){
            if(s.contains(i)){
                continue;
            }else{
                l.add(i);
            }
        }
        return l;
    }
}