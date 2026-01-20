class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        int count = 0;

        while(i < arr1.length){
            boolean found = false;
            while(j < arr2.length){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    found = true;
                    break;
                }
                if(arr2[j] > arr1[i]+d){
                    break;
                }
                j++;
            }

            if(!found){
                count++;
            }
            i++;
            j = 0;
        }

        return count;
    }
}